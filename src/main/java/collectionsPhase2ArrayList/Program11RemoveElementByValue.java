package collectionsPhase2ArrayList;

import java.util.Scanner;

public class Program11RemoveElementByValue 
{
	static Scanner sc  = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("Enter the type of ArrayList you want to create ");
		System.out.println("1 - Integer");
		System.out.println("2 - String");
		int arrListCreateOption = sc.nextInt();
		
		
		
		if( arrListCreateOption == 1 )
		{
			CreateIntArrayList.main(args); 
			System.out.print("Enter a value to remove from the ArrayList : ");
			int val = sc.nextInt();
			
			removeElementByValue(val);
			
		}
		else if ( arrListCreateOption == 2 )
		{
			CreateStrArrayList.main(args);
			System.out.print("Enter a value to remove from the ArrayList : ");
			sc.nextLine();
			String val = sc.nextLine();
			
			removeElementByValue(val);
		}
		else
		{
			System.out.println("You have given a wrong input.");
			System.out.println("So exiting the program.");
			System.exit(0);
		}
		
	}	
	
	public static void removeElementByValue( Object obj )
	{
		if(  CreateIntArrayList.arrListInt != null && CreateIntArrayList.arrListInt.contains(obj) )
		{
			System.out.println("The ArrayList before removing the element  is ");
			CreateIntArrayList.printArrayList();
			CreateIntArrayList.arrListInt.remove(obj);
			System.out.println("The ArrayList after removing the element is ");
			CreateIntArrayList.printArrayList();
		}
		else if( CreateStrArrayList.arrListStr != null && CreateStrArrayList.arrListStr.contains(obj) )
		{
			System.out.println("The ArrayList before removing the element  is ");
			CreateStrArrayList.printArrayList();
			CreateStrArrayList.arrListStr.remove(obj);
			System.out.println("The ArrayList after removing the element is ");
			CreateStrArrayList.printArrayList();
		}
		else 
		{
			System.out.println("The element you want to remove from the arraylist does not exist in the arraylist.");
		}
	}
	
	
}
