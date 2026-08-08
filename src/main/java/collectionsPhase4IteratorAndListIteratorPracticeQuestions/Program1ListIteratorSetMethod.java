package collectionsPhase4IteratorAndListIteratorPracticeQuestions;

import java.util.Scanner;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Program1ListIteratorSetMethod 
{
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to create a List to use the set method on the List ( YES / NO ) :  ");
		if ( yesNoOption ( sc.next() ) )
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
		setMethodUsage(linList, sc);
	}
	
	public static void setMethodUsage(List<Integer> linList, Scanner sc)
	{
		ListIterator<Integer> linListItr = linList.listIterator();
		while( linListItr.hasNext() )
		{
			if ( linListItr.next() < 0 )
			{
				linListItr.set(0);
			}
		}
		System.out.println("The LinkedList after integer validation is : "+linList);
		concurrentModification(linList, sc);
	}
	
	public static void concurrentModification(List<Integer> linList, Scanner sc)
	{
		ListIterator<Integer> linListItr = linList.listIterator();
		try
		{
			while ( linListItr.hasNext() )
			{
				if ( linListItr.next() == 0 )
				{
					linList.add(1);
				}
			}
		}
		catch ( ConcurrentModificationException e )
		{
			System.out.println("You have tried to modify the List in the middle of iteration, So throwing the ConcurrentModificationException.");
		}
		System.out.println("The LinkedList after integer validation is : "+linList);
		nextIndexAndPreviousIndex(linList, sc);
	}
	
	public static void nextIndexAndPreviousIndex(List<Integer> linList , Scanner sc )
	{
		ListIterator<Integer> linListItr = linList.listIterator();
		System.out.print("Enter an element for which you need to find the next and previous indexes : ");
		int num = 0 ;
		try
		{
			num = sc.nextInt(); 
		}
		catch (InputMismatchException e)
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		
		boolean flag = false;
		while ( linListItr.hasNext() )
		{
			if ( linListItr.next() == num )
			{
				System.out.println("The previous index for the given number : "+linListItr.previousIndex());
				System.out.println("The next index for the given number : "+linListItr.nextIndex());
				flag = true;
				break;
			}
		}
		if (!flag)
		{
			System.out.println("The number you are trying to search in the List, is not there.");
			return;
		}
		biDirectionalTraversal(linList, sc);
	}
	
	public static void biDirectionalTraversal(List<Integer> linList , Scanner sc)
	{
		System.out.print("Enter the element which you need to search in List through traversal : ");
		int num = 0;
		try 
		{
			num = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		ListIterator<Integer> linListItr = linList.listIterator();
		int count = 0;
		if ( linList.contains(num) )
		{
			while ( linListItr.hasNext() )
			{
				int val = linListItr.next();
				System.out.println("The "+(count+1)+"th position element is : "+val);
				if ( val == num )
				{
//					System.out.println("The "+(count+1)+"th position element is : "+val);
					linListItr.previous();
					break;
				}
				count++;
			}
			while ( linListItr.hasPrevious() )
			{
//				linListItr.previous();
				System.out.println("The "+(count+1)+"th position element is : "+linListItr.previous());
				count--;
			}
		}
		spliteratorMethod(linList);
		
	}
	
	public static void spliteratorMethod(List<Integer> linList)
	{
		Spliterator<Integer> linListSplitr1 = linList.spliterator();
		Spliterator<Integer> linListSplitr2 = linListSplitr1.trySplit();
		
		System.out.println("The First Spliterator : ");
//		while ( linListSplitr1.tryAdvance( (n) -> {
//			System.out.println(n +" , ");
//		}) );
		linListSplitr1.forEachRemaining(num -> System.out.print(num+" , "));
		System.out.println(linListSplitr1.estimateSize());
		
		System.out.println("The Second Spliterator : ");
//		while( linListSplitr2.tryAdvance( (n) -> {
//			System.out.print(n+" , ");
//		}) );
		linListSplitr2.forEachRemaining(num -> System.out.print(num+" , "));
		
//		System.out.println(linListSplitr1.trySplit().toString());
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
