package collectionsPhase6ComparableComparator;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Program36SortListOfIntegersUsingComparable
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create an ArrayList of Integers and sort the ArrayList using Comparable ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.print("Do you want to create the ArrayList Manually ( 1 )  or Randomly ( 2 ) : ");
			Integer option = Program0003List.integerInput(sc);
			if ( option == null )
			{
				Program0003List.invalidInputText();
				return;
			}
			else if ( option == 1 )
			{
				ArrayList<Integer> arrList = Program0003List.manualArrayList();
				if ( arrList == null )
				{
					Program0003List.invalidInputText();
					return;
				}
				Collections.sort(arrList);
				System.out.println("The ArrayList after Sorting is : "+arrList);
				
			}
			else if ( option == 2 )
			{
				ArrayList<Integer> arrList = Program0003List.randomArrayList();
				Collections.sort(arrList);
				System.out.println("The ArrayList after Sorting is : "+arrList);
			}
			else
			{
				Program0003List.invalidInputText();
				return;
			}
		}
			
		sc.close();
	}
	 
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
