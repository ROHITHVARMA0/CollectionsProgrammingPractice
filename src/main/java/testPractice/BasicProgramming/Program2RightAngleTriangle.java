package testPractice.BasicProgramming;

import java.util.Scanner;

public class Program2RightAngleTriangle 
{
	
	public static void main( String[] args )
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the numer of columns : ");
		int columns = sc.nextInt();
		
		for ( int i = 0 ; i < rows ; i++ )
		{
			for ( int j  = 0 ; j < columns ; j++ )
			{
				if ( i + j >= rows - 1 ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		
		sc.close();
		
	}
	
}
