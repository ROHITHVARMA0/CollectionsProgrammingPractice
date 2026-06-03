package collectionsPhase0;

import java.util.Scanner;

public class Program1Array5Print {
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for ( int i = 0 ; i < length ; i++ ) 
		{
			
			arr[i] = sc.nextInt();
			
		}
		
		for ( int num : arr)
		{
			System.out.print(num+" ");
		}
		
		sc.close();
		
	}

}
