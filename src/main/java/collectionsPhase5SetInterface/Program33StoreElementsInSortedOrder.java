package collectionsPhase5SetInterface;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;

public class Program33StoreElementsInSortedOrder 
{
	//Elements range
	static final int origin = 1;
	static final int bound = 50;
	
	//Size range
	static final int sizeOrigin = 11;
	static final int sizeBound = 15;
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Do you want to create a Treeset and look whether the elements are stored in sorted order or not ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.print("Do you want to enter the elements manually ( 1 ) or insert elements randomly with in a range ( 2 ) : ");
			int option = 0 ;
			try
			{
				option = sc.nextInt();
			}
			catch( InputMismatchException e )
			{
				System.out.println("You have entered an invalid input.");
				System.out.println("So, stopping the execution of the program.");
				return;
			}
			if ( option == 1 )
			{
				createTreeSetManually(sc);
			}
			else if ( option == 2 )
			{
				createTreeSetRandom();
			}
			else
			{
				System.out.println("You have entered an invalid input.");
				System.out.println("So, stopping the execution of the program.");
				return;
			}
		}
		
		sc.close();
	}
	
	public static void createTreeSetManually( Scanner sc )
	{
		System.out.println("Enter the number of elements you want to insert into the TreeSet : ");
		int length = 0 ;
		try
		{
			length = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			System.out.println("You have entered an invalid input.");
			System.out.println("So, stopping the execution of the program.");
			return;
		}
		if ( length < 1 )
		{
			System.out.println("You have entered an invalid input.");
			System.out.println("So, stopping the execution of the program.");
			return;
		}
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the TreeSet : ");
			try
			{
				int num = sc.nextInt();
//				treeSet.add(num);
				boolean added = treeSet.add(num);
				if(!added)
				{
					System.out.println("Duplicate element ignored.");
				}
				System.out.println("You have entered the integer "+num+" to insert into the TreeSet.");
				System.out.println("The TreeSet after "+(i+1)+"th element insertion : "+treeSet);
			}
			catch ( InputMismatchException e )
			{
				System.out.println("You have enetered an invalid input.");
				System.out.println("So, stopping the execution of the program.");
				return;
			}
		}
	}
	
	public static void createTreeSetRandom() 
	{
		int length = randomSize();
		System.out.println("The number of elements to be inserted into the Treeset is : "+length);
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			int num = randomNumber();
			treeSet.add(num);
			System.out.println("The number that is randomly picked from the range is "+num+" and inserted into the TreeSet.");
			System.out.println("The TreeSet after "+(i+1)+"th element insertion : "+treeSet);
		}
	}
	
	public static int randomSize()
	{
		return ThreadLocalRandom.current().nextInt(sizeOrigin, sizeBound+1);
	}
	
	public static int randomNumber()
	{
		return ThreadLocalRandom.current().nextInt(origin, bound+1);
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
