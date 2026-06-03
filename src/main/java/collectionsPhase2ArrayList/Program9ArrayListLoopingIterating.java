package collectionsPhase2ArrayList;

import java.util.Scanner;
import java.util.Iterator;

public class Program9ArrayListLoopingIterating 
{
	
	//Learn about Iterator
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		
		
		System.out.println("Enter the type of array List data you want to add ( 0 - Integer / 1 - String ) : ");
		int typeOfList = sc.nextInt();
		
		if( typeOfList != 0 && typeOfList != 1 )
		{
			System.out.println("You have entered the wrong input.");
			System.exit(0);
		}
		
		System.out.println("Enter the length of the ArrayList to be created : ");
		int length = sc.nextInt();
		
		// CRITICAL: Consume the leftover newline character from sc.nextInt()
        sc.nextLine();
		
		if ( typeOfList == 0 )
		{
			int[] arr = new int[length];
			
			System.out.println("Entered the integer data to be loaded into the ArrayList");
			
			for ( int i = 0 ; i < length ; i ++ )
			{
				arr[i] = sc.nextInt();
				Program8ArrayListPracticeDemo.arrayListIntAdding(arr[i]);
			}
			
		}
		else if ( typeOfList == 1 )
		{
			String[] arr = new String[length];
			
			for ( int i = 0 ; i < length ; i ++ )
			{
				arr[i] = sc.nextLine();
				Program8ArrayListPracticeDemo.arrayListStr(arr[i]);
			}
			
		}
		
//		else
//		{
//			System.out.println("You have entered a wrong input.");
//			System.exit(0);
//		}
		
		System.out.println(Program8ArrayListPracticeDemo.arrLisInt);
		
		System.out.println("Enter a number to choose the looping or iterating way : \n1 - For Loop\n2 - Adavanced For Loop or For Each Loop\n3 - Iteration");
		
		int loopingScenario = sc.nextInt();
		
		if ( loopingScenario == 1 )
		{
		
			//For loop
			for( int i = 0 ; i < length ; i++ ) 
			{
				if( Program8ArrayListPracticeDemo.arrLisInt.size() != 0  )
				{
					System.out.print(Program8ArrayListPracticeDemo.arrLisInt.get(i) + " , ");
				}
				else 
				{
					System.out.print(Program8ArrayListPracticeDemo.arrListStr.get(i) + " , ");
				}
			}
			
		
		}
		
		
		//For each or advanced for loop
		if ( loopingScenario == 2 )
		{
			
			if( Program8ArrayListPracticeDemo.arrLisInt.size() != 0 )
			{
				for ( int i : Program8ArrayListPracticeDemo.arrLisInt )
				{
					System.out.print(i+" , ");
				}
			}
			else 
			{
				for ( String str : Program8ArrayListPracticeDemo.arrListStr )
				{
					System.out.print(str+" , ");
				}
			}
		
		}
		
		if ( loopingScenario == 3 )
		{
			
			if( Program8ArrayListPracticeDemo.arrLisInt.size() != 0 )
			{
				Iterator<Integer> arrIntIterator = Program8ArrayListPracticeDemo.arrLisInt.iterator();
				while( arrIntIterator.hasNext() )
				{
					int num = arrIntIterator.next();
					System.out.print(num + " ");
				}
			}
			else
			{
				Iterator<String> arrStrIterator = Program8ArrayListPracticeDemo.arrListStr.iterator();
				while( arrStrIterator.hasNext() )
				{
					String str = arrStrIterator.next();
					System.out.print(str + " , ");
				}
			}
			
		}
		
		else 
		{
			System.out.println("You have entered a input which is not in the range of looping scenario.\nOnce check the range.");
			System.out.println("Exiting the program");
			System.exit(0);
		}
		
		
		
		
		
		
		
	}
	
}
