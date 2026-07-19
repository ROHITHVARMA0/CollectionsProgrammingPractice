package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;

public class Program15ReverseLinkedListIntoKgroups 
{
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to reverse the LinkedList into K groups ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			createLinkedListUsingListNode(sc);
		}
		sc.close();
	}
	
	public static void createLinkedListUsingListNode(Scanner sc)
	{
		ListNode head = null;
		ListNode tail = null;
		
		System.out.print("Enter the number of elements you want to insert into the LinkedList : ");
		int length = sc.nextInt();
		if ( length < 1 )
		{
			System.out.print("You have entered an Invalid input so Stopping the execution of the program.");
			return;
		}
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to insert into the LinkedList : ");
			ListNode newNode = new ListNode(sc.nextInt());
			if ( head == null )
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
		}
		if ( head.next != null )
		{
			reverseLinkedList(head,length,sc);
		}
	}
	
	public static void reverseLinkedList(ListNode head , int length,Scanner sc)
	{
		ListNode current = head;
		ListNode currentBackEnd = null;
		ListNode currentBackSt = null;
		
		while ( current != null )
		{
			ListNode newNode = new ListNode(current.val);
			if ( currentBackSt == null )
			{
				currentBackSt = newNode;
				currentBackEnd = newNode;
			}
			else
			{
				newNode.next = currentBackSt;
				currentBackSt = newNode;
//				currentBackSt.next = currentBackEnd;
			}
			current = current.next;
		}
		
		while ( currentBackSt != null )
		{
			System.out.println(currentBackSt.val);
			currentBackSt = currentBackSt.next;
		}
		if ( currentBackEnd != null )
		{
			splitReversedLinkedListintoKgroups(head,length,sc);
		}
	}
	
	public static void splitReversedLinkedListintoKgroups(ListNode head, int length, Scanner sc)
	{
		System.out.print("Enter the length of the group you want to split the LinkedList : ");
		int splitSize = sc.nextInt();
		if ( splitSize > length )
		{
			System.out.println("The current Size of the LinkedList is less than the SplitSIze you wanted.");
			System.out.println("So stopping the execution of the program.");
			return;
		}
		int count = 0;
		int group = 1;
		int groupCount = 0;
		while (head != null)
		{
			
			if ( group != groupCount)
			{
				System.out.println("\nThe "+group+"th split from the LinkedList : ");
				groupCount = group;
			}
			System.out.print(head.val+" , ");
			count++;
			if ( count == splitSize )
			{
				group++;
				count = 0;
			}
			head = head.next;
		}
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
