package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class Program8PartitionOfEvennOddNumbers 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrList;
	
	static ArrayList<Integer> arrListOdd;
	static ArrayList<Integer> arrListEven;
	
	static ArrayList<Integer> arrListOddInt;
	static ArrayList<Integer> arrListEvenInt;
	
	public static void main ( String [] args )
	{
		createIntArrayList();
		
		partitionArrayList();
		
		printArrayLists();
	}
	
	public static void createIntArrayList()
	{
		arrList = new ArrayList<Integer>();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();
		
		if ( length > 0  )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + ( i+1 ) + "th element to insert into the arraylist : " );
				arrList.add( sc.nextInt() );
				
			}
		}
		if (length <= 0) {
		    System.out.println("Invalid size!");
		    return;
		}
		
	}
	
	public static void partitionArrayList()
	{
		arrListEven = new ArrayList<Integer>();
		arrListOdd = new ArrayList<Integer>();
		
		arrListEvenInt = new ArrayList<Integer>();
		arrListOddInt = new ArrayList<Integer>();
		
		for ( int i = 0 ; i < arrList.size() ; i++ )
		{
			int num = arrList.get(i);
			
			if ( num % 2 == 0 )
			{
				arrListEvenInt.add(num);
				if ( num > 0 )
				{
					arrListEven.add(num);
				}
			}
			else
			{
				arrListOddInt.add(num);
				if ( num > 0 )
				{
					arrListOdd.add(num);
				}
			}
		}
		
//		for ( int i = 0 ; i < arrList.size() ; i++ )
//		{
//			if ( arrList.get(i) % 2 == 0 )
//			{
//				arrListEvenInt.add(arrList.get(i));
//				if ( arrList.get(i) > 0 )
//				{
//					arrListEven.add(arrList.get(i));
//				}
//			}
//			else 
//			{
//				arrListOddInt.add(arrList.get(i));
//				if ( arrList.get(i) > 0 )
//				{
//					arrListOdd.add(arrList.get(i));
//				}
//			}
//		}
	}
	
	public static void printArrayLists()
	{
		System.out.println("The Original arraylist : "+arrList);
		System.out.println("The Odd Integer arraylist : "+arrListOddInt);
		System.out.println("The Odd numbers arraylist : "+arrListOdd);
		System.out.println("The Even Integer arraylist : "+arrListEvenInt);
		System.out.println("The Even Numbers arraylist : "+arrListEven);
	}
	
}
