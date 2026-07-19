package collectionsPhase3LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class Program21RemoveFirstandLastInLinkedList 
{
	static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt;
	static LinkedList<String> linListStr;
	
	public static void main( String[] args )
	{
		System.out.println("Do you want to create a LinkedList : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			
			if ( linListInt != null || linListStr != null )
			{
				removeFirstAndLastElements();
			}
			
//			if ( linListInt != null )
//			{
//				removeFirstAndLastElements();
//			}
//			else if ( linListStr != null )
//			{
//				removeFirstAndLastElements();
//			}
		}
	}
	
	public static void createLinkedList()
	{
		System.out.print("Enter the number of elements you want to insert into the linkedlist : ");
		int length = sc.nextInt();
		
		if ( length < 1 )
		{
			System.out.println("The input you entered to create the linkedlist is invalid.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		
		System.out.print("Enter the type of linkedlist you want to create ( 1 -  Integer / 2 - String ) : ");
		int linkedListCreationOption = sc.nextInt();
		
		if ( linkedListCreationOption != 1 && linkedListCreationOption != 2 )
		{
			System.out.println("You have entered an invalid input to create an arraylist.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		else if ( linkedListCreationOption == 1 )
		{
			linListInt = new LinkedList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				linListInt.add(sc.nextInt());
			}
		}
		else
		{
			linListStr = new LinkedList<String>();
			for ( int i = 0 ; i < length ; i++ )
			{
				if ( i == 0 )
				{
					sc.nextLine();
				}
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				linListStr.add(sc.nextLine());
			}
		}
	}
	
	public static void removeFirstAndLastElements()
	{
		if ( linListInt != null && linListInt.size() >= 2)
		{
			System.out.println("The linkedlist before removing the first and last elements : "+linListInt);
			System.out.print("Do you want to remove the first and last elements in the linkedlist ( YES / NO ) : ");
			if ( yesNoOption( sc.next() ) )
			{
				linListInt.removeFirst();
				linListInt.removeLast();
				System.out.println("The linkedlist after removing the first and last elements : "+linListInt);
			}
			else
			{
				System.out.println("As you don't want to remove the elements from the linkedlist.");
				System.out.println("Exiting from the program.");
//				System.exit(0);
				return;
			}
		}
		else if ( linListStr.size() >= 2 )
		{
			System.out.println("The linkedlist before removing the first and last elements : "+linListStr);
			System.out.print("Do you want to remove the first and last elements in the linkedlist ( YES / NO ) : ");
			if ( yesNoOption( sc.next() ) )
			{
				linListStr.removeFirst();
				linListStr.removeLast();
				System.out.println("The linkedlist after removing the first and last elements : "+linListStr);
			}
			else
			{
				System.out.println("As you don't want to remove the elements from the linkedlist.");
				System.out.println("Exiting from the program.");
//				System.exit(0);
				return;
			}
		}
		else
		{
			System.out.println("The linkedlist that is created is not useful to perform first and last elements removal action.");
			System.out.println("Because the size of the linkedlist is less than 2.");
			System.out.println("So exiting the program.");
//			System.exit(0);
			return;
		}
	}
	
	public static boolean yesNoOption ( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("y") )
		{
			return true;
		}
		return false;
	}
	
}
