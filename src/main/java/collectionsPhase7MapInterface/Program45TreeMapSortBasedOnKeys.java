package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.TreeMap;
import java.util.InputMismatchException;

public class Program45TreeMapSortBasedOnKeys 
{
	
	static final int ORIGIN = 1;
	static final int BOUND = 1001;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a TreeMap to sort based on the Keys : ");
		if( yesNoOption(sc.next()) )
		{
			createTreeMap(sc);
		}
			
		sc.close();
	}
	
	public static void createTreeMap( Scanner sc )
	{
		System.out.print("Enter the number of elements you want to insert into the TreeMap : ");
		Integer length = numberInput(sc);
		if ( length == null || length <= 0 )
		{
			errorMessage();
			return;
		}
		System.out.print("Do you want to craete a TreeMap as Integer as Keys ? : ");
		if ( yesNoOption(sc.next()) )
		{
			sc.nextLine();
			printTreeMap(intKeys(length, sc));
		}
		else
		{
			sc.nextLine();
			printTreeMap(stringKeys(length, sc));
		}
	}
	
	public static TreeMap<Integer, String> intKeys(int length , Scanner sc)
	{
		TreeMap<Integer, String> intKeys = new TreeMap<Integer, String>();
		for ( int i = 0 ; i < length ; i++ )
		{
			int price = randomNumberGeneration(ORIGIN, BOUND);
			String itemName = stringInput(sc);
			System.out.println("The Item : "+itemName+" is added into the Menu of Price : "+price+" .");
			if ( intKeys.containsKey(price) )
			{
				i--;
				continue;
			}
			intKeys.put(price, itemName);
		}
		
		return intKeys;
	}
	
	public static TreeMap< String , Integer > stringKeys(int length , Scanner sc)
	{
		TreeMap< String , Integer > stringKeys = new TreeMap< String , Integer >();
		for ( int i = 0 ; i < length ; i++ )
		{
			String itemName = stringInput(sc);
			int price = randomNumberGeneration(ORIGIN, BOUND);
			System.out.println("The Item : "+itemName+" is added into the Menu of Price : "+price+" .");
			
			stringKeys.put(itemName, price);
		}
		
		return stringKeys;
	}
	
	public static String stringInput( Scanner sc )
	{
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		return str;
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static int randomNumberGeneration(int ORIGIN , int BOUND)
	{
		return ThreadLocalRandom.current().nextInt(ORIGIN, BOUND);
	}
	
	public static void printTreeMap( TreeMap<?, ?> treeMap)
	{
		System.out.println("TreeMap : "+treeMap);
	}
	
	public static Integer numberInput( Scanner sc )
	{
		int num = 0 ;
		try
		{
			num = sc.nextInt();
		}
		catch( InputMismatchException e )
		{
			sc.next();
			errorMessage();
			return null;
		}
		return num;
	}
	
	public static void errorMessage() 
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
	}
	
}
