package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class Program10LinkedListForLoopSlow 
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to test the performance and demonstrate the get(i) method in LinkedList ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
//			System.out.println("Enter the number of times you want to check the performance of the get i method in LinkedList : ");
//			int numTimesExecution = sc.nextInt();
			int[] array = new int[10];
			for ( int i = 0 ; i < 10 ; i++ )
			{
//				System.out.print("Enter the "+(i+1)+"th value for the number of elements to be tested for the performance of the get i method : ");
				array[i] = (i+1)*1000;
			}
			checkGetiMethod(array);
		}
		sc.close();
	}
	
	public static void checkGetiMethod(int[] array)
	{
		ArrayList<Double> arrListGetTime = new ArrayList<Double>();
		LinkedList<Double> linListGetTime = new LinkedList<Double>();
		for ( int i = 0 ; i < array.length ; i++ )
		{
			ArrayList<Integer> arrListInt = new ArrayList<Integer>();
			for ( int j = 0 ; j < array[i] ; j++ )
			{
				arrListInt.add(j);
			}
			long arrListStartTime = System.nanoTime();
			for ( int j = 0 ; j < arrListInt.size() ; j++ )
			{
				arrListInt.get(j);
			}
			long arrListEndTime = System.nanoTime();
			long arrListDuration = arrListEndTime - arrListStartTime;
			double arrTime = nanoToSec(arrListDuration);
			arrListGetTime.add(arrTime);
			System.out.println("The time taken for the ArrayList to use get(j) method for "+(array[i])+" elements in the ArrayList is : "+arrTime+" Sec");
			LinkedList<Integer> linListInt = new LinkedList<Integer>(arrListInt);
			long linListStartTime = System.nanoTime();
			for ( int j = 0 ; j < linListInt.size() ; j++ )
			{
				linListInt.get(j);
			}
			long linListEndTime = System.nanoTime();
			long linListDuration = linListEndTime - linListStartTime;
			double linTime = nanoToSec(linListDuration);
			linListGetTime.add(linTime);
			System.out.println("The time taken for the LinkedList to use get(j) method for "+(array[i])+" elements in the LinkedList is : "+linTime+" Sec");
		}
		double arrTime = 0.0;
		for ( Double num : arrListGetTime )
		{
			arrTime = arrTime + num;
		}
		double linTime = 0.0;
		for ( Double num : linListGetTime )
		{
			linTime = linTime + num;
		}
		System.out.println("The average time for the get i method for ArrayList is : "+arrTime/arrListGetTime.size());
		System.out.println("The average time for the get i method for LinkedList is : "+linTime/linListGetTime.size());
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
