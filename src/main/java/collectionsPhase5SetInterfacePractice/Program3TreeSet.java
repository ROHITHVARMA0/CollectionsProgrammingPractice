package collectionsPhase5SetInterfacePractice;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Program3TreeSet 
{
	static final int lengthOrigin = 11;
	static final int lengthBound = 15;
	
	static final int elementOrigin = 1;
	static final int elementBound = 50;
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to create a TreeSet and perform the remaining methods on it ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			System.out.print("Do you want to create the TreeSet manually ( 1 ) or randomly ( 2 ) : ");
			Integer option = integerInput(sc);
			if ( option == null )
			{
				invalidInputText();
				return;
			}
			else if ( option == 1 )
			{
				createTreeSetManually(sc);
			}
			else if ( option == 2 )
			{
				createTreeSetRandomly(sc);
			}
			else
			{
				invalidInputText();
				return;
			}
		}
		else
		{
			System.out.println("Okay, stopping the execution of the program.");
			return;
		}
		sc.close();
	}
	
	public static void createTreeSetManually(Scanner sc)
	{
		System.out.print("Enter the number of elements you need to insert into the TreeSet : ");
		Integer length = integerInput(sc);
		if ( length == null || length < 1 )
		{
			invalidInputText();
			return;
		}
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the TreeSet : ");
			Integer num = integerInput(sc);
			if ( num == null )
			{
				invalidInputText();
				return;
			}
			treeSet.add(num);
		}
		System.out.println("The TreeSet is : "+treeSet);
		treeSetRemMethods(treeSet, sc);
	}
	
	public static void createTreeSetRandomly(Scanner sc)
	{
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		int length = randomNumber(lengthOrigin, lengthBound);
		System.out.println("The number of elements that is to be inserted into the TreeSet is : "+length);
		
		int i = 0;
		while ( i < length )
		{
			int num = randomNumber(elementOrigin, elementBound);
			System.out.println("The element "+num+" is inserted into the TreeSet.");
			treeSet.add(num);
			i++;
		}
		System.out.println("The TreeSet is : "+treeSet);
		treeSetRemMethods(treeSet, sc);
	}
	
	public static void treeSetRemMethods(TreeSet<Integer> treeSet , Scanner sc)
	{
		System.out.print("Enter an element to check and perform the actions on TreeSet : ");
		Integer ele = integerInput(sc);
		if ( ele == null )
		{
			invalidInputText();
			return;
		}
		System.out.println("The next highest value or equal value after "+ele+" is "+treeSet.ceiling(ele));
		System.out.println("The previous lower value or equal value before "+ele+" is "+treeSet.floor(ele));
		System.out.println("The next highest value after "+ele+" is "+treeSet.higher(ele));
		System.out.println("The previous lower value before "+ele+" is "+treeSet.lower(ele));
		System.out.println("The elements less than the given value is : "+treeSet.headSet(ele));
		System.out.println("The elements greater than the given value is : "+treeSet.tailSet(ele));
		System.out.println("Enter the range values to get the set of values between the range : ");
		System.out.print("1st Element : ");
		Integer ele1 = integerInput(sc);
		System.out.print("2nd Element : ");
		Integer ele2 = integerInput(sc);
		if ( ele1 == null || ele2 == null )
		{
			invalidInputText();
			return;
		}
		else if ( ele2 < ele1 )
		{
			System.out.println("Invalid range");
			return;
		}
		System.out.println("The elements between "+ele1+" and "+ele2+" is "+treeSet.subSet(ele1, ele2));
		
		Integer removedFirst = treeSet.pollFirst();
		Integer removedLast = treeSet.pollLast();
		System.out.println("Removed first: "+removedFirst+", removed last: "+removedLast);
		
		System.out.println("The TreeSet after removing the First and Last Elements is : "+treeSet);
		
		System.out.println("The TreeSet in descending order after removing the First and Last Elements is  "+treeSet.descendingSet());

		
	}
	
	
	public static int randomNumber(int origin , int bound) 
	{
		return ThreadLocalRandom.current().nextInt(origin,bound+1);
	}
	
	public static Integer integerInput(Scanner sc)
	{
		int num = 0;
		try 
		{
			num = sc.nextInt();
		}
		catch (InputMismatchException e)
		{
			return null;
		}
		return num;
	}
	
	public static void invalidInputText()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So stopping the execution of the program.");
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	
}
