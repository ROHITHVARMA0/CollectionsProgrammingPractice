package collectionsPhase6ComparableComparator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Program0003List 
{
	
	static final int araryListLengthOrigin = 11;
	static final int arrayListLengthBound = 15;
	
	static final int arrayListElementsOrigin = 1;
	static final int arrayListElementsBound = 50;
	
	public static ArrayList<Integer> randomArrayList()
	{
		ArrayList<Integer> arrList = new ArrayList<>();
		int length = randomNumber(araryListLengthOrigin, arrayListLengthBound);
		
		int count = 0;
		while ( count < length )
		{
			int num = randomNumber(arrayListElementsOrigin, arrayListElementsBound);
			arrList.add(num);
			count++;
		}
		System.out.println("The ArrayList after Creation is : "+arrList);
		
		return arrList;
	}
	
	public static ArrayList<Integer> manualArrayList()
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<>();
		
		System.out.print("Enter the number of elements you want to insert into the ArrayList : ");
		Integer length = integerInput(sc);
		if ( length == null )
		{
			invalidInputText();
			return null;
		}
		else if ( length < 1 )
		{
			invalidInputText();
			return null;
		}
		
		
		int count = 0;
		while ( count < length )
		{
			System.out.print("Enter the "+(count+1)+"th element to insert into the ArrayList : ");
			Integer num = integerInput(sc);
			if ( num == null )
			{
				invalidInputText();
				return null;
			}
			arrList.add(num);
			count++;
		}
		
		sc.close();
		return arrList;
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
	
	public static int randomNumber( int elementsOrigin , int elementsBound )
	{
		return ThreadLocalRandom.current().nextInt( elementsOrigin , elementsBound+1 );
	}
	
}
