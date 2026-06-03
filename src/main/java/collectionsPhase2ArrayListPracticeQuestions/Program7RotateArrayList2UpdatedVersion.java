package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program7RotateArrayList2UpdatedVersion 
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
		}
	}
	
	public static void rotateArrayList()
	{
		System.out.println("DO you want to rotate the arraylist left side or right side : \nPress 1 for Left Side rotation of ArrayList \nPress 2 for Right Side rotation of ArrayList\n");
		System.out.print("Enter the type of rotation you want to perform on arraylist : ");
		int rotationOption = sc.nextInt();
		System.out.print("Enter the number of rotations you need to perform on arraylist : ");
		int arrayRotations = sc.nextInt();
		int size = (arrListInt != null) ? arrListInt.size() : arrListStr.size();
		int actualRotations = arrayRotations % size;
		if ( rotationOption == 1 && arrListInt != null )
		{
			Collections.rotate(arrListInt, actualRotations );
		}
		else if ( rotationOption == 1 && arrListStr != null )
		{
			Collections.rotate(arrListStr, actualRotations);
		}
		else if ( rotationOption == 2 && arrListInt != null )
		{
			Collections.rotate(arrListInt, -actualRotations);
		}
		else if ( rotationOption == 2 && arrListStr != null )
		{
			Collections.rotate(arrListStr, -actualRotations);
		}
		else
		{
			systemExit();
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
