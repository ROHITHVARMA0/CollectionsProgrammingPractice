package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Program7RotateArrayList 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to rotate an arrayList ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			createArrayList();
			System.out.print("Array List : ");
			printArrayListUsingPrintlnMethod();
			rotateArrayList();
			System.out.print("ArrayList after the rotation : ");
			printArrayListUsingPrintlnMethod();
		}
	}
	
	public static void createArrayList()
	{
		System.out.println("Enter the type of ArrayList you want to perform the rotation ( 1 - Integer / 2 - String ) : ");
		int arrayCreation = sc.nextInt();
		
		if ( arrayCreation != 1 && arrayCreation != 2 )
		{
			systemExit();
		}
		
		System.out.print("Enter the number of elements you want to insert into the arraylist :");
		int length = sc.nextInt();
		
		if ( length > 0 )
		{
			if ( arrayCreation == 1 )
			{
				arrListInt = new ArrayList<Integer>();
				for ( int i = 0 ; i < length ; i++ )
				{
					System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : ");
					 arrListInt.add( sc.nextInt() );
				}
			}
			else
			{
				arrListStr = new ArrayList<String>();
				sc.nextLine();
				for ( int i = 0 ; i< length ; i++ )
				{
					System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
					 arrListStr.add( sc.nextLine() );
				}
			}
//			for ( int i = 0 ; i < length ; i++ )
//			{
//				if ( arrayCreation == 1  )
//				{
//					arrListInt = new ArrayList<Integer>();
//					System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " +arrListInt.add( sc.nextInt() ) );
//				}
//				else if ( arrayCreation == 2 )
//				{
//					arrListStr = new ArrayList<String>();
//					System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " + arrListStr.add( sc.nextLine() ) );
//				}
//			}
		}
	}
	
	public static void rotateArrayList()
	{
		System.out.println("DO you want to rotate the arraylist left side or right side : \nPress 1 for Left Side rotation of ArrayList \nPress 2 for Right Side rotation of ArrayList\n");
		System.out.print("Enter the type of rotation you want to perform on arraylist : ");
		int rotationOption = sc.nextInt();
		if ( rotationOption == 1 )
		{
			rotateArrayListLeftSide();
		}
		else if ( rotationOption == 2 )
		{
			rotateArrayListRightSide();
		}
		else
		{
			systemExit();
		}
	}
	
	public static void rotateArrayListLeftSide()
	{
		System.out.print("Enter how many times you want to do left rotation : ");
		int rotation = sc.nextInt();
		int actualRotation = 0;
		if ( arrListInt != null )
		{
			if ( arrListInt.size() == 1 )
			{
				System.out.println("The size of the arraylist is 1 and even if we do any number of rotations the resulted arraylist is same.");
			}
			else if ( arrListInt.size() > 1 )
			{
				actualRotation = rotation % arrListInt.size() ;
				for ( int i = 0 ; i < actualRotation ; i++ )
				{
					int temp = arrListInt.get(0);
					arrListInt.remove(0);
					arrListInt.add(temp);
				}
			}
			else
			{
				System.out.println("The input that you entered is not valid");
				return;
			}
		}
		else
		{
			if ( arrListStr.size() == 1 )
			{
				System.out.println("The size of the arraylist is 1 and even if we do any number of rotations the resulted arraylist is same.");
			}
			else if ( arrListStr.size() > 1 )
			{
				actualRotation = rotation % arrListStr.size() ;
				for ( int i = 0 ; i < actualRotation ; i++ )
				{
					String temp = arrListStr.get(0);
					arrListStr.remove(0);
					arrListStr.add(temp);
				}
			}
			else
			{
				System.out.println("The input that you entered is not valid");
				return;
			}
		}
		
	}
	
	public static void rotateArrayListRightSide()
	{
		System.out.print("Enter how many times you want to do right rotation : ");
		int rotation = sc.nextInt();
		int actualRotation = 0;
		if ( arrListInt != null )
		{
			actualRotation = rotation % arrListInt.size();
			for ( int i = 0 ; i < actualRotation ; i++ )
			{
				int temp = arrListInt.get(arrListInt.size()-1);
				arrListInt.remove(arrListInt.size()-1);
				arrListInt.add(0,temp);
			}
		}
		else
		{
			actualRotation =  rotation % arrListStr.size();
			for ( int i = 0 ; i < actualRotation ; i++ )
			{
				String temp = arrListStr.get(arrListStr.size()-1);
				arrListStr.remove(arrListStr.size()-1);
				arrListStr.add(0,temp);
			}
		}
	}
	
	public static void systemExit()
	{
		System.out.println("As you have entered the Invalid Option.\nExiting the program.");
		System.exit(0);
	}
	
	public static void printArrayListUsingPrintlnMethod()
	{
		if ( arrListInt != null )
		{
			System.out.println(arrListInt);
		}
		else if ( arrListStr != null )
		{
			System.out.println(arrListStr);
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
