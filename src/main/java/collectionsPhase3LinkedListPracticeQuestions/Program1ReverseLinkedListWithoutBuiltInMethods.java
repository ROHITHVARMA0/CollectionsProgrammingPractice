package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program1ReverseLinkedListWithoutBuiltInMethods 
{
	static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt;
	static LinkedList<String> linListStr;
	
	public static void main(String[] args)
	{
		System.out.println("Do you want to create an linkedlist to reverse it without the usage of the built-in method ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			if ( ( linListInt!= null && linListInt.size() <= 1 ) || ( linListStr != null && linListStr.size() <= 1 ) )
			{
				System.out.println("As the size of linkedlist is 1 or linkedlist is empty.\n No need of reversing the linkedlist.");
				return;
			}
			else
			{
				reverseLinkedListWithoutBuiltInMethods();
			}
		}	
		else
		{
			System.out.println("As you don't want to create a linkedlist to experiment on how to reverse it without using built-in methods.");
			System.out.println("So no need of executing the program so decided to stop the execution of the program.");
			System.exit(0);
		}
	}
	
	public static void createLinkedList()
	{
		System.out.println("Enter the number of elements you want to insert into the linkedlist : ");
		int length = sc.nextInt();
		if ( length < 1 )
		{
			System.out.println("As you have eneterd an invalid input to create a linkedlist\nExiting the program.");
			return;
		}
		
		System.out.print("Enter the type of linkedlist you want to create ( 1 - Integer / 2 - String ) : ");
		int linkedListCreationType = sc.nextInt();
		
		if ( linkedListCreationType == 1 )
			intLinkedListCreation(length);
		else if ( linkedListCreationType == 2 )
			strLinkedListCreation(length);
		else
			System.out.println("As you have eneterd an invalid input.\nExiting the program.");
			return;
	}
	
	public static void intLinkedListCreation(int length)
	{
		linListInt = new LinkedList<Integer>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
			linListInt.add(sc.nextInt());
		}
		System.out.println("The Original LinkedList : "+linListInt);
	}
	
	public static void strLinkedListCreation( int length )
	{
		linListStr = new LinkedList<String>();
		sc.nextLine();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
			linListStr.add(sc.nextLine());
		}
		System.out.println("The Original LinkedList : "+linListStr);
	}
	
	public static void reverseLinkedListWithoutBuiltInMethods()
	{
		System.out.print("Printing the actual linkedlist in reverse using for loop : ");
		if ( linListInt != null )
		{
			for ( int i = linListInt.size() - 1 ; i > 0 ; i-- )
			{
				System.out.print(linListInt.get(i)+" , ");
			}
			System.out.print(linListInt.get(0));
		}
		else if ( linListStr != null )
		{
			for ( int i = linListStr.size() - 1 ; i > 0 ; i-- )
			{
				System.out.print(linListStr.get(i)+" , ");
			}
			System.out.print(linListStr.get(0));
		}
		
		System.out.println();
		System.out.print("Printing the actual linkedlist in reverse using the ListIterator : ");
		if ( linListInt != null )
		{
			ListIterator<Integer> intListItr = linListInt.listIterator(linListInt.size());
			while(intListItr.hasPrevious())
			{
				System.out.print(intListItr.previous()+" , ");
			}
		}
		else if ( linListStr != null )
		{
			ListIterator<String> intListStr = linListStr.listIterator(linListStr.size());
			while(intListStr.hasPrevious())
			{
				System.out.print(intListStr.previous()+" , ");
			}
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
