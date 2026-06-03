package collectionsPhase2ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.concurrent.ThreadLocalRandom;


public class Program18ArrayListSearchUsingContains 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to search for an element in the arraylist using contains method ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			createArrayList();
		}
		else
		{
			System.out.println("Exiting..");
			return;
		}
		
		printArrayList();
		
		System.out.print("Enter the element you want to search in the arraylist : ");
		if ( arrListInt != null )
		{
			int searchElement = sc.nextInt();
			searchIntElementUsingContains(searchElement);
		}
		else if ( arrListStr != null )
		{
			sc.nextLine();
			String searchElement = sc.nextLine();
			searchStrElementUsingContains(searchElement);
		}
	}
	
	public static void createArrayList()
	{
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrListCreateOption = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int arrListLength = sc.nextInt();
		
		if ( arrListCreateOption == 1 )
		{
			arrListIntCreation( arrListLength );
		}
		else if ( arrListCreateOption == 2 )
		{
			arrListStrCreation( arrListLength );
		}
		else
		{
			System.out.println("The input for the type of arraylist craeation is not specified by the admin.");
			System.out.println("So exiting the program.");
			return;
		}
	}
	
	public static void arrListIntCreation( int length )
	{
		arrListInt = new ArrayList<Integer>();
		
		if ( length > 0 )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
				arrListInt.add(sc.nextInt());
			}
		}
		else 
		{
			System.out.println("The number of elements you want to insert is out of the range of the size of arraylist.");
			System.out.println("So exiting the program.");
			return;
		}
	}
	
	public static void arrListStrCreation( int length )
	{
		arrListStr = new ArrayList<String>();
		if ( length > 0 )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
				if ( i == 0 )
				{
					sc.nextLine();
				}
				arrListStr.add(sc.nextLine());
			}
		}
		else 
		{
			System.out.println("The number of elements you want to insert is out of the range of the size of arraylist.");
			System.out.println("So exiting the program.");
			return;
		}
	}
	
	public static void printArrayList()
	{
//		int random = ThreadLocalRandom.current().nextInt(0, 4);
		System.out.println("Now we are printing the ArrayList and as of now we have 4 ways of traversing through the ArrayList.");
		System.out.println("Pick anyone way to traverse through arraylist print the elements in the arraylist.");
		System.out.println("1 - For Loop");
		System.out.println("2 - Advanced For Loop / For Each Loop");
		System.out.println("3 - Iterator");
		System.out.println("4 - Println Method");
		int random = sc.nextInt();
		if ( arrListInt != null )
		{
			if ( random == 1 )
			{
				for ( int i = 0 ; i < arrListInt.size() ; i++ )
				{
					System.out.print(arrListInt.get(i)+" , ");
				}
			}
			else if ( random == 2 )
			{
				for ( int i : arrListInt )
				{
					System.out.print(i+ " , ");
				}
			}
			else if ( random == 3 )
			{
				Iterator<Integer> arrListIntIterator = arrListInt.iterator();
				while ( arrListIntIterator.hasNext() )
				{
					System.out.print(arrListIntIterator.next()+" , ");
				}
			}
			else if ( random == 4 )
			{
				System.out.print(arrListInt);
			}
			else
			{
				System.out.println("You have entered the wrong input to print the arraylist.");
				return;
			}
		}
		else if ( arrListStr != null )
		{
			if ( random == 1 )
			{
				for( int i = 0 ; i < arrListStr.size() ; i++ )
				{
					System.out.print(arrListStr.get(i)+" , ");
				}
			}
			else if ( random == 2 )
			{
				for ( String str : arrListStr )
				{
					System.out.print(str+" , ");
				}
			}
			else if ( random == 3 )
			{
				Iterator<String> arrListStrIterator = arrListStr.iterator();
				while ( arrListStrIterator.hasNext() )
				{
					System.out.print(arrListStrIterator.next()+" , ");
				}
			}
			else if ( random == 4 )
			{
				System.out.print(arrListStr);
			}
			else
			{
				System.out.println("You have entered the wrong input to print the arraylist.");
				return;
			}
		}
		System.out.println();
	}
	
	public static void searchIntElementUsingContains( int searchElement )
	{
		if ( arrListInt.contains(searchElement) )
		{
			System.out.println("The element you are searching is present in the arraylist.");
		}
		else 
		{
			System.out.println("The element you are searching is NOT present in the arraylist.");
		}
	}
	
	public static void searchStrElementUsingContains( String searchElement )
	{
		if ( arrListStr.contains(searchElement) )
		{
			System.out.println("The element you are searching is present in the arraylist.");
		}
		else 
		{
			System.out.println("The element you are searching is NOT present in the arraylist.");
		}
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
