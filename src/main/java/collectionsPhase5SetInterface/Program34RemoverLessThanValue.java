package collectionsPhase5SetInterface;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;

public class Program34RemoverLessThanValue 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner ( System.in );
		
		System.out.print("Do you want to create a TreeSet and remove elements from the given input value ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			System.out.print("Do you want the elements in the TreeSet to be inserted manually ( 1 ) or Randomly ( 2 ) : ");
			Integer option = integerInput(sc);
			if ( option == null )
			{
				sc.close();
				return;
			}
			else if ( option == 1 )
			{
				createTreeSetManually(sc);
			}
			else if ( option == 2 )
			{
				randomIntegerTreeSet(sc);
			}
			else
			{
				invalidInputReturn();
				return;
			}
		}
		
		
		sc.close();
	}
	
	public static void createTreeSetManually( Scanner sc )
	{
		System.out.println("Enter the number of elements you want to insert into the TreeSet : ");
		Integer length = integerInput(sc);
		if ( length == null )
		{
			sc.close();
			return;
		}
		else if ( length < 1 )
		{
			invalidInputReturn();
			return;
		}
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the element to be inserted into the TreeSet : ");
			Integer num = integerInput(sc);
			if ( num == null )
			{
				sc.close();
				return;
			}
			treeSet.add(num);
			System.out.println("The integer "+num+" is inserted into the TreeSet.");
		}
		System.out.println("The TreeSet is : "+treeSet);
		
		certainValueLessTreeSet(treeSet , sc);
	}
	
	public static void randomIntegerTreeSet( Scanner sc )
	{
		int length = randomIntegerInput(11, 16);
		System.out.println("The length of the TreeSet is : "+length);
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			treeSet.add( randomIntegerInput(0, 51) );
		}
		System.out.println("The TreeSet is : "+treeSet);
		
		certainValueLessTreeSet(treeSet , sc);
	}
	
	public static void certainValueLessTreeSet(TreeSet<Integer> treeSet , Scanner sc)
	{
//		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value upto which you want the elements to be removed : ");
		Integer element = integerInput(sc);
		
		if ( element == null )
		{
			sc.close();
			return;
		}
		
		treeSet.headSet(element).clear();
		
//		for ( int num : treeSet )
//		{
//			if ( num < element )
//			{
//				treeSet.remove(num);
//			}
//		}
		System.out.println("The TreeSet after removing the elements less than the given value is : "+treeSet);
	}
	
	public static Integer integerInput(Scanner sc)
	{
		int length = 0;
		try 
		{
			length = sc.nextInt();
		}
		catch( InputMismatchException e )
		{
			invalidInputReturn();
//			throw new InputMismatchException("Invalid Input");
			return null;
//			throw e;
		}
		return length;
	}
	
	public static int randomIntegerInput( int origin , int bound )
	{
		return ThreadLocalRandom.current().nextInt( origin , bound );
	}
	
	public static void invalidInputReturn()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
		return;
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
