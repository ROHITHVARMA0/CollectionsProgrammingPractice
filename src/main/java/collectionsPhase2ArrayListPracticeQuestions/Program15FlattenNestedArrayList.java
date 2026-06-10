package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Program15FlattenNestedArrayList 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<ArrayList<Integer>> nestedArrListInt;
	static ArrayList<ArrayList<String>> nestedArrListStr;
	
	public static void main( String[] args )
	{
		System.out.print("Do you want to create a nested ArrayList : ");
		if ( yesNoOption( sc.next() ) )
		{
			createNestedArrayList();
			
			flattenNestedArrayList();
		}
		else
		{
			System.out.println("As you don't want to create an arraylist we decided to quit the execution of the program.");
			return;
		}
	}
	
	public static void createNestedArrayList()
	{
		System.out.print("Enter the type of Nested ArrayList you want to create ( 1 - Integer / 2 - String ) :  ");
		int nestedArrayListCreationOption = sc.nextInt();
		
		if ( nestedArrayListCreationOption != 1 && nestedArrayListCreationOption != 2 )
		{
			System.out.println("Entered an invalid input.\nSo exiting the program");
			System.exit(0);
		}
		
		System.out.print("Enter the length of nested arraylist you want to create : ");
		int nestedArrayListLength = sc.nextInt();
		
		if ( nestedArrayListLength < 1 )
		{
			System.out.println("You have given an invalid input to craete a nested arraylist.\nSo exiting the program.");
			return;
		}
		
		if ( nestedArrayListCreationOption == 1 )
		{
			createIntNestedArrayList(nestedArrayListLength);
		}
		if ( nestedArrayListCreationOption == 2 )
		{
			createStrNestedArrayList(nestedArrayListLength);
		}
	}
	
	public static void createIntNestedArrayList( int length)
	{
		nestedArrListInt = new ArrayList<ArrayList<Integer>>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			ArrayList<Integer> tempIntArrayList = new ArrayList<Integer>();
			System.out.print("Enter the length of the " + (i+1) + "th nested arraylist : ");
			int lengthOfArraylist = sc.nextInt();
			if ( lengthOfArraylist > 0 )
			{
				for ( int j = 0 ; j < lengthOfArraylist ; j++ )
				{
					System.out.print("Enter the " + (j+1) + "th element to be inserted into the " + (i+1) + "th list : ");
					tempIntArrayList.add(sc.nextInt());
				}
				nestedArrListInt.add(tempIntArrayList);
			}
		}
	}
	
	public static void createStrNestedArrayList(int length)
	{
		nestedArrListStr = new ArrayList<ArrayList<String>>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			ArrayList<String> tempStrArrayList = new ArrayList<String>();
			System.out.print("Enter the length of the " + (i+1) + "th nested arraylist : ");
			int lengthOfArraylist = sc.nextInt();
			if ( lengthOfArraylist > 0 )
			{
				for ( int j = 0 ; j < lengthOfArraylist ; j++ )
				{
					if ( j == 0 )
					{
						sc.nextLine();
					}
					System.out.print("Enter the " + (j+1) + "th element to be inserted into the " + (i+1) + "th list : ");
					tempStrArrayList.add(sc.nextLine());
				}
				nestedArrListStr.add(tempStrArrayList);
			}
		}
	}
	
	public static void flattenNestedArrayList()
	{
		if ( nestedArrListInt != null )
		{
			ArrayList<Integer> flattenIntArrayList = new ArrayList<Integer>();
			
			for ( int i = 0 ; i < nestedArrListInt.size() ; i++ )
			{
				for ( int j = 0 ; j < nestedArrListInt.get(i).size() ; j++ )
				{
					flattenIntArrayList.add(nestedArrListInt.get(i).get(j));
				}
			}
			System.out.println("The flattened nested arraylist : ");
			System.out.println(flattenIntArrayList);
		}
		else if ( nestedArrListStr != null )
		{
			ArrayList<String> flattenStrArrayList = new ArrayList<String>();
			
			for ( int i = 0 ; i < nestedArrListStr.size() ; i++ )
			{
				for ( int j = 0 ; j < nestedArrListStr.get(i).size() ; j++ )
				{
					flattenStrArrayList.add(nestedArrListStr.get(i).get(j));
				}
			}
			System.out.println("The flattened nested arraylist : ");
			System.out.println(flattenStrArrayList);
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
