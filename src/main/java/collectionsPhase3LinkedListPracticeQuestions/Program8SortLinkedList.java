package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;

public class Program8SortLinkedList
{
	static Scanner sc = new Scanner(System.in);
	
//	static LinkedList<?> linList;
	public static void main(String[] args)
	{
		System.out.println("Do you want to create a LinkedList so that you can sort the LinkedList that you have created ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
		}
	}
	
	public static void createLinkedList()
	{
		System.out.println("Enter the number of the elements you need to insert into the LinkedList : ");
		int length = sc.nextInt();
		
		System.out.println("Enter the type of LinkedList you want to create : ");
		System.out.println("1 - Integer");
		System.out.println("2 - String");
		System.out.println("3 - Boolean");
		System.out.println("4 - Byte");
		System.out.println("5 - Double");
		System.out.println("6 - Long");
		System.out.println("7 - Char");
		System.out.println("8 - Short");
		int linListCreationType = sc.nextInt();
		sc.nextLine();
		if ( linListCreationType == 1 )
		{
//			linList = new LinkedList<Integer>();
			createAndSortIntegerLinkedList(length);
		}
		else if ( linListCreationType == 2 )
		{
//			linList = new LinkedList<String>();
			createAndSortStringLinkedList(length);
		}
		else if ( linListCreationType == 3 )
		{
//			linList = new LinkedList<Boolean>();
			createAndSortBooleanLinkedList(length);
		}
		else if ( linListCreationType == 4 )
		{
//			linList = new LinkedList<Byte>();
			createAndSortByteLinkedList(length);
		}
		else if ( linListCreationType == 5 )
		{
//			linList = new LinkedList<Double>();
			createAndSortDoubleLinkedList(length);
		}
		else if ( linListCreationType == 6 )
		{
//			linList = new LinkedList<Long>();
			createAndSortLongLinkedList(length);
		}
		else if ( linListCreationType == 7 )
		{
//			linList = new LinkedList<Character>();
			createAndSortCharacterLinkedList(length);
		}
		else if ( linListCreationType == 8 )
		{
//			linList = new LinkedList<Short>();
			createAndSortShortLinkedList(length);
		}
		else
		{
			System.out.println("You have eneterd a wrong input for the creation of the LinkedList so stopping the execution of the program.");
			return;
		}
	}
	
	public static void createAndSortIntegerLinkedList( int length)
	{
		LinkedList<Integer> linList = new LinkedList<Integer>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextInt());
		}
		linList.sort(null);
		System.out.println(linList);
	}
	
	public static void createAndSortStringLinkedList( int length)
	{
		LinkedList<String> linList = new LinkedList<String>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextLine());
		}
		linList.sort(null);
		System.out.println(linList);
	}
	
	public static void createAndSortBooleanLinkedList( int length)
	{
		LinkedList<Boolean> linList = new LinkedList<Boolean>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextBoolean());
		}
		linList.sort(null);	
		System.out.println(linList);
	}
	
	public static void createAndSortByteLinkedList( int length)
	{
		LinkedList<Byte> linList = new LinkedList<Byte>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextByte());
		}
		linList.sort(null);	
		System.out.println(linList);
	}
	
	public static void createAndSortDoubleLinkedList( int length)
	{
		LinkedList<Double> linList = new LinkedList<Double>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextDouble());
		}
		linList.sort(null);
		System.out.println(linList);
	}
	
	public static void createAndSortLongLinkedList( int length)
	{
		LinkedList<Long> linList = new LinkedList<Long>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextLong());
		}
		linList.sort(null);
		System.out.println(linList);
	}
	
	public static void createAndSortCharacterLinkedList( int length)
	{
		LinkedList<Character> linList = new LinkedList<Character>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.next().charAt(0));
		}
		linList.sort(null);
		System.out.println(linList);
	}
	
	public static void createAndSortShortLinkedList( int length)
	{
		LinkedList<Short> linList = new LinkedList<Short>();
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the Linked : ");
			linList.add(sc.nextShort());
		}
		linList.sort(null);
		System.out.println(linList);
	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
}
