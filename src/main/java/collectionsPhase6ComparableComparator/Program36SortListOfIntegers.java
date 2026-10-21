package collectionsPhase6ComparableComparator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program36SortListOfIntegers 
{
	static final int araryListLengthOrigin = 11;
	static final int arrayListLengthBound = 15;
	
	static final int arrayListElementsOrigin = 1;
	static final int arrayListElementsBound = 50;
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a List of Integers to sort them : ");
		if (  yesNoOption(sc.next() ) )
		{
			System.out.print("Enter how do you want to create the ArrayList ( Manually - 1 / Randomly - 2 )  : ");
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
		sc.close();
	}
	
	public static void createArrayListManually(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to enter into the ArrayList : ");
		Integer length = integerInput(sc);
		if ( length == null )
		{
			invalidInputText();
			return;
		}
		else if ( length < 1 )
		{
			invalidInputText();
			return;
		}
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		int count = 0;
		while ( count < length )
		{
			System.out.print("Enter the "+(count+1)+"th element to insert into the ArrayList : ");
			Integer num = integerInput(sc);
			if ( num == null )
			{
				invalidInputText();
				return;
			}
			arrList.add(num);
			count++;
		}
		System.out.println("The ArrayList after creation is : "+arrList);
		sortArrayList(arrList);
	}
	
	public static void createArrayListRandomly()
	{
		ArrayList<Integer> arrList = new ArrayList<>();
		
		int length = randomNumber(araryListLengthOrigin, arrayListLengthBound);
		System.out.println("The length of the ArrayList is : "+length);
		
		int count = 0;
		while ( count < length )
		{
			int num = randomNumber(arrayListElementsOrigin, arrayListElementsBound);
			arrList.add(num);
			System.out.println("The number added into the ArrayList is : "+num);
			
			count++;
		}
		System.out.println("The ArrayList after creation is : "+arrList);
		sortArrayList(arrList);
	}
	
	public static void sortArrayList(List<Integer> list)
	{
		Collections.sort(list);
		System.out.println("The ArrayList after Sorting is : "+list);
		
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
