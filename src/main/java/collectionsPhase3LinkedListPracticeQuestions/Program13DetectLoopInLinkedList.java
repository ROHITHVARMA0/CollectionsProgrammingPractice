package collectionsPhase3LinkedListPracticeQuestions;

import java.util.HashSet;
import java.util.Scanner;
//import java.util.LinkedList;

public class Program13DetectLoopInLinkedList 
{
	
//	public static void main ( String[] args )
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Do you want to create a LinkedList to verify for a Loop in LinkedList : ");
//		if( yesNoOption(sc.next()) )
//		{
//			LinkedList<Integer> linList = createLinkedList(sc);
//			if ( linList != null )
//			{
//				
//			}
//		}
//		sc.close();
//	}
//	
//	public static LinkedList<Integer> createLinkedList(Scanner sc)
//	{
//		System.out.print("Enter the number of elements you want to insert into the LinkedList : ");
//		int length = sc.nextInt();
//		if ( length < 1 )
//		{
//			System.out.println("The input you entered to create the linkedlist is invalid.");
//			System.out.println("So stopping the execution of the program.");
//			return null;
//		}
//		LinkedList<Integer> linList = new LinkedList<Integer>();
//		for ( int i = 0 ; i < length ; i++ )
//		{
//			System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
//			linList.add(sc.nextInt());
//		}
//		return linList;
//	}
//	
//	public static boolean detectLoopInLinkedList()
//	{
//		
//		return false;
//	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to create a LinkedList to verify for a Loop in LinkedList : ");
		if( yesNoOption(sc.next()) )
		{
			createLinkedListAndDetectLoopWithNode(sc);
		}
		sc.close();
	}
	
	public static void createLinkedListAndDetectLoopWithNode(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the LinkedList : ");
		int length = sc.nextInt();
		if ( length < 1 )
		{
			System.out.println("The input you entered to create the linkedlist is invalid.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		
		ListNode head = null;
		ListNode tail = null;
		
		for ( int i = 0 ; i < length ; i++ )
		{
			  System.out.print("Enter the " + (i + 1) + "th element into the LinkedList : ");
			  ListNode newNode = new ListNode(sc.nextInt());
			  
			  if ( head == null )
			  {
				  head = newNode;
				  tail = newNode;
			  }
			  else
			  {
				  tail.next = newNode;
				  tail = tail.next;			//tail = newNode; - Past Version  
			  }
		}
		tail.next = head.next;
		
		if ( detectLoop(head) )
		{
			System.out.println("Loop Detected");
		}
		else
		{
			System.out.println("No loop detected.");
		}
	}
	
	public static boolean detectLoop(ListNode node)
	{
		HashSet<ListNode> visited = new HashSet<>();
		ListNode current = node;
		while ( current != null )
		{
			if ( visited.contains(current) )
			{
				return true;
			}
			visited.add(current);
			current = current.next;
		}
		return false;
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
