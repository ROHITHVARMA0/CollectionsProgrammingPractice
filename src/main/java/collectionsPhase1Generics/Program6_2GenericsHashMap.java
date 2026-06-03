package collectionsPhase1Generics;

import java.util.HashMap;
import java.util.Scanner;

public class Program6_2GenericsHashMap 
{
	
	
	public static void main ( String[] args )
	{
		
		HashMap< String , String > ctryCapMap = new HashMap< String , String >();
		
		Scanner sc = new Scanner(System.in);
		
		ctryCapMap.put("India" , "Delhi");
		ctryCapMap.put("Pakistan", "Karachi");
		ctryCapMap.put("China","Beijing");
		ctryCapMap.put("Nepal", "Bhutan");
		
		System.out.println("Enter the country to which you need to find the capital : ");
		String country = sc.next();		//if the name of the country in the list has more than one work then using nextLine() method for scanner is the correct way which is I think
		
		if ( ctryCapMap.containsKey(country) )
		{
			System.out.println("The capital of "+country+" is "+ctryCapMap.get(country) );
		}
		else 
		{
			System.out.println("The country you are searching is not listed.\nPlease contact admin to add the country to the list ");
		}
		
		System.out.println("Please enter the value 0 to delete a country from the list : ");
		int num = sc.nextInt();
		
		if(num == 0) 
		{
			System.out.println("Please enter the country name to delete from the list : ");
			String delCountry = sc.next();
			if(ctryCapMap.containsKey(delCountry)) 
			{
				ctryCapMap.remove(delCountry);
				System.out.println("Successfully deleted the country " + delCountry + " from the list");
			}
			else
			{
				System.out.println("The country you requested to remove is not listed");
			}
		}
		else
		{
			System.out.println("Exiting the program");
		}
		
		sc.close();
		
		
		
	}
	
	
}










//import java.util.HashMap;
//
//public class Main {
//    public static void main(String[] args) {
//        // 1. Create a HashMap object called capitalCities
//        // Keys are Strings (Country), Values are Strings (City)
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//        // 2. Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//
//        // 3. Access a value
//        System.out.println("The capital of Germany is: " + capitalCities.get("Germany"));
//
//        // 4. Remove an item
//        capitalCities.remove("Norway");
//
//        // 5. Print the size
//        System.out.println("Number of entries: " + capitalCities.size());
//
//        // 6. Loop through the items and print keys and values
//        System.out.println("\n--- Current List ---");
//        for (String i : capitalCities.keySet()) {
//            System.out.println("Country: " + i + " | Capital: " + capitalCities.get(i));
//        }
//    }
//}