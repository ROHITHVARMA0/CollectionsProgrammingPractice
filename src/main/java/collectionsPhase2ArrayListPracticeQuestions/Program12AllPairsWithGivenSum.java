package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class Program12AllPairsWithGivenSum 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrList;
	
	public static void main( String[] args )
	{
		createIntArrayList();
		
		if ( arrList != null && arrList.size() > 1 )
		{
			findSumPairs();
		}
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
	
	public static void findSumPairs()
	{
		
		System.out.println("Enter the sum you need to find in the arraylist : ");
		int sum = sc.nextInt();
		
		for ( int i = 0 ; i < arrList.size() ; i++ )
		{
			int num1 = arrList.get(i);
			for ( int j = i + 1 ; j < arrList.size() ; j++ )
			{
				int num2 = arrList.get(j);
				if ( num1+num2 == sum )
				{
					System.out.println("[ "+num1+" , "+num2+" ]");
				}
			}
		}
	}
	
}
