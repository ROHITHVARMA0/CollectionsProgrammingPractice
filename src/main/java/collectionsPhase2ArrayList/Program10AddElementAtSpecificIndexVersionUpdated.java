package collectionsPhase2ArrayList;

import java.util.Scanner;

public class Program10AddElementAtSpecificIndexVersionUpdated 
{
	
	static Scanner sc  = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("Enter the type of ArrayList you want to create ");
		System.out.println("1 - Integer");
		System.out.println("2 - String");
//		System.out.println("3 - Object");
		int arrListCreateOption = sc.nextInt();
		
		
		
		if( arrListCreateOption == 1 )
		{
			CreateIntArrayList.main(null); 
		}
		else if ( arrListCreateOption == 2 )
		{
			CreateStrArrayList.main(null);
		}
		else if ( arrListCreateOption == 3 )
		{
			CreateObjectArrayList.main(null);
		}
		else
		{
			System.out.println("You have given a wrong input.");
			System.out.println("So exiting the program.");
			System.exit(0);
		}
		
		
	}
	
}
