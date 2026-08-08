package collectionsPhase4IteratorAndListIterator;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Program25RemoveElementsWhileIterating 
{
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to create a Lists to remove elements while iterating ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLists(sc);
		}
		sc.close();
	}
	
	public static void createLists( Scanner sc )
	{
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> linList = new LinkedList<Integer>();
		
		System.out.print("Enter the number of elements you want to insert into the list : ");
		int length = 0 ;
		try
		{
			length = sc.nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println("You have entered an invalid input, so stopping the execution of the program.");
			return;
		}
		if ( length < 1 )
		{
			System.out.println("You have entered an invalid input, so stopping the execution of the program.");
			return;
		}
		
		for ( int i = 0 ; i < length ; i++ )
		{
			try 
			{
				System.out.print("Enter the "+(i+1)+"th element to insert into the list : ");
				int num = sc.nextInt();
				arrList.add(num);
				linList.add(num);
			}
			catch ( InputMismatchException e )
			{
				System.out.println("You have entered an invalid input, so stopping the execution of the program.");
				return;
			}
		}
		removeElementsFromLists(arrList, linList);
	}
	
	public static void removeElementsFromLists(List<Integer> arrList , List<Integer> linList )
	{
//		Iterator<Integer> arrListItr = arrList.iterator();
//		Iterator<Integer> linListItr = linList.iterator();
		
		System.out.println("The elements of the ArrayList Iterator before remove elements while iterating : "+arrList);
		System.out.println("The elements of the LinkedList Iterator before remove elements while iterating : "+linList);
		
//		System.out.print("The elements of the ArrayList Iterator before remove elements while iterating : ");
//		arrListItr.forEachRemaining(item -> System.out.print(item + " "));
//		System.out.print("\nThe elements of the LinkedList Iterator before remove elements while iterating : ");
//		linListItr.forEachRemaining(item -> System.out.print(item + " "));
		
		//Create fresh iterators
//		arrListItr = arrList.iterator();
//		linListItr = linList.iterator();
		
//		while ( arrListItr.hasNext() )
//		{
//			arrListItr.next();
//			arrListItr.remove();
//		}
//		
//		while ( linListItr.hasNext() )
//		{
//			linListItr.next();
//			linListItr.remove();
//		}
		
		removeEvenListElements(arrList);
		removeEvenListElements(linList);
		
		System.out.println("The elements of the ArrayList Iterator after remove elements while iterating : "+arrList);
		System.out.println("The elements of the LinkedList Iterator after remove elements while iterating : "+linList);
		
		
//		System.out.print("\nThe elements of the ArrayList Iterator after remove elements while iterating : ");
//		arrListItr.forEachRemaining(item -> System.out.print(item + " "));
//		System.out.println("\nThe elements of the LinkedList Iterator after remove elements while iterating : ");
//		linListItr.forEachRemaining(item -> System.out.print(item + " "));

	}
	
	public static void removeEvenListElements(List<Integer> list)
	{
		Iterator<Integer> itr = list.iterator();
		
		while ( itr.hasNext() )
		{
			if ( itr.next() % 2 == 0 )
			{
				itr.remove();
			}
//			itr.next();
//			itr.remove();
		}
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
