package testPractice.BasicProgramming;

import java.util.Scanner;

public class Program1StarPattern
{
	public static void main ( String[] args ) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the numer of columns : ");
		int columns = sc.nextInt();
		
		for ( int i = 0 ; i < rows  ; i++ ) 
		{
			for ( int j = 0 ; j < columns -1 ; j++ )
			{
				System.out.print("* ");
			}
			System.out.print("*\n");
		}
		
		sc.close();
		
	}
}