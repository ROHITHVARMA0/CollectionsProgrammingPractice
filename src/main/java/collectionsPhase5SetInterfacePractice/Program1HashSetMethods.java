package collectionsPhase5SetInterfacePractice;

import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Iterator;

public class Program1HashSetMethods 
{
	static final int hashSetSizeOrigin = 11;
	static final int hashSetSizeBound = 15;
	
	static final int hashSetElementsOrigin = 1;
	static final int hashSetElementsBound = 50;
	
	public static void main( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a HashSet and work on the remaining methods of HashSet ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			System.out.print("Do you want to create HashSet manually ( 1 ) or randomly ( 2 ) : ");
			Integer option = integerInput(sc);
			if ( option == 1 )
			{
				createHashSetManually(sc);
			}
			else if ( option == 2 )
			{
				createHashSetRandomly(sc);
			}
			else
			{
				invalidInputText();
				return;
			}
		}
		
		sc.close();
	}
	
	public static void createHashSetManually(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the HashSet : ");
		Integer length = integerInput(sc);
		if ( length == null )
		{
			invalidInputText();
			return;
		}
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		int count = 0;
		while( count < length )
		{
			System.out.print("Enter the "+(count+1)+"th element to insert into the HashSet : ");
			Integer num = integerInput(sc);
			if ( num == null )
			{
				invalidInputText();
				return;
			}
			else if( num < 1 )
			{
				invalidInputText();
				return;
			}
			hashSet.add(num);
			count++;
		}
		hashSetRemMethods(hashSet,sc);
	}
	
	public static void createHashSetRandomly(Scanner sc)
	{
		int hashSetLength = randomIntegerGenerator(hashSetSizeOrigin, hashSetSizeBound);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		int count = 0;
		while ( count < hashSetLength )
		{
			int num = randomIntegerGenerator(hashSetElementsOrigin, hashSetElementsBound);
			hashSet.add(num);
			System.out.println("The element "+num+" is included into the HashSet.");
			count++;
		}
			
		hashSetRemMethods(hashSet , sc);
	}
	
	public static void hashSetRemMethods( HashSet<Integer> hashSet, Scanner sc )
	{
		int num = randomIntegerGenerator(hashSetElementsOrigin, hashSetElementsBound);
		if ( hashSet.contains(num) )
		{
			System.out.println("The element "+num+" is present in the HashSet.");
			System.out.println("The size of the HashSet before deleting the element "+num+" is "+hashSet.size());
			hashSet.remove(num);
			System.out.println("The element "+num+" is omited from the HashSet.");
			System.out.println("The size of the HashSet after deleting the element "+num+" is "+hashSet.size());
		}
		else
		{
			System.out.println("The element "+num+" is not present in the HashSet.");
			System.out.println("As the element "+num+" cannot be deleted because it is not present in the HashSet.");
			System.out.println("Enter an element that you want to remove from the HashSet : ");
			Integer temp = integerInput(sc);
			if ( temp == null )
			{
				invalidInputText();
				return;
			}
			else if ( temp < 1 )
			{
				invalidInputText();
				return;
			}
			hashSet.remove(temp);
			System.out.println("The HashSet is : "+hashSet);
			System.out.println("The size of the HashSet is : "+hashSet.size());
		}
		
		System.out.println("The elements in the HashSet using ForEachLoop are : ");
		for ( int temp : hashSet )
		{
			System.out.print(temp +" , ");
		}
		System.out.println();
		
		System.out.println("The elements in the HashSet using Iterator are : ");
		Iterator<Integer> hashSetItr = hashSet.iterator();
		while ( hashSetItr.hasNext() )
		{
			System.out.print(hashSetItr.next()+" , ");
		}
	}
	
	
	public static Integer integerInput ( Scanner sc )
	{
		int num = 0;
		
		try
		{
			num = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			invalidInputText();
			return null;
		}
		
		return num;
	}
	
	public static void invalidInputText()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
	}
	
	public static int randomIntegerGenerator( int origin , int bound )
	{
		return ThreadLocalRandom.current().nextInt(origin, bound+1);
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
