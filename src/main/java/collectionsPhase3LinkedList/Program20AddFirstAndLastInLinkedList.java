package collectionsPhase3LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class Program20AddFirstAndLastInLinkedList 
{
	static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt;
	static LinkedList<String> linListStr;
	
	public static void main ( String[] args )
	{
		System.out.print("Do you want to create a LinkedList : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			
			if ( linListInt != null )
			{
				intAddElementsAtFirstAndLast();
			}
			else if ( linListStr != null )
			{
				strAddElementsAtFirstAndLast();
			}
			
//			if ( linListInt != null || linListStr != null )
//			{
//				addElementsAtFirstAndLast();
//			}
//			if ( linListInt == null && linListStr == null )
//			{
//				System.out.println("As the linkedlist is null cannot perform the specific actions.");
//
//			}
//			else
//			{
//				addElementsAtFirstAndLast();
//			}
		}
	}
	
	public static void createLinkedList()
	{
		System.out.print("Enter the number of elements you want to insert into the linkedlist : ");
		int length = sc.nextInt();
		sc.nextLine();
		
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
			System.out.println("You have enetered an invalid input to create an arraylist.");
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
//				if ( i == 0 )
//				{
//					sc.nextLine();
//				}
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				linListStr.add(sc.nextLine());
			}
		}
	}
	
	public static void intAddElementsAtFirstAndLast()
	{
//		if ( linListInt != null )
//		{
			System.out.println("The linkedlist before adding the new last and first elements : "+linListInt);
			System.out.print("Enter the element you want to insert as the first element into the linkedlist : ");
			linListInt.addFirst(sc.nextInt());
//			linListInt.add(0, sc.nextInt());
			System.out.print("Enter the element you want to insert as the last element into the linkedlist : ");
			linListInt.addLast(sc.nextInt());
//			linListInt.add(sc.nextInt());
			System.out.println("The linkedlist after adding the new last and first elements : "+linListInt);
//		}
//		else
//		{
//			System.out.println("The linkedlist before adding the new last and first elements : "+linListStr);
//			sc.nextLine();
//			System.out.print("Enter the element you want to insert as the first element into the linkedlist : ");
//			linListStr.addFirst(sc.nextLine());
////			linListStr.add(0, sc.nextLine());
//			System.out.print("Enter the element you want to insert as the last element into the linkedlist : ");
//			linListStr.addLast(sc.nextLine());
////			linListStr.add(sc.nextLine());
//			System.out.println("The linkedlist after adding the new last and first elements : "+linListStr);
//		}
	}
	
	public static void strAddElementsAtFirstAndLast()
	{
		System.out.println("The linkedlist before adding the new last and first elements : "+linListStr);
		sc.nextLine();
		System.out.print("Enter the element you want to insert as the first element into the linkedlist : ");
		linListStr.addFirst(sc.nextLine());
//		linListStr.add(0, sc.nextLine());
		System.out.print("Enter the element you want to insert as the last element into the linkedlist : ");
		linListStr.addLast(sc.nextLine());
//		linListStr.add(sc.nextLine());
		System.out.println("The linkedlist after adding the new last and first elements : "+linListStr);
	}
	
	public static boolean yesNoOption ( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
