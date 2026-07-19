package collectionsPhase3LinkedListPracticeQuestions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

public class Program4DetectDuplicateElements 
{
static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt;
	static LinkedList<String> linListStr;
	
	public static void main ( String[] args )
	{
		System.out.print("Do you want to create a LinkedList ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			if ( linListInt != null )
			{
//				intFindDuplicateElement();
				intFindDuplicatesUsingHashMap();
			}
			else if ( linListStr != null )
			{
//				strFindDuplicateElement();
				strFindDuplicatesUsingHashMap();
			}
		}
	}
	
	public static void createLinkedList()
	{
		System.out.print("Enter the number of elements you want to insert into the linkedlist : ");
		int length = sc.nextInt();
		
		if ( length < 1 )
		{
			System.out.println("The input you entered to create the linkedlist is invalid.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		
		System.out.print("Enter the type of linkedlist you want to create ( 1 -  Integer / 2 - String ) : ");
		int linkedListCreationOption = sc.nextInt();
		
		if ( linkedListCreationOption != 1 && linkedListCreationOption != 2 )
		{
			System.out.println("You have enetered an invalid input to create an arraylist.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		else if ( linkedListCreationOption == 1 )
		{
			linListInt = new LinkedList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				linListInt.add(sc.nextInt());
			}
		}
		else
		{
			linListStr = new LinkedList<String>();
			for ( int i = 0 ; i < length ; i++ )
			{
				if ( i == 0 )
				{
					sc.nextLine();
				}
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				linListStr.add(sc.nextLine());
			}
		}
	}
	
	public static void intFindDuplicateElement()
	{
		HashSet<Integer> intLinListCopy = new HashSet<Integer>(linListInt);
		for ( int num : intLinListCopy )
		{
			int count = 0;
			for ( int j = 0 ; j < linListInt.size() ; j++ )
			{
				if ( num == linListInt.get(j) )
				{
					count++;
				}
			}
			if ( count > 1 )
			{
				System.out.println("The element "+num+" is a duplicate element because it is present in the LinkedList "+count +" times");
			}
		}
	}
	
	public static void intFindDuplicatesUsingHashMap()
	{
		HashMap<Integer,Integer> duplicateFinding = new HashMap<Integer,Integer>();
		for ( int num : linListInt )
		{
			duplicateFinding.put(num, duplicateFinding.getOrDefault(num, 0)+1);
		}
		for ( int num : duplicateFinding.keySet() )
		{
			if ( duplicateFinding.get(num) > 1 )
			{
				System.out.println("The element "+num+" is a duplicate element because it is present in the LinkedList "+duplicateFinding.get(num) +" times");				
			}
		}
	}
	
	public static void strFindDuplicateElement()
	{
		HashSet<String> strLinListCopy = new HashSet<String>(linListStr);
		for ( String str : strLinListCopy )
		{
			int count = 0;
			for ( int j = 0 ; j < linListStr.size() ; j++ )
			{
				if ( str.equals( linListStr.get(j) ) )
				{
					count++;
				}
			}
			if ( count > 1 )
			{
				System.out.println("The element "+str+" is a duplicate element because it is present in the LinkedList "+count +" times");
			}
		}
	}
	
	public static void strFindDuplicatesUsingHashMap()
	{
		HashMap<String,Integer> duplicateFinding = new HashMap<String,Integer>();
		for ( String str : linListStr )
		{
			duplicateFinding.put(str, duplicateFinding.getOrDefault(str, 0)+1);
		}
		for ( String str : duplicateFinding.keySet() )
		{
			if ( duplicateFinding.get(str) > 1 )
			{
				System.out.println("The element "+str+" is a duplicate element because it is present in the LinkedList "+duplicateFinding.get(str) +" times");				
			}
		}
	}
	
	public static boolean yesNoOption ( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
