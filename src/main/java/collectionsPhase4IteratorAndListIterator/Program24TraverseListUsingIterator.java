package collectionsPhase4IteratorAndListIterator;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.StringJoiner;
import java.util.List;

public class Program24TraverseListUsingIterator 
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to create Lists and traverse using Iterator ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLists(sc);
		}
		sc.close();
	}
	
	public static void createLists(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the Lists : ");
		int length = 0;
		try 
		{
			length = sc.nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println("You have entered an invalid input, you only need to give integers as input.");
			return;
		}
		if ( length < 1 )
		{
			System.out.println("You have entered an invalid input, so stopping the execution of the program.");
			return;
		}
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linList = new LinkedList<>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the list : ");
			try 
			{
				int num = sc.nextInt();
				arrList.add(num);
				linList.add(num);
			}
			catch (InputMismatchException e)
			{
				System.out.println("You have entered an invalid input, you only need to give integers as input.");
				return;
			}
						
		}
		
			listIterationUsingIterator(linList, arrList);
	}
	
	public static void listIterationUsingIterator(List<Integer> linList , List<Integer> arrList)
	{
		Iterator<Integer> arrListItr = arrList.iterator();
		Iterator<Integer> linListItr = linList.iterator();
		
		StringJoiner arrListStrJoin = new StringJoiner(", ","[","]");
		StringJoiner linListStrJoin = new StringJoiner(", ","[","]");
		
		while ( arrListItr.hasNext() )
		{
			arrListStrJoin.add( String.valueOf( arrListItr.next() ) );
//			System.out.print(arrListItr.next()+" , ");
		}
		System.out.println("The elements in the ArrayList while traversing with the Iterator : "+arrListStrJoin);
		while ( linListItr.hasNext() )
		{
			linListStrJoin.add( String.valueOf( linListItr.next() ) );
//			System.out.print(linListItr.next()+" , ");
		}
		System.out.println("The elements in the LinkedList while traversing with the Iterator : "+linListStrJoin);
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
