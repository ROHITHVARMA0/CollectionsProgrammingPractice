package collectionsPhase3LinkedListPracticeQuestions;

import java.util.LinkedList;
import java.util.Scanner;

public class Program6MergeTwoLinkedLists 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to create two LinkedLists to merge them ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			LinkedList<Object> linListObj1 = createLinkedList();
			LinkedList<Object> linListObj2 = createLinkedList();
			
			if ( linListObj1 != null && linListObj2 != null )
			{
				mergeLinkedList(linListObj1, linListObj2);
			}
			else
			{
				System.out.println("As one or both the LinkedLists are empty we cannot perform the merging of the LinkedLists.");
				System.out.println("So stooping the execution of the program.");
				return;
			}
//			if ( linListInt != null )
//			{
//				intRemoveDuplicates();
//				intRemoveDuplicatesusingHashSet();
//			}
//			else if ( linListStr != null )
//			{
//				strRemoveDuplicates();
//				strRemoveDuplicatesusingHashSet();
//			}
		}
	}
	
	public static LinkedList<Object> createLinkedList()
	{
		System.out.print("Enter the number of elements you want to insert into the linkedlist : ");
		int length = sc.nextInt();
		
		if ( length < 1 )
		{
			System.out.println("The input you entered to create the linkedlist is invalid.");
			System.out.println("So stopping the execution of the program.");
			return null;
		}
		
		System.out.print("Enter the type of linkedlist you want to create ( 1 -  Integer / 2 - String ) : ");
		int linkedListCreationOption = sc.nextInt();
		
		if ( linkedListCreationOption != 1 && linkedListCreationOption != 2 )
		{
			System.out.println("You have enetered an invalid input to create an arraylist.");
			System.out.println("So stopping the execution of the program.");
			return null;
		}
		LinkedList<Object> list = new LinkedList<Object>();
		if ( linkedListCreationOption == 1 )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				list.add(sc.nextInt());
			}
			System.out.println("The LinkedList : "+list);
			return list;
		}
		else
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				if ( i == 0 )
				{
					sc.nextLine();
				}
				System.out.print("Enter the " + (i+1) + "th element to insert into the linkedlist : " );
				list.add(sc.nextLine());
			}
			System.out.println("The LinkedList : "+list);
			return list;
		}
	}
	
	public static void mergeLinkedList(LinkedList<Object> list1 , LinkedList<Object> list2)
	{
		LinkedList<Object> mergedLinkedList = new LinkedList<Object>(list1);
		mergedLinkedList.addAll(list2);
//		mergedLinkedList.addAll(linListObj2);
		System.out.println("The Merged LinkedList : "+mergedLinkedList);
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
