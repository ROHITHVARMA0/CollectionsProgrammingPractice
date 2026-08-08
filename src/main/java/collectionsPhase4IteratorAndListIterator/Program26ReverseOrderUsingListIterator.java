package collectionsPhase4IteratorAndListIterator;

import java.util.Scanner;
import java.util.ListIterator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class Program26ReverseOrderUsingListIterator 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to create a LinkedList to traverse in ReverseOrder using ListIterator ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList(sc);
		}
		sc.close();
	}
	
	public static void createLinkedList(Scanner sc)
	{
		List<Integer> linList = new LinkedList<Integer>();
		
		System.out.print("Enter the number of elements you want to insert into the LinkedList : ");
		int length = 0;
		try
		{
			length = sc.nextInt(); 
		}
		catch (InputMismatchException e)
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
				System.out.print("Enter the "+(i+1)+"th element to insert into the list : ");
				int num = sc.nextInt();
				linList.add(num);
			}
			catch ( InputMismatchException e )
			{
				System.out.println("As you have entered an invalid input, stopping the execution of the program.");
				return;
			}
		}
		reverseTraversalUsingListIterator(linList);
	}
	
	public static void reverseTraversalUsingListIterator( List<Integer> linList )
	{
		int size = linList.size();
		ListIterator<Integer> linListItr = linList.listIterator(size);
		System.out.println("The LinkedList : "+linList);
		
		System.out.println("The linkedList while doing reverse traversal : ");
		while( linListItr.hasPrevious() )
		{
			System.out.println("The "+(size)+"th element : "+linListItr.previous());
			size--;
		}
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
