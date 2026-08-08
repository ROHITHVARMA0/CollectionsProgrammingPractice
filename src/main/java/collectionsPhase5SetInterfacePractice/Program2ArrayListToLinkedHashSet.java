package collectionsPhase5SetInterfacePractice;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ThreadLocalRandom;

public class Program2ArrayListToLinkedHashSet 
{
	static final int lengthOrigin = 11;
	static final int lengthBound = 15;
	
	static final int elementOrigin = 1;
	static final int elementBound = 50;
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner ( System.in );
		
		System.out.print("Do you want to create an ArrayList and removes duplicates in it and preserve the insertion order by using LinkedHashSet ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			System.out.print("Do you want to create the ArrayList manually ( 1 ) or randomly ( 2 ) : ");
			Integer option = integerInput(sc);
			if ( option == null )
			{
				invalidInputText();
				return;
			}
			else if ( option == 1 )
			{
				createArrayListManually(sc);
			}
			else if ( option == 2 )
			{
				createArrayListRandomly();
			}
			else
			{
				invalidInputText();
				return;
			}
			
		}
		else
		{
//			System.out.println("As you don't want to create an ArrayList and removes duplicates in it and preserve the insertion order by using LinkedHashSet.");
//			System.out.println("So, stopping the execution of the program.");
			System.out.println("Okay, stopping the execution of the program.");
			return;
		}
		
		sc.close();
	}
	
	public static void createArrayListManually(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the ArrayList : ");
		Integer length = integerInput(sc);
		if ( length == null || length < 1 )
		{
			invalidInputText();
			return;
		}
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		int count = 0;
		while ( count < length )
		{
			System.out.print("Enter the "+(count+1)+"th element to insert into the ArrayList : ");
			Integer ele = integerInput(sc);
			if ( ele == null )
			{
				invalidInputText();
				return;
			}
			arrList.add(ele);
			count++;
		}
		System.out.println("The ArrayList : "+arrList);
		System.out.println("The ArrayList size is : "+arrList.size());
		arrListToLinkedHashSet(arrList);
	}
	
	public static void createArrayListRandomly()
	{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		int length = randomNumber(lengthOrigin, lengthBound);
		System.out.println("The number of elements that is to be inserted into the ArrayList is : "+length);
		
		int i = 0;
		while ( i < length )
		{
			int num = randomNumber(elementOrigin, elementBound);
			System.out.println("The element "+num+" is inserted into the ArrayList.");
			arrList.add(num);
			i++;
		}
		System.out.println("The ArrayList is : "+arrList);
		System.out.println("The ArrayList size is : "+arrList.size());
		arrListToLinkedHashSet(arrList);
	}
	
	public static void arrListToLinkedHashSet(ArrayList<Integer> arrList)
	{
		LinkedHashSet<Integer> linHashSet = new LinkedHashSet<Integer>(arrList);
		
		System.out.println("The ArrayList is converted to LinkedHashSet to remove duplicates from the ArrayList and preserve the insertion order.");
		System.out.println("The LinkedHashSet is : "+linHashSet);
		System.out.println("The LinkedHashSet Size is : "+linHashSet.size());
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
//			invalidInputText();
			return null;
		}
		return num;
	}
	
	public static void invalidInputText()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So stopping the execution of the program.");
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y"); 
	}
	
}
