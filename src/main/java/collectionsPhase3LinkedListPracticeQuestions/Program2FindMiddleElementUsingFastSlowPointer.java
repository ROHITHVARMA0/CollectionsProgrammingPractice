package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;

public class Program2FindMiddleElementUsingFastSlowPointer 
{
	static Scanner sc = new Scanner(System.in);
	static ListNode head = null;
	
	static LinkedList<Integer> linListInt;
	
//	static LinkedList<Integer> linListInt = new LinkedList<Integer>();
//	static LinkedList<String> linListStr = new LinkedList<String>();
	
	public static void main( String[] args )
	{
		System.out.println("Do you want to create a linkedlist to find middle element using slow-fast pointer approach ( YES / NO ) : ");
		if( yesNoOption( sc.next() ) )
		{
			System.out.println("Enter the number of elements you want to insert into the linkedlist (or) listnode : ");
			int length = sc.nextInt();
			if ( length < 1 )
			{
				System.out.println("As you have eneterd an invalid input to create a linkedlist (or) listnode\nExiting the program.");
				return;
			}
			
			createLinkedListAndListNode(length);
			
//			createLinkedList(length);
//			createListNode(length);
//			if ( ( linListInt!= null && linListInt.size() <= 1 ) || ( linListStr != null && linListStr.size() <= 1 ) )
//			{
//				System.out.println("As the size of linkedlist is 1 or linkedlist is empty.\n No need of reversing the linkedlist.");
//				return;
//			}
//			else
			{
				findingMiddleElementUsingSlowFastPointerApproach();
			}
		}
		else
		{
			System.out.println("As you don't want to create a linkedlist to experiment on how to reverse it without using built-in methods.");
			System.out.println("So no need of executing the program so decided to stop the execution of the program.");
			System.exit(0);
		}
	}
	
	public static void createLinkedList(int length)
	{
//		System.out.println("Enter the number of elements you want to insert into the linkedlist : ");
//		int length = sc.nextInt();
//		if ( length < 1 )
//		{
//			System.out.println("As you have eneterd an invalid input to create a linkedlist\nExiting the program.");
//			return;
//		}
//		else
//		{
			linListInt = new LinkedList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
				linListInt.add(sc.nextInt());
			}
//		}
		
//		System.out.print("Enter the type of linkedlist you want to create ( 1 - Integer / 2 - String ) : ");
//		int linkedListCreationType = sc.nextInt();
//		
//		if ( linkedListCreationType == 1 )
//			intLinkedListCreation(length);
//		else if ( linkedListCreationType == 2 )
//			strLinkedListCreation(length);
//		else
//			System.out.println("As you have eneterd an invalid input.\nExiting the program.");
//			return;
	}
	
	public static void createListNode(int length)
	{
//		System.out.println("Enter the number of elements you want to insert into the linkedlist : ");
//		int length = sc.nextInt();
//		if ( length < 1 )
//		{
//			System.out.println("As you have entered an invalid input to create a linkedlist\nExiting the program.");
//			return;
//		}
//		else
//		{
			System.out.println("Enter the 1st element : ");
			head = new ListNode(sc.nextInt());
			ListNode current = head;
			
			for ( int i = 1 ; i < length ; i++ )
			{
				System.out.println("Enter the " + ( i+1 ) +"th element to be inserted into the ListNode : " );
				current.next = new ListNode(sc.nextInt());
				current = current.next;
			}
//		}
	}
	
	public static void createLinkedListAndListNode(int length)
	{
		linListInt = new LinkedList<Integer>();
		System.out.print("Enter the 1st element to be inserte into the LinkedList and ListNode : ");
		int num = sc.nextInt();
		
		linListInt.add(num);
		head = new ListNode(num);
		ListNode current = head;
		
		for( int i = 1 ; i < length ; i++ )
		{
			System.out.print("Enter the " + ( i+1 ) +"th element to be inserted into the ListNode : " );
			int temp = sc.nextInt();
			linListInt.add(temp);
			current.next = new ListNode(temp);
			current = current.next;
		}
			
	}
	
//	public static void intLinkedListCreation(int length)
//	{
//		linListInt = new LinkedList<Integer>();
//		for ( int i = 0 ; i < length ; i++ )
//		{
//			System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
//			linListInt.add(sc.nextInt());
//		}
//		System.out.println("The Original LinkedList : "+linListInt);
//	}
//	
//	public static void strLinkedListCreation( int length )
//	{
//		linListStr = new LinkedList<String>();
//		sc.nextLine();
//		for ( int i = 0 ; i < length ; i++ )
//		{
//			System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
//			linListStr.add(sc.nextLine());
//		}
//		System.out.println("The Original LinkedList : "+linListStr);
//	}
	
	public static void findingMiddleElementUsingSlowFastPointerApproach()
	{
		if ( linListInt == null && head == null)
		{
			return;
		}
		else
		{
			//Code for finding the middle element of the linkedList using the size method
			long linkedListMiddleElementFindingStartTime = System.nanoTime();
			int middleElement = linListInt.get( linListInt.size()/2 );
			long linkedListMiddleElementFindingEndTime = System.nanoTime();
			System.out.println("The middle element of the linked list using the size method is : "+middleElement);
			
			System.out.println("The time taken to find the middle element in the linkedlist is : "+ nanoToSecConversion(linkedListMiddleElementFindingEndTime - linkedListMiddleElementFindingStartTime));
			
			//Code for finding the middle element of the linkedList using the ListNode data structure
			ListNode slow = head;
			ListNode fast = head;
			
			long listNodeMiddleElementFindingStartTime = System.nanoTime();
			
			while ( fast != null && fast.next != null )
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			long listNodeMiddleElementFindingEndTime = System.nanoTime();
			
			System.out.println("The middle value of the LinkedList in the ListNode data structure is : "+slow.val);
			System.out.println("The time taken to find the middle element in the linkedlist is : "+ nanoToSecConversion(listNodeMiddleElementFindingEndTime - listNodeMiddleElementFindingStartTime));

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
	
	public static double nanoToSecConversion ( long num )
	{
		return  ( double )num / 1000000000.0;
	}
	
}
