package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Program5MergeTwoArrayLists 
{
	
	static ArrayList<Integer> arrListInt1;
	static ArrayList<Integer> arrListInt2;
	
	static ArrayList<String> arrListStr1;
	static ArrayList<String> arrListStr2;
	
	static ArrayList<Object> arrListMerged;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main( String[] args )
	{
		createArrayList();
		
		createArrayList();
		
		System.out.println("Do you want to merge the arraylists ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			mergeArrayList();
			
			printingMergedArrayListWithPrintlnMethod();
		}
		
	}
	public static void createArrayList()
	{
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayListCreateOption = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int arrayListLength = sc.nextInt();
		
		if ( arrayListCreateOption == 1 )
		{
			intArrayListCreation( arrayListLength );
		}
		else if ( arrayListCreateOption == 2 )
		{
			strArrayListCreation( arrayListLength );
		}
	}
	
	public static void intArrayListCreation( int length )
	{
		if ( arrListInt1 == null )
		{
			arrListInt1 = new ArrayList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
				arrListInt1.add(sc.nextInt());
			}
		}
		else
		{
			arrListInt2 = new ArrayList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
				arrListInt2.add(sc.nextInt());
			}
		}
	}
	
	
	public static void strArrayListCreation( int length )
	{
		if ( arrListStr1 == null )
		{
			arrListStr1 = new ArrayList<String>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
				if ( i == 0 )
				{
					sc.nextLine();
				}
				arrListStr1.add(sc.nextLine());
			}
		}
		else
		{
			arrListStr2 = new ArrayList<String>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
				if ( i == 0 )
				{
					sc.nextLine();
				}
				arrListStr2.add(sc.nextLine());
			}
		}
	}
	
	public static void mergeArrayList()
	{
		arrListMerged = new ArrayList<Object>();
		
		if( arrListInt1 != null )
		{
			arrListMerged.addAll(arrListInt1);
		}
		if ( arrListInt2 != null )
		{
			arrListMerged.addAll(arrListInt2);
		}
		if ( arrListStr1 != null )
		{
			arrListMerged.addAll(arrListStr1);
		}
		if ( arrListStr2 != null )
		{
			arrListMerged.addAll(arrListStr2);
		}
	}
	
	public static void printingMergedArrayListWithPrintlnMethod()
	{
		System.out.println(arrListMerged);
	}
	
	public static boolean yesNoOption( String str )
	{
		if ( str.equalsIgnoreCase( "YES" ) || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
