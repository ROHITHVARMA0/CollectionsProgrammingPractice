package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeMap;

public class Program46HighestAndLowestKeys 
{
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Do you want to create a TreeMap to find the Highest and Lowest Keys : ");
		if ( yesNoOption(sc.next()) )
		{
			createTreeMap(sc);
		}
		
		sc.close();
	}
	
	public static void createTreeMap( Scanner sc )
	{
		System.out.print("Enter the number of elements you want to insert into the TreeMap : ");
		Integer length = numberInput(sc);
		if( length == null || length <= 0 )
		{
			inputErrorMessage();
			return;
		}
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		for( int i = 0 ; i < length ; i++ )
		{
			sc.nextLine();
			System.out.print("Enter the Item name you want to add into the Menu List : ");
			String itemName = sc.nextLine();
			if ( treeMap.containsKey(itemName) )
			{
				System.out.println("The Item you are trying to insert into the Menu List already exists.");
				System.out.println("So try to add a Item into the Menu List whic is not a duplicate.");
				i--;
				continue;
			}
			else
			{
				System.out.print("Enter the price of the item - "+itemName+" : ");
				Integer price = numberInput(sc);
				if ( price == null || price <= 0 )
				{
					inputErrorMessage();
					return;
				}
				treeMap.put(itemName, price);
				
				System.out.println("The Item : " + itemName + " of Price : " + price + " has been added to the Menu List.");
			}
		}
		
		for ( Map.Entry<String, Integer> entryMap : treeMap.entrySet() ) 
		{
		    System.out.println("Item : " + entryMap.getKey() + " , Price: " + entryMap.getValue());
		}
		
		highestAndLowestKeys(treeMap);
	}
	
	public static void highestAndLowestKeys( TreeMap< String , Integer > treeMap )
	{
		System.out.println("The Highest Key of the TreeMap is : "+treeMap.lastKey());
		System.out.println("The Lowest Key of the TreeMap is : "+treeMap.firstKey());
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static Integer numberInput( Scanner sc )
	{
		int num = 0 ;
		try
		{
			num = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			inputErrorMessage();
			return null;
		}
		return num;
	}
	
	public static void inputErrorMessage()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
	}
	
}
