package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashSet;

public class Program5DeleteDuplicatesFromLinkedList 
{
	static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt ;
	static LinkedList<String> linListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to create a LinkedList to remove duplicates from it ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			if ( linListInt != null )
			{
//				intRemoveDuplicates();
				intRemoveDuplicatesusingHashSet();
			}
			else if ( linListStr != null )
			{
//				strRemoveDuplicates();
				strRemoveDuplicatesusingHashSet();
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
			System.out.println("The LinkedList before removal of duplicates : "+linListInt);
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
			System.out.println("The LinkedList before removal of duplicates : "+linListStr);

		}
	}
	
	public static void intRemoveDuplicates()
	{
		for ( int i = 0 ; i < linListInt.size() ; i++ )
		{
			for ( int j = i+1 ; j < linListInt.size() ; j++ )
			{
				if ( linListInt.get(i) == linListInt.get(j) )
				{
					linListInt.remove(j);
					j--;
				}
			}
		}
		System.out.println("The LinkedList after removal of duplicates : "+linListInt);
	}
	
	public static void intRemoveDuplicatesusingHashSet()
	{
		HashSet<Integer> intDuplicateRemoval = new HashSet<Integer>(linListInt);
		linListInt.clear();
		linListInt.addAll(intDuplicateRemoval);
		System.out.println("The LinkedList after removal of duplicates : "+linListInt);
//		System.out.println("The LinkedList after removal of duplicates : "+intDuplicateRemoval);

	}
	
	public static void strRemoveDuplicates()
	{
		for ( int i = 0 ; i < linListStr.size() ; i++ )
		{
			for ( int j = i+1 ; j < linListStr.size() ; j++ )
			{
				if ( linListStr.get(i).equals( linListStr.get(j) ) )
				{
					linListStr.remove(j);
					j--;
				}
			}
		}
		System.out.println("The LinkedList after removal of duplicates : "+linListStr);
	}
	
	public static void strRemoveDuplicatesusingHashSet()
	{
		HashSet<String> strDuplicateRemoval = new HashSet<String>(linListStr);
		linListStr.clear();
		linListStr.addAll(strDuplicateRemoval);
		System.out.println("The LinkedList after removal of duplicates : "+linListStr);
//		System.out.println("The LinkedList after removal of duplicates : "+strDuplicateRemoval);
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
