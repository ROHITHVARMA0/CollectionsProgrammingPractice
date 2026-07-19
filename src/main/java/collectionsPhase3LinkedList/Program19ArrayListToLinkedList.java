package collectionsPhase3LinkedList;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Program19ArrayListToLinkedList 
{	
	static Scanner sc = new Scanner(System.in);
	
	static List<Object> arrListObj;
	static List<Object> linListObj;
	
	public static void main(String[] args)
	{
		System.out.println("Do you want to create an arraylist to convert to linkedlist : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createArrayList();
			
			convertArrayListToLinkedListMethod();
		}
	}
	
	public static void createArrayList()
	{
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();
		
		if (  length < 1 )
		{
			System.out.println("You have provided an invalid length to create an ArrayList.");
			System.out.println("So stopping the execution of the program");
			return;
		}
		else 
		{
			arrListObj = new ArrayList<Object>();
		}
		
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayListCreateOption = sc.nextInt();
		if ( arrayListCreateOption == 2 )
		{
			sc.nextLine();
		}
		
		if ( arrayListCreateOption != 1 && arrayListCreateOption != 2 )
		{
			System.out.println("You have enetered an invalid input to create an arraylist.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		else if ( arrayListCreateOption == 1 )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) +"th element to insert into the element : ");
				arrListObj.add(sc.nextInt());
			}
		}
		else 
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) +"th element to insert into the element : ");
				arrListObj.add(sc.nextLine());
			}
		}
		System.out.println("The ArrayList that is created : "+arrListObj);
	}
	
//	public static void convertArrayListToLinkedList()
//	{
//		linListObj = new LinkedList<Object>();
//		for ( int i = 0 ; i < arrListObj.size() ; i++ )
//		{
//			linListObj.add(arrListObj.get(i));
//		}
//		System.out.println("The LinkedList after getting converted from ArrayList is : "+linListObj);
//	}
	
	public static void convertArrayListToLinkedListMethod()
	{
		linListObj = new LinkedList<Object>(arrListObj);
		System.out.println("The LinkedList after getting converted from ArrayList is : "+linListObj);
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
