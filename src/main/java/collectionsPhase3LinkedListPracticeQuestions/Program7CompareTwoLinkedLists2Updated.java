package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class Program7CompareTwoLinkedLists2Updated 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Do you want to create two LinkedLists to compare them ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			LinkedList<Object> linListObj1 = createLinkedList();
			LinkedList<Object> linListObj2 = createLinkedList();
			if ( linListObj1 == null || linListObj2 == null )
			{
				System.out.println("As one or two LinkedLists are empty stoping the execution of the program.");
				return;
			}
			else
			{
				compareLength(linListObj1 , linListObj2);
				if ( linListObj1.size() == linListObj2.size() )
				{
					compareElementEqualityInOrderWithoutDuplicates(linListObj1,linListObj2);
//					compareElementEqualityAfterDuplicateRemoval(linListObj1,linListObj2);
				}
				else
				{
					compareElementEqualityAfterDuplicateRemoval(linListObj1,linListObj2);

				}
			}
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
			System.out.println("You have enetered an invalid input to create an LinkedList.");
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
	
	public static void compareLength(LinkedList<?> list1 , LinkedList<?> list2 )
	{
		System.out.println("The size of the first LinkedList is : "+list1.size());
		System.out.println("The size of the second LinkedList is : "+list2.size());
	}
	
	public static void compareElementEqualityInOrderWithoutDuplicates( LinkedList<Object> list1 , LinkedList<Object> list2 )
	{
		System.out.println("The size of both LinkedLists is "+list1.size()+" and equal.\nWe will now compare its Object equality.");
		if( list1.equals(list2) )
		{
			System.out.println("The both LinkedLists are having equal number of elements and are having same elements.");
		}
//		else if ( list1.containsAll(list2) )
//		{
//			System.out.println("The both LinkedLists are having same number of elements and the same elements but not in same order.");
//		}
		else
		{
			ArrayList<Object> arrList1 = new ArrayList<Object>(list1);
			ArrayList<Object> arrList2 = new ArrayList<Object>(list2);
			try 
			{
				arrList1.sort(null);
				arrList2.sort(null);
				if ( arrList1.equals(arrList2) )
				{
					System.out.println("Result: Both LinkedLists have the exact same elements and duplicate counts, but in a different order.");
				}
				else 
				{
					System.out.println("Result: Both LinkedLists have the same total size, but different elements or duplicate counts.");
				}
			}
			catch(Exception e)
			{
				System.out.println("Result: Both LinkedLists have the same total size, but different elements or duplicate counts.");
			}
//			System.out.println("Both LinkedLists have same number of elements but not the same elements.");
		}
	}
	
	public static void compareElementEqualityAfterDuplicateRemoval(LinkedList<Object> list1, LinkedList<Object> list2)
	{
//		boolean orderFlag = false;
//		boolean orderlessFlag = false;
		LinkedHashSet<Object> linHashSet1 = new LinkedHashSet<Object>(list1); 
		LinkedHashSet<Object> linHashSet2 = new LinkedHashSet<Object>(list2);
		
		if ( linHashSet1.size() == linHashSet2.size() )
		{
			if ( linHashSet1.equals(linHashSet2) )
			{
				System.out.println("The both LinkedLists are having equal number of elements and are having same elements with same order.");
			}
			else if ( linHashSet1.containsAll(linHashSet2) )
			{
				System.out.println("The both LinkedLists are having equal number of elements and are having same elements without same order.");
			}
			else
			{
				System.out.println("The both LinkedLists are not having all same elements.");
			}
		}
		else
		{
			System.out.println("As both LinkedLists does not have the same number of elements they are not equal.");
		}
//		list1.clear();
//		list1.addAll(linHashSet1);
//		list2.clear();
//		list2.addAll(linHashSet2);
//		
//		
//		for( int i = 0 ; i < list1.size() ; i++ )
//		{
//			if ( list1.get(i).equals(list2.get(i) ))
//			{
//				list1.remove(i);
//				list2.remove(i);
//				i--;
//				if ( list1.isEmpty() && list2.isEmpty() )
//				{
//					orderFlag = true;
//					break;
//				}
//			}
//			else
//			{
//				for ( Object obj : list1)
//				{
//					if ( list2.contains(obj) )
//					{
//						list1.remove(obj);
//						list2.remove(obj);
//						if ( list1.isEmpty() )
//						{
//							break;
//						}
//					}
//				}
//			}
//		}
//		for ( Object obj : linHashSet1 )
//		{
//			if ( linHashSet2.contains(obj) )
//			{
//				linHashSet1.remove(obj);
//				linHashSet2.remove(obj);
//			}
//		}
//		if ( orderFlag )
//		{
//			System.out.println("The both LinkedLists have the same elements with same order after duplicate elements removal.");
//		}
//		else
//		{
//			System.out.println("The both LinkedLists have the same elements without same order after duplicate elements removal.");
//		}
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
