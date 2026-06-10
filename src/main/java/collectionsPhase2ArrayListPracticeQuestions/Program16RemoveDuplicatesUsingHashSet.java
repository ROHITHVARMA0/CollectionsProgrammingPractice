package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Program16RemoveDuplicatesUsingHashSet 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main( String[] args )
	{
		System.out.print("Do you want to create an ArrayList : ");
		if ( yesNoOption( sc.next() ) )
		{
			createArrayList();
			
			removeDuplicatesUsingLinkedHashSet();
		}
		else
		{
			System.out.println("As you don't want to create an arraylist we decided to quit the execution of the program.");
			return;
		}
	}
	
	public static void createArrayList()
	{
		System.out.print("Enter the type of Nested ArrayList you want to create ( 1 - Integer / 2 - String ) :  ");
		int arrayListCreationOption = sc.nextInt();
		
		if ( arrayListCreationOption != 1 && arrayListCreationOption != 2 )
		{
			System.out.println("Entered an invalid input.\nSo exiting the program");
			System.exit(0);
		}
		
		System.out.print("Enter the length of nested arraylist you want to create : ");
		int arrayListLength = sc.nextInt();
		
		if ( arrayListLength < 1 )
		{
			System.out.println("You have given an invalid input to craete a nested arraylist.\nSo exiting the program.");
			return;
		}
		
		if ( arrayListCreationOption == 1 )
		{
			createIntArrayList(arrayListLength);
		}
		if ( arrayListCreationOption == 2 )
		{
			createStrArrayList(arrayListLength);
		}
	}
	
	public static void createIntArrayList( int length)
	{
		arrListInt = new ArrayList<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+ 1) + "th element to be inserted into the list : ");
			arrListInt.add(sc.nextInt());
		}
	}
	
	public static void createStrArrayList(int length)
	{
		arrListStr = new ArrayList<String>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			if ( i == 0 )
			{
				sc.nextLine();
			}
			System.out.print("Enter the " + (i+ 1) + "th element to be inserted into the list : ");
			arrListStr.add(sc.nextLine());
		}
	}
	
	public static void removeDuplicatesUsingLinkedHashSet()
	{
		if ( arrListInt != null )
		{
			LinkedHashSet<Integer> intLinkHashSet = new LinkedHashSet<Integer>();
			for ( int num : arrListInt )
			{
				intLinkHashSet.add(num);
			}
			System.out.println("The arraylist after removing duplicates using LinkedHashSet : "+intLinkHashSet);
		}
		else if ( arrListStr != null )
		{
			LinkedHashSet<String> strLinkHashSet = new LinkedHashSet<String>();
			for ( String str : arrListStr )
			{
				strLinkHashSet.add(str);
			}
			System.out.println("The arraylist after removing duplicates using LinkedHashSet : "+strLinkHashSet);
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
