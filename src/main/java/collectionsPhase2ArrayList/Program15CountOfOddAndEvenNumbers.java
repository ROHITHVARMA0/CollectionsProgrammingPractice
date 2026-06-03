package collectionsPhase2ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Program15CountOfOddAndEvenNumbers 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt ;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to find the count of even and odd numbers in the arraylist ( YES / NO ) : ");
		String str = sc.next();
		
		if ( yesNoOption(str) )
		{
			intArrayListCreation();
		}
		else
		{
			System.out.println("As you don't want to create an ArrayList.");
			System.out.println("Exiting the program.");
			System.exit(0);
		}
		printArrayList();
		
		oddEvenNumberCount();
	}
	
	
	public static void intArrayListCreation()
	{
		arrListInt = new ArrayList<Integer>();
		
		System.out.println("Enter the number of elements you want to insert into arraylist : ");
		int numberOfElements = sc.nextInt();
		
		for ( int i = 0 ; i < numberOfElements ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
			arrListInt.add(sc.nextInt());
		}
	}
	
	public static void printArrayList()
	{
		int random = ThreadLocalRandom.current().nextInt(0, 4);
		if ( arrListInt != null )
		{
			if ( random == 0 )
			{
				for ( int i = 0 ; i < arrListInt.size() ; i++ )
				{
					System.out.print(arrListInt.get(i)+" , ");
				}
			}
			else if ( random == 1 )
			{
				for ( int i : arrListInt )
				{
					System.out.print(i+ " , ");
				}
			}
			else if ( random == 2 )
			{
				Iterator<Integer> arrListIntIterator = arrListInt.iterator();
				while ( arrListIntIterator.hasNext() )
				{
					System.out.print(arrListIntIterator.next()+" , ");
				}
			}
			else if ( random == 3 )
			{
				System.out.print(arrListInt);
			}
		}
		System.out.println();
	}
	
	public static void oddEvenNumberCount()
	{
		int oddNumberCount = 0 ;
		int evenNumberCount = 0 ;
		int negativeNumberCount = 0 ;
		int zeroNumberCount = 0 ;
		if ( arrListInt != null  )
		{
			for ( int i : arrListInt )
			{
				if ( i == 0 )
				{
					zeroNumberCount++;
				}
				else if ( i % 2 == 0 )
				{
					evenNumberCount++;
				}
				else
				{
					oddNumberCount++;
				}
				if ( i < 0 )
				{
					negativeNumberCount++;
				}
			}
		}
		System.out.println("The number of odd number elements in the arraylist is : " + oddNumberCount);
		System.out.println("The number of even number elements in the arraylist is : " + evenNumberCount);
		System.out.println("The number of negative number elements in the arraylist is " + negativeNumberCount);
		System.out.println("The number of times zero is present in the arraylist is " + zeroNumberCount);
	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y"))
		{
			return true;
		}
		
		return false;
	}
	
}
