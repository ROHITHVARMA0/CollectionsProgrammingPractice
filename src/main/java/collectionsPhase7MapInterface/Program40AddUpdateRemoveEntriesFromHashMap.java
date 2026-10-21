package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;

public class Program40AddUpdateRemoveEntriesFromHashMap 
{
	static HashMap<Integer , HashMap<String , Double> > hashMap ;
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner( System.in );		
		System.out.print("Do you want to create a HashMap and perform Add, Update and Remove actions on the HashMap ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			createHashMap(sc);
		}
		sc.close();
	}
	
	public static void createHashMap( Scanner sc )
	{
//		System.out.print("Enter the number of elements you want to insert into the HashMap : ");
//		Integer length = numberInput(sc);
//		if ( length == null || length <= 0 )
//		{
//			invalidInputTextMessage();
//			return;
//		}
		
		
		System.out.print("Do you want to insert elements into the HashMap ( YES / NO ) : ");
		String hashMapExistence = sc.next();
		System.out.print("Do you want to insert only 1 element into the HashMap ( YES / NO ) : ");
		String hashMapLengthDecision = sc.next();
		
		if ( ! yesNoOption(hashMapExistence) )
		{
			System.out.println("As you don't want to insert elements into the HashMap.");
			System.out.println("Ending the execution of the program");
			return;
		}
		
		else if ( yesNoOption(hashMapExistence) && yesNoOption(hashMapLengthDecision) )
		{
			System.out.print("Enter the ID of the Product : ");
			Integer prodId = numberInput(sc);
			System.out.print("Enter the Name of the Product : ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Enter the Price of the Product : ");
			Double prodPrice = priceInput(sc);
			
			if ( prodId == null || prodPrice == null || prodId <= 0 || prodPrice <= 0 )
			{
				System.out.println("You have entered an Invalid Input for the Product Price or Product ID.");
				System.out.println("So, stopping the execution of the program.");
				return;
			}
			else
			{
				hashMap = new HashMap<Integer, HashMap<String,Double>>();
				hashMap.computeIfAbsent(prodId, h -> new HashMap<>() ).put(prodName, prodPrice);
				
				displayHashMap(hashMap);
				
				updateDecision(sc);
				
				deleteDecision(sc);
			}
			
		}
		else if ( yesNoOption(hashMapExistence)  && !yesNoOption(hashMapLengthDecision) )
		{
			boolean hashMapInputFlag = true;
			hashMap = new HashMap<Integer, HashMap<String,Double>>();
			
			while(hashMapInputFlag)
			{
				System.out.print("Enter the ID of the Product : ");
				Integer prodId = numberInput(sc);
				System.out.print("Enter the Name of the Product : ");
				sc.nextLine();
				String prodName = sc.nextLine();
				System.out.print("Enter the Price of the Product : ");
				Double prodPrice = priceInput(sc);
				
				if ( prodId == null || prodPrice == null || prodId <= 0 || prodPrice <= 0 )
				{
					System.out.println("You have entered an Invalid Input for the Product Price or Product ID.");
					System.out.println("So, stopping the execution of the program.");
					return;
				}
				else
				{
					
					hashMap.computeIfAbsent(prodId, h -> new HashMap<>() ).put(prodName, prodPrice);
				}
				System.out.println("Do you want to insert elements into the HashMap ( YES / NO )  : ");
				if ( yesNoOption(sc.next()) )
				{
					continue;
				}
				else
				{
					hashMapInputFlag = false;
				}
				
				displayHashMap(hashMap);
				
				updateDecision(sc);
				
				deleteDecision(sc);
			}
		}
		
	}
	
	public static void updateDecision(Scanner sc)
	{
		System.out.print("Do you want to update any element in the HashMap ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			updateHashMap(sc);
		}
		else
		{
			System.out.println("As you don't want to update any element in the HashMap.");
			System.out.println("Stopping the execution of the program");
			return;
		}
	}
	
	public static void updateHashMap(Scanner sc)
	{
		System.out.print("Enter the Product ID that you want to update in the HashMap : ");
		Integer num = numberInput(sc);
		if ( num == null || num <= 0 )
		{
			invalidInputTextMessage();
			return;
		}
		else if ( hashMap.containsKey(num) )
		{
			System.out.print("Enter the Name of the Product : ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Enter the Price of the Product : ");
			Double prodPrice = priceInput(sc);
			
			if ( prodPrice == null || prodPrice <= 0 )
			{
				System.out.println("You have entered an Invalid Input for the Product Price.");
				System.out.println("So, stopping the execution of the program.");
				return;
			}
			else if ( hashMap.containsKey(num) )
			{
				HashMap<String, Double> innerHashMap = hashMap.get(num);
				innerHashMap.clear();
				
				innerHashMap.put(prodName, prodPrice);
				
//				hashMap.get(num).remove(innerHashMap);
//				hashMap.get(num).clear();
//				hashMap.computeIfAbsent(num,h -> new HashMap<>() ).put(prodName, prodPrice);
			}
			else
			{
				System.out.print("You have entered an invalid Product ID.");
				System.out.println("So redirecting you to the update decision making method.");
				updateDecision(sc);
			}
		
			displayHashMap(hashMap);
		}
	}
	
	public static void deleteDecision(Scanner sc)
	{
		System.out.print("Do you want to delete any element in the HashMap ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			deleteHashMapElement(sc);
		}
		else
		{
			System.out.println("As you don't want to delete any element in the HashMap.");
			System.out.println("Stopping the execution of the program");
			return;
		}
	}
	
	public static void deleteHashMapElement(Scanner sc)
	{
		System.out.print("Enter the Product ID that you want to delete from the HashMap : ");
		Integer num = numberInput(sc);
		if ( num == null || num <= 0 )
		{
			invalidInputTextMessage();
			return;
		}
		else if ( hashMap.containsKey(num) )
		{
			hashMap.get(num).clear();
		}
		else
		{
			System.out.print("You have entered an invalid Product ID.");
			System.out.println("Stopping the execution of the program");
			return;
		}
		displayHashMap(hashMap);
	}
	
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static Integer numberInput ( Scanner sc )
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
	
	public static Double priceInput ( Scanner sc )
	{
		double num = 0;
		
		try
		{
			num = sc.nextDouble();
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
	
	public static void displayHashMap( HashMap< Integer , HashMap<String , Double> > hashMap )
	{
		System.out.println("The data present in the Map is : ");
		System.out.printf("%-15s %-20s %-10s%n","ID", "Product Name", "Price");
		System.out.println("--------------------------------------------------");
		for ( HashMap.Entry<Integer , HashMap<String , Double> > map : hashMap.entrySet() )
		{
			Integer id = map.getKey();
			HashMap<String , Double> innerMap = map.getValue();
			
			for ( HashMap.Entry<String , Double> tempMap : innerMap.entrySet() )
			{
				System.out.printf("%-15d %-20s %-10.2f%n", id , tempMap.getKey() , tempMap.getValue() );
			}
		}
	}
	
}
