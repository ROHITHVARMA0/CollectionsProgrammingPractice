package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class Program9ForLoopVsForEachVsIterator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to create a LinkedList to compare the performance between For Loop , For Each and Iterator ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList(sc);
		}
		else
		{
			System.out.println("As you are not interested in the execution this specific code we are stopping the execution of the code.");
			return;
		}
		sc.close();
	}
	
	public static void createLinkedList( Scanner sc)
	{
		System.out.println("Enter the number of elements you want to insert into the LinkedList : ");
//		int length = sc.nextInt();
		
		LinkedList<Integer> linList = new LinkedList<Integer>();
		
//		for ( int i = 0 ; i < length ; i++ )
//		{
//			System.out.print("Enter the "+(i+1)+"th element to insert into the LinkedList : ");
//			linList.add(sc.nextInt());
//		}
		for ( int i = 0 ; i < 1000 ; i++ )
		{
			linList.add(i);
		}
		if ( linList != null && linList.size() > 1 )
		{
			forLoop(linList);
			forEachLoop(linList);
			iteratorMethod(linList);
		}
	}
	
	public static void forLoop(LinkedList<Integer> list)
	{
		long forLoopStartTime = System.nanoTime();
		for ( int i = 0 ; i< list.size() ; i++ )
		{
			list.get(i);
		}
		long forLoopEndTime = System.nanoTime();
		long forLoopDuration = forLoopEndTime - forLoopStartTime;
		System.out.println("The time taken to go through every element in the LinkedList using For Loop : "+nanoToSec(forLoopDuration)+" Sec");
	}
	
	public static void forEachLoop(LinkedList<Integer> list)
	{
		int count = 0;
		long forEachLoopStartTime = System.nanoTime();
		for ( int num : list )
		{
			count++;
		}
		long forEachLoopEndTime = System.nanoTime();
		long forEachLoopDuration = forEachLoopEndTime - forEachLoopStartTime;
		System.out.println("The time taken to go through every element in the LinkedList using ForEach Loop : "+nanoToSec(forEachLoopDuration)+" Sec");
	}
	
	public static void iteratorMethod( LinkedList<Integer> list )
	{
		Iterator<Integer> listIterator = list.iterator();
		long iteratorStartTime = System.nanoTime();
		while ( listIterator.hasNext() )
		{
			listIterator.next();
		}
		long iteratorEndTime = System.nanoTime();
		long iteratorDuration = iteratorEndTime - iteratorStartTime;
		System.out.println("The time taken to go through every element in the LinkedList using Iterator : "+nanoToSec(iteratorDuration)+" Sec");
	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
	public static double nanoToSec(long num)
	{
		return (double)num / 1000000000.0;
	}
	
}
