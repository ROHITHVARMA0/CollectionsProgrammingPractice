package collectionsPhase2ArrayList;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program13SetMethodUsageWithHistoryUpdatedVersion 
{
	
static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt ;
	static ArrayList<String> arrListStr ; 
	
//	static HashMap<Integer, Integer> arrayListIntSetMethodUsageHistory;
//	static HashMap<Integer, String> arrayListStrSetMethodUsageHistory;
	
	static ArrayList<CustomArrayListForIntSetMethodHistory> arrListIntSetMethodUsageHistory;
	static ArrayList<CustomArrayListForStrSetMethodHistory> arrListStrSetMethodUsageHistory; 

	
	public static void main ( String[] args )
	{
		
		arrayListCreation();
		
		elementInsertion();
		
		printArrayList();
		
		setMethodUsage();
		
//		setMethodUsageHistory();
		
		setMethodUsageHistoryUpdatedVersionwithCustomArrayListClass();
		
	}
	
	public static void arrayListCreation()
	{
		System.out.println("Do you want to create an arraylist : ");
		String str = sc.nextLine();
		if ( yesNoOption(str) ) 
		{
			System.out.println("Enter the type of ArrayList you want to create ( 1 - Integer / 2 - String ) : ");
			int arrListCreationType = sc.nextInt();
			
			if ( arrListCreationType == 1 )
			{
				arrListInt = new ArrayList<Integer>();
			}
			else if ( arrListCreationType == 2 )
			{
				arrListStr = new ArrayList<String>();
			}
			else
			{
				System.out.println("The ArrayList type you wanted to create is not in the option list.");
				System.out.println("So exiting tht program");
				System.exit(0);
			}	
		}	
	}
	
	public static void elementInsertion()
	{
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();
		
		if ( arrListInt != null )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the "+(i+1)+"th element to insert into the arraylist : ");
				arrListInt.add(sc.nextInt());
			}
			System.out.println();
		}
		else
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the "+(i+1)+"th element to insert into the arraylist : ");
				if ( i == 0 )
				{
					sc.nextLine();
				}
				arrListStr.add(sc.nextLine());
			}
			System.out.println();
		}
	}
	
	public static void printArrayList()
	{
		int random = ThreadLocalRandom.current().nextInt(0, 4);
		if( arrListInt != null ) 
		{
			if ( random == 0 ) 
			{
				for( int i = 0 ; i < arrListInt.size() ; i++ )
				{
					System.out.print(arrListInt.get(i)+" , ");
				}
			}
			else if ( random == 1 ) 
			{
				for( int i : arrListInt )
				{
					System.out.print(i+" , ");
				}
			}
			else if( random == 2 )
			{
				Iterator<Integer> arrListIntItr = arrListInt.iterator();
				while ( arrListIntItr.hasNext() )
				{
					System.out.print(arrListIntItr.next()+" , ");
				}
			}
			else if ( random == 3 )
			{
				System.out.println(arrListInt);
			}
			
		}
		else
		{
			if ( random == 0 ) 
			{
				for( int i = 0 ; i < arrListStr.size() ; i++ )
				{
					System.out.print(arrListStr.get(i));
				}
			}
			else if ( random == 1 ) 
			{
				for( String str : arrListStr )
				{
					System.out.print(str);
				}
			}
			else if( random == 2 )
			{
				Iterator<String> arrListStrItr = arrListStr.iterator();
				while ( arrListStrItr.hasNext() )
				{
					System.out.print(arrListStrItr.next()+" , ");
				}
			}
			else if ( random == 3 )
			{
				System.out.println(arrListStr);
			}
		}
		System.out.println();
	}
	
	public static void setMethodUsage()
	{
		System.out.println("Do you want to use set method ( Yes / No ) : ");
		if (arrListInt != null )
		{
			sc.nextLine();
		}
		String str = sc.nextLine();
		
		if( yesNoOption(str) )
		{
			System.out.println("Enter the number of elements you want to change : ");
			int setLength = sc.nextInt();
			
			if ( setLength > 0  )
			{
				if ( arrListInt != null ) 
				{
					arrListIntSetMethodUsageHistory = new ArrayList<CustomArrayListForIntSetMethodHistory>();
//					arrayListIntSetMethodUsageHistory = new HashMap<Integer,Integer>();
				}
				else if ( arrListStr != null )
				{
					arrListStrSetMethodUsageHistory = new ArrayList<CustomArrayListForStrSetMethodHistory>();
//					arrayListStrSetMethodUsageHistory = new HashMap<Integer,String>();

				}
				
				for ( int i = 0 ; i < setLength ; i++ )
				{
					System.out.println("Enter the index at which do you want to change the element : ");
					int setIndex = sc.nextInt();
					
					if ( arrListInt != null && setIndex > 0 && setIndex <= arrListInt.size() )
					{						
						System.out.println("Enter the element that you want to insert : ");
						int setElement = sc.nextInt();
						
						int oldElement = arrListInt.set( setIndex-1 , setElement );
						
//						arrayListIntSetMethodUsageHistory.put(setIndex-1,oldElement);
						
						arrListIntSetMethodUsageHistory.add(new CustomArrayListForIntSetMethodHistory(setIndex, oldElement));
						
					}
					else if ( arrListStr != null && setIndex > 0 && setIndex <= arrListStr.size() )
					{
						System.out.println("Enter the element that you want to insert : ");
						sc.nextLine();
						String setElement = sc.nextLine();
						
						String oldElement = arrListStr.set( setIndex-1 , setElement );
//						arrayListStrSetMethodUsageHistory.put(setIndex-1,oldElement);
						
						arrListStrSetMethodUsageHistory.add(new CustomArrayListForStrSetMethodHistory(setIndex, oldElement));

					}
					else
					{
						System.out.println("There is a mistake in creating the arraylist or the indexx that you want to chnage the element is out of the size of the ArrayList that is created.");
						System.out.println("So exiting the program.");
						System.exit(0);
					}
				}
			}
		}
		else
		{
			System.out.println("As you don't want to use the set method for the arraylist we are exiting the program.");
			System.exit(0);
		}
		
	}
	
//	public static void setMethodUsageHistory()
//	{
//		if ( arrayListIntSetMethodUsageHistory.size() != 0  )
//		{
//			printArrayList();
//			System.out.println(arrayListIntSetMethodUsageHistory);
//		}
//		else if ( arrayListStrSetMethodUsageHistory.size() != 0 )
//		{
//			printArrayList();
//			System.out.println(arrayListStrSetMethodUsageHistory);
//		}
//	}
	
	public static void setMethodUsageHistoryUpdatedVersionwithCustomArrayListClass()
	{
		if( arrListIntSetMethodUsageHistory != null && arrListIntSetMethodUsageHistory.size() != 0 )
		{
			printArrayList();
			System.out.println("Old elements replacement history ( index - oldValue) : ");
			System.out.println(arrListIntSetMethodUsageHistory);
		}
		else if ( arrListStrSetMethodUsageHistory != null && arrListStrSetMethodUsageHistory.size() != 0 )
		{
			printArrayList();
			System.out.println("Old elements replacement history ( index - oldValue) : ");
			System.out.println(arrListStrSetMethodUsageHistory);
		}
	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
