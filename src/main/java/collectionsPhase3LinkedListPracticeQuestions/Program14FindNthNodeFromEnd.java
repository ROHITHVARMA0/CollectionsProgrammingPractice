package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;

public class Program14FindNthNodeFromEnd 
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Do you want to create a LinkedList to find the Nth node from the end : ");
		if ( yesNoOption(sc.next()) )
		{
			createLinkedList(sc);
		}
		sc.close();
	}
	
	public static void createLinkedList(Scanner sc)
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
				tail = newNode;
			}
		}
		if ( head != null && length > 1 )
		{
			findNthNodeFromEnd(head, sc, length);
		}
	}
	
	public static void findNthNodeFromEnd(ListNode head , Scanner sc, int length)
	{
		System.out.print("Enter the Element Index you want to find from the end : ");
		int index = sc.nextInt();
		ListNode current  = head;
		ListNode currentPrev = head;
		if ( index <= 0 || index > length )
		{
		    System.out.println("As you have entered invalid input exiting the program execution.");
		    return;
		}
//		if ( index <= 0 )
//		{
//			System.out.println("As you have enetered invalid input exiting the program execution.");
//			return;
//		}
		else
		{
			int count = 0;
			while ( current != null )
			{
				current = current.next;
				if ( count >= index)
				{
					currentPrev = currentPrev.next;
				}
				count++;
			}
		}
		System.out.println("The "+(index)+"th element from the end of LinkedList is : "+currentPrev.val);
		
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
