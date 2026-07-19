package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program13SortUsingBuiltInMethods 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to create an arraylist ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			createArrayList();
		}
		else
		{
			System.out.println("Exiting..");
			return;
		}
		if ( ( arrListInt == null || arrListInt.isEmpty() ) && ( arrListStr == null || arrListStr.isEmpty() ) ) 
		{
			System.out.println("ArrayList is empty. Nothing to sort.");
			return;
		}
		else
		{
			if ( arrListInt != null )
			{
				System.out.println("\nOriginal ArrayList: " + arrListInt);
				System.out.print("Sorted ArrayList using Sort method : ");
				arrListInt.sort(null);
				System.out.println(arrListInt);
				System.out.print("Sorted ArrayList using Collections Sort Method : ");
				Collections.sort(arrListInt);
				System.out.println(arrListInt);
			}
			else if ( arrListStr != null )
			{
				System.out.println("\nOriginal ArrayList: " + arrListStr);
				System.out.print("Sorted ArrayList using Sort method : ");
				arrListStr.sort(null);
				System.out.println(arrListStr);
				System.out.print("Sorted ArrayList using Collections Sort Method : ");
				Collections.sort(arrListStr);
				System.out.println(arrListStr);
			}
		}
		
	}
	
	public static void createArrayList()
	{
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayListCreateOption = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int arrayListLength = sc.nextInt();
		
		if ( arrayListCreateOption == 1 )
		{
			intArrayListCreation( arrayListLength );
		}
		else if ( arrayListCreateOption == 2 )
		{
			strArrayListCreation( arrayListLength );
		}
		else
		{
			System.out.println("The input for the type of arraylist craeation is not specified by the admin.");
			System.out.println("So exiting the program.");
			return;
		}
	}
	
	public static void intArrayListCreation( int length )
	{
		arrListInt = new ArrayList<Integer>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
			arrListInt.add(sc.nextInt());
		}
		
//		if ( arrListInt.size() > 1 && arrListInt != null )
//		{
//			intArrayListSorting();
//		}
	}
	
	
	public static void strArrayListCreation( int length )
	{
		arrListStr = new ArrayList<String>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
			if ( i == 0 )
			{
				sc.nextLine();
			}
			arrListStr.add(sc.nextLine());
		}
//		if ( arrListStr.size() > 1 && arrListStr != null )
//		{
//			strArrayListSorting();
//		}
	}
	
	public static void intArrayListSorting()
	{
		arrListInt.sort(null);
		System.out.println("The arraylist after sorting using built-in sort method : "+arrListInt);
	}
	
	public static void strArrayListSorting()
	{
		arrListStr.sort(null);
		System.out.println("The arraylist after sorting using built-in sort method : "+arrListStr);
	}
	
	public static boolean yesNoOption( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
