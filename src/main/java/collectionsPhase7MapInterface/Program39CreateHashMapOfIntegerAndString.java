package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Program39CreateHashMapOfIntegerAndString 
{
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a HashMap of Integer and String ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			createHashMap(sc);
		}
		
		sc.close();
		
	}
	
	public static void createHashMap(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the HashMap : ");
		Integer length = numberInput(sc);
		
		if ( length == null )
		{
			invalidInputTextMessage();
			return;
		}
		else if ( length < 1 )
		{
			invalidInputTextMessage();
			return;
		}
		
		HashMap<Integer , String> hashMap = new HashMap<Integer, String>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th Integer element : ");
			Integer num = numberInput(sc);
			if ( num == null )
			{
				invalidInputTextMessage();
				return;
			}
			
			System.out.print("Enter the "+(i+1)+"th String element : ");
			String str = sc.next();
			hashMap.put(num, str);
		}
		
		System.out.println("The HashMap is : "+hashMap);
		
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static Integer numberInput( Scanner sc )
	{
		int num = 0;
		try
		{
			num = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			invalidInputTextMessage();
			return null;
		}
		return num;
	}
	
	public static void invalidInputTextMessage()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
	}
	
}
