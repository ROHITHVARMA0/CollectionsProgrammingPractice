package collectionsPhase2ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.concurrent.ThreadLocalRandom;
import java.util.Iterator;
import java.util.HashMap;

public class Program17RemoveDuplicatesFromArrayList 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt ;
	static ArrayList<String> arrListStr;
	
	static HashMap< Integer , Integer > arrListIntDuplicates;
	static HashMap< Integer , String > arrListStrDuplicates;
	
	public static void main ( String[] args )
	{
		
		System.out.println("Do you want to remove duplicates from the arraylist ( YES / NO ): ");
		
		if ( yesNoOption(sc.next()) ) 
		{
			arrayListCreation();
		}
		
		printArrayList();
		
		storeDuplicatesInHashMap();
		
		removeDuplicatesFromArrayList();
		
		System.out.println("ArrayList after removing the duplicates : ");
		printArrayList();
		
		arrayListDuplicatesPrint();		
		
	}
	
	public static void arrayListCreation()
	{
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayListCreationOption = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();
		
		if ( arrayListCreationOption == 1  && length > 0 )
		{
			arrListInt = new ArrayList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
				arrListInt.add(sc.nextInt());
			}
		}
		else if ( arrayListCreationOption == 2 && length > 0 )
		{
			arrListStr = new ArrayList<String>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
				if ( i == 0 )
				{
					sc.nextLine();
				}
				arrListStr.add(sc.nextLine());
			}
		}
	}
	
	public static void printArrayList()
	{
//		int random = ThreadLocalRandom.current().nextInt(0, 4);
		System.out.println("Now we are printing the ArrayList and as of now we have 4 ways of traversing through the ArrayList.");
		System.out.println("Pick anyone way to traverse through arraylist print the elements in the arraylist.");
		System.out.println("1 - For Loop");
		System.out.println("2 - Advanced For Loop / For Each Loop");
		System.out.println("3 - Iterator");
		System.out.println("4 - Println Method");
		int random = sc.nextInt();
		if ( arrListInt != null )
		{
			if ( random == 1 )
			{
				for ( int i = 0 ; i < arrListInt.size() ; i++ )
				{
					System.out.print(arrListInt.get(i)+" , ");
				}
			}
			else if ( random == 2 )
			{
				for ( int i : arrListInt )
				{
					System.out.print(i+ " , ");
				}
			}
			else if ( random == 3 )
			{
				Iterator<Integer> arrListIntIterator = arrListInt.iterator();
				while ( arrListIntIterator.hasNext() )
				{
					System.out.print(arrListIntIterator.next()+" , ");
				}
			}
			else if ( random == 4 )
			{
				System.out.print(arrListInt);
			}
			else
			{
				System.out.println("You have entered the wrong input to print the arraylist.");
				return;
			}
		}
		else if ( arrListStr != null )
		{
			if ( random == 1 )
			{
				for( int i = 0 ; i < arrListStr.size() ; i++ )
				{
					System.out.print(arrListStr.get(i)+" , ");
				}
			}
			else if ( random == 2 )
			{
				for ( String str : arrListStr )
				{
					System.out.print(str+" , ");
				}
			}
			else if ( random == 3 )
			{
				Iterator<String> arrListStrIterator = arrListStr.iterator();
				while ( arrListStrIterator.hasNext() )
				{
					System.out.print(arrListStrIterator.next()+" , ");
				}
			}
			else if ( random == 4 )
			{
				System.out.print(arrListStr);
			}
			else
			{
				System.out.println("You have entered the wrong input to print the arraylist.");
				return;
			}
		}
		System.out.println();
	}
	
	public static void storeDuplicatesInHashMap()
	{
		if ( arrListInt != null )
		{
			arrListIntDuplicates = new HashMap < Integer , Integer >();
			
			for ( int i = 0 ; i < arrListInt.size() ; i++ )
			{
//----------j= i+ 1 is kept to avoid the removal of first occurrence of an element-------------------
				for (  int j = i + 1 ; j < arrListInt.size() ; j++ )
				{
					if ( arrListInt.get(i).equals(arrListInt.get(j)) )
					{
						arrListIntDuplicates.put(j, arrListInt.get(j));
//						arrListInt.remove(j);
//						j--;
					}
				}
			}
		}
		else if ( arrListStr != null )
		{
			arrListStrDuplicates = new HashMap < Integer , String >();
			for ( int i = 0 ; i < arrListStr.size() ; i++ )
			{
//----------j= i+ 1 is kept to avoid the removal of first occurrence of an element-------------------
				for ( int j = i + 1 ; j < arrListStr.size() ; j++ )
				{
					if ( arrListStr.get(i).equals(arrListStr.get(j)) )
					{
						arrListStrDuplicates.put(j, arrListStr.get(j));
//						arrListStr.remove(j);
//						j--;
					}
				}
			}
		}
	}
	
	public static void removeDuplicatesFromArrayList()
	{
		if ( arrListInt != null )
		{
			for ( int i = 0 ; i < arrListInt.size() ; i++ )
			{
//----------j= i+ 1 is kept to avoid the removal of first occurrence of an element-------------------
				for (  int j = i + 1 ; j < arrListInt.size() ; j++ )
				{
					if ( arrListInt.get(i).equals(arrListInt.get(j)) )
					{
						arrListInt.remove(j);
						j--;
					}
				}
			}
		}
		else if ( arrListStr != null )
		{
			for ( int i = 0 ; i < arrListStr.size() ; i++ )
			{
//----------j= i+ 1 is kept to avoid the removal of first occurrence of an element-------------------
				for ( int j = i + 1 ; j < arrListStr.size() ; j++ )
				{
					if ( arrListStr.get(i).equals(arrListStr.get(j)) )
					{
						arrListStr.remove(j);
						j--;
					}
				}
			}
		}
	}
	
	public static void arrayListDuplicatesPrint()
	{
		if ( arrListIntDuplicates != null )
		{
			System.out.println(arrListIntDuplicates);
		}
		else if ( arrListStrDuplicates != null )
		{
			System.out.println(arrListStrDuplicates);
		}
	}
	
	public static boolean yesNoOption( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
}
