package collectionsPhase2ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class CreateObjectArrayList 
{
	
	static ArrayList<Object> arrListObj ;
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		createObjectArrayList();
		
//		int length = sizeOfArrayList();
//		
//		insertElementsIntoArrayList(length);
		
		insertElementsIntoArrayList(sizeOfArrayList());
		
		printArrayList();
		
		elementInsertionOption();
	}
	
	public static void createObjectArrayList()
	{
		
		System.out.println("Do you want to create a ArrayList ( Yes - Y / No - N ) ? ");
		String str = sc.next();
		
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			arrListObj = new ArrayList<Object>();
			System.out.println("The ArrayList of Object generic is created.");
		}
		else
		{
			System.out.println("As you don't want to create an ArrayList system is exiting the program.");
			System.exit(0);
		}
	}
	
	public static int sizeOfArrayList() 
	{
		System.out.println("Enter the number of elements you want to add into the ArrayList : ");
		int size = sc.nextInt();
		
		sc.nextLine();
		
		return size;
	}
	
	
	public static void insertElementsIntoArrayList( int size )
	{
		for ( int i = 0 ; i < size ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element to be added into the ArrayList : ");
			arrListObj.add(sc.nextLine());
		}
		
		System.out.println();
	}
	
	public static void printArrayList()
	{
		
		int random = ThreadLocalRandom.current().nextInt(0, 2);
		
		System.out.println("The elements in the ArrayList are :");
		
		if ( random == 0 )
		{
			Iterator<Object> arrListItr = arrListObj.iterator();
			
			while ( arrListItr.hasNext() )
			{
				System.out.print(arrListItr.next()+" , ");
			}
		}
		else
		{
			System.out.println(arrListObj);
		}
		System.out.println();
		
	}
	
	public static void elementInsertionOption()
	{
		
		System.out.println("Do you want to insert element's into the ArrayList ( Yes - Y / No - N ) ? ");
		String str = sc.next();
		
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			System.out.println("You have preffered to add element's into the ArrayList.");
			insertElementIntoArrayList();
		}
		else
		{
			System.out.println("As you don't want to insert element's into the ArrayList system is exiting the program.");
			System.exit(0);
		}
		
	}
	
	public static void insertElementIntoArrayList()
	{
		
		System.out.println("Enter the number of elements you want to add into the arraylist : ");
		int insertionSize = sc.nextInt();
		
		for ( int i = 0 ; i < insertionSize ; i++ )
		{
			System.out.println("Enter the element you want to insert into the arraylist : ");
			sc.nextLine();
			String str = sc.nextLine();
			
			System.out.println("Enter the index at which you want to enter the element : ");
			int index = sc.nextInt();
			
			//arrListObj.add(index, str);
			
			if ( index >= 0 && index <= arrListObj.size() )
			{
				arrListObj.add(index, str);
			}
			else 
			{
				System.out.println("The index in which you want to store the element in arraylist is greater to its size.");
				System.out.println("Which results in throwing the IndexOutOfBounds Exception.");
				System.out.println("If you want to over come from this sistuation you can add the element at the last index of the arraylist.");
				System.out.println("Please give your opinion on whether to add the element in the arraylist as the last element or not ( Yes - Y / No - N ) : ");
				String addOpinion = sc.next();
				
				if ( addOpinion.equalsIgnoreCase("YES") || addOpinion.equalsIgnoreCase("Y") )
				{
					arrListObj.add(arrListObj.size(), str);
					System.out.println("The element you specified has been added as the last element of the arraylist.");
				}
				else
				{
					try
					{
						arrListObj.add(index, str);
					}
					catch ( Exception e )
					{
						System.out.println("The exception we caught due to adding the element at a certain index which is greater than the size of arraylist is : ");
						e.printStackTrace();
					}
				}
			}
		}
		
		printArrayList();
		
	}
	
}
