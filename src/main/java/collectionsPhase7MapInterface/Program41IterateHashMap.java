package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;

public class Program41IterateHashMap 
{
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner ( System.in );
		System.out.print("Do you want to create a HashMap in order to iterate through it in many ways ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			createHashMap(sc);
		}
		else
		{
			System.out.println("As you don't want to create a HashMap to iterate through it.");
			System.out.println("Stopping the execution of the program.");
		}
		
		sc.close();
	}
	
	public static void createHashMap(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the HashMap : ");
		Integer length = numberInput(sc);
		if ( length == null || length <= 0 )
		{
			invalidInputMessageAndReEnterInput();
			System.out.println("Do you want to really move forward with the program execution as you are entering the wrong input ( YES / NO ) : ");
			if ( yesNoOption(sc.next()) )
			{
				length = numberInput(sc);
			}
			else
			{
				programExecutionStoppingMessage();
				return;
			}
		}
		HashMap<Integer , String > map = new HashMap<Integer, String>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the ID of the employee : ");
			Integer id = numberInput(sc);
			System.out.print("Enter the Name of the employee : ");
			sc.nextLine();
			String name = sc.nextLine();
			if ( id == null || id <= 0 )
			{
				System.out.println("You have entered the input which is not a positive integer.");
				System.out.println("SO better keep in mind to enter a positive integer as an input for the ID.");
				i--;
				continue;
			}
			else if ( map.containsKey(id) )
			{
				System.out.println("You are trying to enter a duplicate element into the HashMap.");
				System.out.println("So try to add a correct element into the HashMap which is not a duplicate.");
				i--;
				continue;
			}
			map.put(id, name);
		}
		if ( !map.isEmpty() )
		{
			printHashMap(map);
		}
		
		iterateThroughHashMapUsingKeySetMethod(map);
		
		iterateThroughHashMapUsingValuesMethod(map);
		
		iterateThroughHashMapUsingEntrySetMethod(map);
	}
	
	public static void iterateThroughHashMapUsingKeySetMethod( HashMap< Integer , String > map )
	{
		System.out.println("The system is executing the print method for HashMap using KeySet.");
		for ( Integer num : map.keySet() )
		{
			System.out.println("Id : " +num+", Name : "+map.get(num));
		}
	}
	
	public static void iterateThroughHashMapUsingValuesMethod( HashMap<Integer, String> map ) 
	{
		System.out.println("The system is executing the print method for HashMap using Values.");
		for ( String str : map.values() )
		{
			System.out.println("Name : " +str);
		}
	}
	
	public static void iterateThroughHashMapUsingEntrySetMethod( HashMap<Integer, String> map )
	{
		System.out.println("The system is executing the print method for HashMap using EntrySet.");
		for ( HashMap.Entry<Integer, String> entry : map.entrySet() )
		{
			System.out.println("Id : "+entry.getKey()+", Name : "+entry.getValue());
		}
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static Integer numberInput(Scanner sc)
	{
		int num = 0;
		try
		{
			num = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			sc.next();
			return null;
		}
		return num;
	}
	
	public static void printHashMap(HashMap < Integer , String > hashmap)
	{
		System.out.println("The HashMap is : \n"+hashmap);
	}
	
	public static void invalidInputMessageAndReEnterInput()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, Once again check closely and enter a valid input");
	}
	
	public static void programExecutionStoppingMessage()
	{
		System.out.println("As you are uninterested in executing the program.");
		System.out.println("Stopping the execution of the program.");
	}
	
}
