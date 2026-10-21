package collectionsPhase7MapInterface;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Program44CreateLinkedHashMapCreationForMaintainingInsertionOrder 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a LinkedHashMap to check whether it maintains Insertion Order : ");
		if ( yesNoOption(sc.next()) )
		{
			createLinkedHashMap(sc);
		}
		
		sc.close();
	}
	
	public static void createLinkedHashMap(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the LinkedHashMap : ");
		Integer length = numberInput(sc);
		if ( length == null || length <= 0 )
		{
			printErrorMessage();
			return;
		}
		
		LinkedHashMap<String, Double> linHashMap = new LinkedHashMap<String, Double>();
		HashMap<String, Double> hashMap = new HashMap<String, Double>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the item you want to insert into the Menu : ");
			sc.nextLine();
			String item = sc.nextLine();
			System.out.print("Enter the price of the item you have entered : ");
			Double price = priceInput(sc);
			if( price == null || price <= 0.0 )
			{
				printErrorMessage();
				return;
			}
			
			linHashMap.put(item, price);
			hashMap.put(item, price);
		}
		
		System.out.println("The elements in the LinkedHashMap : " +linHashMap);	
		System.out.println("The elements in the HashMap : " +hashMap);			
	}
	
	public static Integer numberInput(Scanner sc)
	{
		int num = 0;
		try
		{
			num = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			return null;
		}
		
		return num;
	}
	
	public static Double priceInput(Scanner sc)
	{
		Double num = 0.0;
		try
		{
			num = sc.nextDouble();
		}
		catch ( InputMismatchException e )
		{
			return null;
		}
		
		return num;
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static void printErrorMessage()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
	}
	
}
