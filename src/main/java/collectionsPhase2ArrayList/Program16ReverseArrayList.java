package collectionsPhase2ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program16ReverseArrayList 
{
	
static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to reverse arraylist ( YES / NO ) : ");
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
		
		reverseArrayList();
		
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
	
	public static void reverseArrayList()
	{
		System.out.println("Do you want to manually reverse an arraylist or use the reverse method ( 0 - Manual / 1 - Reverse Method ) : ");
		int reversingOption = sc.nextInt();
		if ( reversingOption == 0 )
		{
			if ( arrListInt != null )
			{
				int i = 0 ;
				int j = arrListInt.size() - 1 ;
				while ( i < j )
				{
					int temp = arrListInt.get(i);
					arrListInt.set(i, arrListInt.get(j));
					arrListInt.set(j,temp);	
					i++;
					j--;
				}
			}
			else if ( arrListStr != null )
			{
				int i = 0 ;
				int j = arrListStr.size()-1;
				while ( i < j )
				{
					String temp = arrListStr.get(i);
					arrListStr.set(i, arrListStr.get(j));
					arrListStr.set(j, temp);
					i++;
					j--;
				}
			}
			
//---------------------------When Using Collections.reverse method the arraylist 
//			gets reversed and stored so printing the arraylist at last of method is good and efficient approach -----------------
//			System.out.println("After the reversing of array : ");
//			printArrayList();
		}
		else if ( reversingOption == 1 )
		{
			if ( arrListInt != null )
			{
//				System.out.println("After the reversing of array : ");
//				System.out.println(arrListInt.reversed());
				Collections.reverse(arrListInt);
			}
			else if ( arrListStr != null )
			{
//				System.out.println("After the reversing of array : ");
//				System.out.println(arrListStr.reversed());
				Collections.reverse(arrListStr);
			}
			else
			{
				System.out.println("The arraylist reversing option you have opted is not inthe range.");
				System.out.println("So exiting the program.");
				System.exit(0);
			}
		}
		System.out.println("After the reversing of array : ");
		printArrayList();
		
	}
	
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y"))
		{
			return true;
		}
		
		return false;
	}
	
}
