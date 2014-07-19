import java.util.Scanner;
import java.util.Arrays;
public class Arr
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Findmax fMax = new Findmax();
		
		
		int max = 0;
		int input = 0;
		
		System.out.print("please key in the array`s length:");
		fMax.setLength(scanner.nextInt()) ;
		int[] arr = new int[fMax.getLength()];
		
		
		for(int i = 0; i < fMax.getLength(); i++)
		{
			System.out.print("please key in the number to the array:");
			input = scanner.nextInt();
			arr[i] = input;
		}
		fMax.crossArr(arr);
	}		
}

class Findmax
{
	private int length;
	int max = 0;
	
	public void setLength(int len)
	{
		length = len;
	}
	public int getLength()
	{
		return length;
	}
	
	void crossArr(int[] arr)
	{
		int[] arr2 = new int[length];
		for(int i = 0; i < arr.length ; i++)
		{
			if(i == 0)
			{
				arr2[0] = arr[0];
			}
			else if(arr[i] == 0 )
			{
				arr2[i] = 0;
				if(i != (length-1))
				{
					arr2[i+1] = arr[i+1];
				}
				i = i + 1 ;

			}
			else
				arr2[i] = arr[i] * arr2[i-1]; 	
		}
		 Arrays.sort(arr2);
		
		
		for(int i = (length-1); i >= 0 ; i--)
		{
			if(i == (length-1))
			{
				arr[i] = arr[i];
				
			}
			else if(arr[i] == 0)
			{
				
				arr[i] = 0;
				if(i != 0)
				{
					arr[i-1] = arr[i-1];
					
				}
				i = i - 1 ;
			}
			else
				arr[i] = arr[i] * arr[i+1]; 	
		}
		 Arrays.sort(arr);
		 if(arr2[length-1]>arr[length-1] )
			{	
			 	
				max = arr2[length-1];
				outputMax(max);
			}
			else
			{
				max = arr[length-1];
				outputMax(max);
			}
	}
	void outputMax(int max)
	{
		System.out.println("the Max:"+max);
	}
}
