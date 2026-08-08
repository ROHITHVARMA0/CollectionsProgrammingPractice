package collectionsPhase5SetInterface;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;


public class Program35FindFirstAndLastElements 
{
	//Random Integer Range
	static final int elementOrigin = 1;
	static final int elementBound = 51;
	
	//Random Set Size Range
	static final int rangeOrigin = 11;
	static final int rangeBound = 16;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a TreeSet and find the First and Last elements in the TreeSet ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.print("Do you want to enter the elements Manually ( 1 ) or Randomly ( 2 ) : ");
			Integer option = integerInput(sc);
			if ( option == null )
			{
				invalidInput();
				return;
			}
			else if ( option == 1 )
			{
				createTreeSetManually(sc);
			}
			else if ( option == 2 )
			{
				createTreeSetRandom();
			}
			else
			{
				invalidInput();
				return;
			}
		}
		
		sc.close();
	}
	
	public static void createTreeSetManually( Scanner sc )
	{
		System.out.println("Enter the number of elements you want to insert into the TreeSet : ");
		Integer length = integerInput(sc);
		if ( length == null || length < 1 )
		{
			invalidInput();
			return;
		}
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element you want to insert into the TreeSet : ");
			Integer num = integerInput(sc);
			if ( num == null )
			{
				invalidInput();
				return;
			}
			treeSet.add(num);
		}
		
		System.out.println("The TreeSet : "+treeSet);
		
		firstAndLastElements(treeSet);
	}
	
	public static void createTreeSetRandom()
	{
		int length = randomInteger(rangeOrigin, rangeBound);
		System.out.println("The length of the TreeSet is : "+length);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			int num = randomInteger(elementOrigin, elementBound);
			System.out.println("The element "+num+" is inserted into the TreeSet.");
			treeSet.add(num);
		}
		
		System.out.println("The TreeSet is : "+treeSet);
		
		firstAndLastElements(treeSet);
	}
	
	public static void firstAndLastElements( TreeSet<Integer> treeSet )
	{
		if ( treeSet.isEmpty() )
		{
			System.out.println("The TreeSet contains Zero elements so cannot find First and Last Elements.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		
		System.out.println("The First element of the TreeSet is : "+treeSet.first());
		System.out.println("The Last element of the TreeSet is : "+treeSet.last());
	}
	
	public static void invalidInput()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
	}
	
	public static Integer integerInput( Scanner sc )
	{
		int num = 0 ;
		try
		{
			num = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			invalidInput();
			return null;
		}
		return num;
	}
	
	public static int randomInteger( int origin , int bound )
	{
		return ThreadLocalRandom.current().nextInt(origin, bound);
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
