package collectionsPhase3LinkedListPracticeQuestions;

import java.util.LinkedList;
import java.util.Scanner;

public class Program3SearchElement 
{
	static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt;
	static LinkedList<String> linListStr;
	
	public static void main ( String[] args )
	{
		System.out.print("Do you want to create a LinkedList ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			if ( linListInt != null )
			{
				intSearchElement();
			}
			else if ( linListStr != null )
			{
				strSearchElement();
			}
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
				if ( i == 0 )
				{
					sc.nextLine();
				}
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				linListStr.add(sc.nextLine());
			}
		}
	}
	
	public static void intSearchElement()
	{
		System.out.print("Enter the integer element to search whether it is present in the LinkedList or not : ");
		int searchElement = sc.nextInt();
		if ( linListInt.contains(searchElement) )
		{
			System.out.println("The integer that you want to search "+searchElement+" is present in the LinkedList.");
		}
		else
		{
			System.out.println("The element "+searchElement+" is not present in the LinkedList.");
		}
	}
	
	public static void strSearchElement()
	{
		System.out.print("Enter the integer element to search whether it is present in the LinkedList or not : ");
		String searchElement = sc.nextLine();
		if ( linListStr.contains(searchElement) )
		{
			System.out.println("The string that you want to search "+searchElement+" is present in the LinkedList.");
		}
		else
		{
			System.out.println("The element "+searchElement+" is not present in the LinkedList.");
		}
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
