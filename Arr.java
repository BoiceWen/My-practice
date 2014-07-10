import java.util.Scanner;
import java.util.Arrays;
public class Arr
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		//int[] arr = new int[]{2,7,0,2,3,8,-6,5};
		//int[] arr2 = new int[8];
		int length = 0;
		int max = 0;
		int input = 0;
		
		System.out.print("please key in the array`s length:");
		length = scanner.nextInt();
		int[] arr = new int[length];
		int[] arr2 = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			System.out.print("please key in the number to the array:");
			input = scanner.nextInt();
			arr[i] = input;
		}
		
		
		for(int i = 0; i < arr.length ; i++)
		{
			if(i == 0)
			{
				arr2[0] = arr[0];
			}
			else if(arr[i] == 0)
			{
				arr2[i] = 0;
				arr2[i+1] = arr[i+1];
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
				arr[i-1] = arr[i-1];
				i = i - 1 ;
			}
			else
				arr[i] = arr[i] * arr[i+1]; 	
		}
		 Arrays.sort(arr);
		
		if(arr2[length-1]>arr[length-1] )
		{	
			max = arr2[length-1];
			System.out.println("the Max:"+max);
		}
		else
		{
			max = arr[length-1];
			System.out.println("the Max:"+max);
		}
	}
}