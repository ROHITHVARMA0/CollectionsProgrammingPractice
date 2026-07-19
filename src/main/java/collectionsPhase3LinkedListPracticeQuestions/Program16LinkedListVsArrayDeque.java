package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Program16LinkedListVsArrayDeque 
{
	
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to create a LinkedList and ArrayDeque for the comparision between them ( YES / NO ) : ");
		if (yesNoOption ( sc.next() ) )
		{
			createLinkedListAndArrayDeque();
		}
		sc.close();
	}
	
	public static void createLinkedListAndArrayDeque()
	{
		LinkedList<Integer> linList = new LinkedList<Integer>();
		ArrayDeque<Integer> arrDeque = new ArrayDeque<Integer>();
		//Insertion of 1000 elements
		long linListAddStartTime = System.nanoTime();
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			linList.add(i);
		}
		long linListAddEndTime = System.nanoTime();
		long linListAddDuration = linListAddEndTime - linListAddStartTime;
		System.out.println("The time taken to insert 1000 elements using add method into LinkedList : "+linListAddDuration+" nanoSec");
//		System.out.println("The time taken to insert 1000 elements using add method into LinkedList : "+nanoToSec(linListAddDuration)+" Sec");
		long arrDequeAddStartTime = System.nanoTime();
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			arrDeque.add(i);
		}
		long arrDequeAddEndTime = System.nanoTime();
		long arrDequeAddDuration = arrDequeAddEndTime - arrDequeAddStartTime;
		System.out.println("The time taken to insert 1000 elements using add method into ArrayDeque : "+arrDequeAddDuration+" nanoSec");
//		System.out.println("The time taken to insert 1000 elements using add method into LinkedList : "+nanoToSec(arrDequeAddDuration)+" Sec");
		//Insertion of 1000 elements using addFirst method
		long linListAddFirstStartTime = System.nanoTime();
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			linList.addFirst(i);
		}
		long linListAddFirstEndTime = System.nanoTime();
		long linListAddFirstDuration = linListAddFirstEndTime - linListAddFirstStartTime;
		System.out.println("The time taken to insert 1000 elements using addFirst method into LinkedList : "+linListAddFirstDuration+" nanoSec");
//		System.out.println("The time taken to insert 1000 elements using addFirst method into LinkedList : "+nanoToSec(linListAddFirstDuration)+" Sec");
		long arrDequeAddFirstStartTime = System.nanoTime();
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			arrDeque.addFirst(i);
		}
		long arrDequeAddFirstEndTime = System.nanoTime();
		long arrDequeAddFirstDuration = arrDequeAddFirstEndTime - arrDequeAddFirstStartTime;
		System.out.println("The time taken to insert 1000 elements using addFirst method into ArrayDeque : "+arrDequeAddFirstDuration+" nanoSec");
//		System.out.println("The time taken to insert 1000 elements using addFirst method into LinkedList : "+nanoToSec(arrDequeAddFirstDuration)+" Sec");
		//Insertion of 1000 elements using addlastMethod
		long linListAddLastStartTime = System.nanoTime();
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			linList.addLast(i);
		}
		long linListAddLastEndTime = System.nanoTime();
		long linListAddLastDuration = linListAddLastEndTime - linListAddLastStartTime;
		System.out.println("The time taken to insert 1000 elements using addLast method into LinkedList : "+linListAddLastDuration+" nanoSec");
		
		long arrDequeAddLastStartTime = System.nanoTime();
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			arrDeque.addLast(i);
		}
		long arrDequeAddLastEndTime = System.nanoTime();
		long arrDequeAddLastDuration = arrDequeAddLastEndTime - arrDequeAddLastStartTime;
		System.out.println("The time taken to insert 1000 elements using addLast method into ArrayDeque : "+arrDequeAddLastDuration+" nanoSec");
		//LinkedList getFirst method and ArrayDeque getFirst Duration
		long linListgetFirstStartTime = System.nanoTime();
			linList.getFirst();
		long linListgetFirstEndTime = System.nanoTime();
		long linListgetFirstDuration = linListgetFirstEndTime - linListgetFirstStartTime;
		System.out.println("The time taken to insert 1000 elements using getFirst method into LinkedList : "+linListgetFirstDuration+" nanoSec");
		
		long arrDequegetFirstStartTime = System.nanoTime();
			arrDeque.getFirst();
		long arrDequegetFirstEndTime = System.nanoTime();
		long arrDequegetFirstDuration = arrDequegetFirstEndTime - arrDequegetFirstStartTime;
		System.out.println("The time taken to insert 1000 elements using getFirst method into ArrayDeque : "+arrDequegetFirstDuration+" nanoSec");
		//LinkedList getLast method and ArrayDeque getLast Duration
		long linListgetLastStartTime = System.nanoTime();
			linList.getLast();
		long linListgetLastEndTime = System.nanoTime();
		long linListgetLastDuration = linListgetLastEndTime - linListgetLastStartTime;
		System.out.println("The time taken to insert 1000 elements using getLast method into LinkedList : "+linListgetLastDuration+" nanoSec");
		
		long arrDequegetLastStartTime = System.nanoTime();
			arrDeque.getLast();
		long arrDequegetLastEndTime = System.nanoTime();
		long arrDequegetLastDuration = arrDequegetLastEndTime - arrDequegetLastStartTime;
		System.out.println("The time taken to insert 1000 elements using getLast method into ArrayDeque : "+arrDequegetLastDuration+" nanoSec");
		
		//LinkedList and ArrayDeque remove method duration
		long linListRemoveStartTime = System.nanoTime();
		linList.remove();
		long linListRemoveEndTime = System.nanoTime();
		long linListRemoveDuration = linListRemoveEndTime - linListRemoveStartTime;
		System.out.println("The time taken to insert 1000 elements using getLast method into LinkedList : "+linListRemoveDuration+" nanoSec");
		
		long arrDequeRemoveStartTime = System.nanoTime();
			arrDeque.remove();
		long arrDequeRemoveEndTime = System.nanoTime();
		long arrDequeRemoveDuration = arrDequeRemoveEndTime - arrDequeRemoveStartTime;
		System.out.println("The time taken to insert 1000 elements using getLast method into ArrayDeque : "+arrDequeRemoveDuration+" nanoSec");

	}
	
	public static boolean yesNoOption ( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
	public static double nanoToSec( long num )
	{
		return (double)num/1000000000.0;
	}
	
}
