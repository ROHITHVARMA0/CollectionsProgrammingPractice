package collectionsPhase6ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program36SortListOfIntegersUsingComparator 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create an ArrayList of Integers and sort the ArrayList using Comparator ( YES / NO ) : ");
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
				
				System.out.println("The ArrayList before Sorting is : "+arrList);
				
				Collections.sort(arrList,  ascendingComparator );
				System.out.println("The ArrayList after Sorting is : "+arrList);

				
			}
			else if ( option == 2 )
			{
				ArrayList<Integer> arrList = Program0003List.randomArrayList();
				
				System.out.println("The ArrayList before Sorting is : "+arrList);
				
				Collections.sort(arrList, ascendingComparator);
				
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
	
	static Comparator<Integer> ascendingComparator = new Comparator<Integer>()
	{
	    @Override
	    public int compare(Integer a, Integer b)
	    {
	        return a.compareTo(b);
	    }
	};
	
	
}
