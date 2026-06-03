package collectionsPhase0;

import java.util.Scanner;

public class Program3CopyArrayElements 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for ( int i = 0 ; i < length ; i++ )
		{
			arr[i] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < arr.length ; i++ )
		{
			System.out.print(arr[i] + " ");
		}
		
		int[] copyArr = new int[arr.length];
		
		for ( int i = 0 ; i < copyArr.length ; i++ )
		{
			copyArr[i] = arr[i];
		}
		
		for( int num : copyArr )
		{
			System.out.print(num + " ");
		}
		
		sc.close();
		
	}
	
}
