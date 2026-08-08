package collectionsPhase4IteratorAndListIterator;

import java.util.Scanner;
import java.util.List;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program27AddElementsUsingListIterator 
{
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a LinkedList and add elements while using ListIterator ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			createList(sc);
		}
		sc.close();
	}
	
	public static void createList(Scanner sc)
	{
		List<Integer> linList = new LinkedList<Integer>();
		System.out.print("Enter the number of elements you want to insert into the List : ");
		int length = 0 ;
		try
		{
			length = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		if ( length < 1 )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		for ( int i = 0 ; i < length ; i++ )
		{
			try
			{
				System.out.print("Enter the "+(i+1)+"th element : ");
				int num = sc.nextInt();
				linList.add(num);
			}
			catch ( InputMismatchException e )
			{
				System.out.println("You have entered an invalid input for the integer input variable, so stopping the execution of the program.");
				return;
			}
		}
		addElementsUsingListIterator(linList, sc);
	}
	
	public static void addElementsUsingListIterator( List<Integer> linList , Scanner sc )
	{
		System.out.println("The LinkedList before iterating through and adding elements : "+linList);
		ListIterator<Integer> linListItr = linList.listIterator();
		
		while ( linListItr.hasNext() )
		{
			System.out.print("Do you want to add element while iterating through the List ( YES / NO ) : ");
			if ( yesNoOption( sc.next() ) )
			{
				System.out.print("Enter the element to insert into the List : ");
				try
				{
					int num = sc.nextInt();
					linListItr.add(num);
				}
				catch ( InputMismatchException e )
				{
					System.out.println("Invalid element entered as an input.");
					return;
				}
			}
			linListItr.next();
		}
		System.out.print("Do you want to add an element at the end of the List ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.print("Enter the element to insert into the List : ");
			try
			{
				int num = sc.nextInt();
				linListItr.add(num);
			}
			catch ( InputMismatchException e )
			{
				System.out.println("Invalid element entered as an input.");
				return;
			}
		}
		System.out.println("The LinkedList after iterating through and adding elements : "+linList);
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
