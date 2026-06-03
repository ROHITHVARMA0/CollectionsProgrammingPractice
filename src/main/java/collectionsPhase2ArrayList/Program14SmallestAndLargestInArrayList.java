package collectionsPhase2ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Iterator;

public class Program14SmallestAndLargestInArrayList 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to find the smallest and largest element in the arraylist ( YES / NO ) : ");
		String str = sc.next();
		
		if ( yesNoOption(str) )
		{
			arrayListCreation();
		}
		else
		{
			System.out.println("As you don't want to create an ArrayList.");
			System.out.println("Exiting the program.");
			System.exit(0);
		}
		
		printArrayList();
		
		findSmallestAndLargestElementInArrayList();
	}
	
	public static void arrayListCreation(  )
	{
		System.out.println("Enter the type of ArrayList you want to create ( 1 - Integer / 2 - String ) :  ");
		int arrayListCreationOption = sc.nextInt();
		
		if ( arrayListCreationOption == 1 )
		{
			//CreateIntArrayList.main(null);
			intArrayListCreation();
		}
		else if ( arrayListCreationOption == 2 )
		{
			//CreateStrArrayList.main(null);
			strArrayListCreation();
		}
		else
		{
			System.out.println("The option you selected is not there in the option list.");
			System.out.println("So exiting the program.");
			System.exit(0);
		}
	}
	
	public static void intArrayListCreation()
	{
		arrListInt = new ArrayList<Integer>();
		
		System.out.println("Enter the number of elements you want to insert into arraylist : ");
		int numberOfElements = sc.nextInt();
		
		for ( int i = 0 ; i < numberOfElements ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
			arrListInt.add(sc.nextInt());
		}
	}
	
	public static void strArrayListCreation()
	{
		arrListStr = new ArrayList<String>();
		
		System.out.println("Enter the number of elements you want to insert into arraylist : ");
		int numberOfElements = sc.nextInt();
		
		for ( int i = 0 ; i < numberOfElements ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
			if ( i == 0 )
			{
				sc.nextLine();
			}
			arrListStr.add(sc.nextLine());
		}
	}
	
	public static void printArrayList()
	{
		int random = ThreadLocalRandom.current().nextInt(0, 4);
		if ( arrListInt != null )
		{
			if ( random == 0 )
			{
				for ( int i = 0 ; i < arrListInt.size() ; i++ )
				{
					System.out.print(arrListInt.get(i)+" , ");
				}
			}
			else if ( random == 1 )
			{
				for ( int i : arrListInt )
				{
					System.out.print(i+ " , ");
				}
			}
			else if ( random == 2 )
			{
				Iterator<Integer> arrListIntIterator = arrListInt.iterator();
				while ( arrListIntIterator.hasNext() )
				{
					System.out.print(arrListIntIterator.next()+" , ");
				}
			}
			else if ( random == 3 )
			{
				System.out.print(arrListInt);
			}
		}
		else if ( arrListStr != null )
		{
			if ( random == 0 )
			{
				for( int i = 0 ; i < arrListStr.size() ; i++ )
				{
					System.out.print(arrListStr.get(i)+" , ");
				}
			}
			else if ( random == 1 )
			{
				for ( String str : arrListStr )
				{
					System.out.print(str+" , ");
				}
			}
			else if ( random == 2 )
			{
				Iterator<String> arrListStrIterator = arrListStr.iterator();
				while ( arrListStrIterator.hasNext() )
				{
					System.out.print(arrListStrIterator.next()+" , ");
				}
			}
			else if ( random == 3 )
			{
				System.out.print(arrListStr);
			}
		}
		System.out.println();
	}
	
	public static void findSmallestAndLargestElementInArrayList()
	{
		if ( arrListInt != null )
		{
			arrListInt.sort(null);
			System.out.println("Sorted ArrayList : ");
			printArrayList();
			System.out.println("The smallest element in the arraylist is : "+arrListInt.getFirst());
//			System.out.println("The smallest element in the arraylist is : "+arrListInt.get(0));
			System.out.println("The largest element in the arraylist is : "+arrListInt.getLast());
//			System.out.println("The largest element in the arraylist is : "+arrListInt.get(arrListInt.size()-1));
		}
		else if ( arrListStr != null )
		{
			arrListStr.sort(null);
			System.out.println("Sorted ArrayList : ");
			printArrayList();
			System.out.println("The smallest element in the arraylist is : "+arrListStr.getFirst());
//			System.out.println("The smallest element in the arraylist is : "+arrListStr.get(0));
			System.out.println("The largest element in the arraylist is : "+arrListStr.getLast());
//			System.out.println("The largest element in the arraylist is : "+arrListStr.get(arrListStr.size()-1));
		}
	}
	
//	public static void findSmallestElementInArrayList()
//	{
//		if ( CreateIntArrayList.arrListInt != null  )
//		{
//			CreateIntArrayList.arrListInt.sort(null);
//			System.out.println("Sorted ArrayList : "+CreateIntArrayList.arrListInt);
//			System.out.println("The smallest element in the arraylist is : " + CreateIntArrayList.arrListInt.getFirst() );
//			System.out.println("The largest element in the arraylist is : "+ CreateIntArrayList.arrListInt.getLast() );
//		}
//		else if ( CreateStrArrayList.arrListStr != null )
//		{
//			CreateStrArrayList.arrListStr.sort(null);
//			System.out.println("Sorted ArrayList : "+CreateStrArrayList.arrListStr);
//			System.out.println("The smallest element in the arraylist is : " + CreateStrArrayList.arrListStr.getFirst() );
//			System.out.println("The largest element in the arraylist is : "+ CreateStrArrayList.arrListStr.getLast() );
//		}
//	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y"))
		{
			return true;
		}
		
		return false;
	}
	
}
