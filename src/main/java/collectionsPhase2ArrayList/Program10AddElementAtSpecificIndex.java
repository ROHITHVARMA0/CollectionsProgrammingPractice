package collectionsPhase2ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Program10AddElementAtSpecificIndex 
{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrInt = new ArrayList<Integer>();
	
	static ArrayList<String> arrStr = new ArrayList<String>();
	
	public static void main(String[] args) 
	{
		
		int length = arrayListSize();
		
		createArrayList(length);
		
		printArrayList();
		
		int index = replacementIndex();
		
		addElementToArrayList(index);
		
		
	}
	
	public static int arrayListSize()
	{
		System.out.println("Enter the length of the ArrayList you wish to create : ");
		
		int length = sc.nextInt();
				
		return length;
		
	}
	
	public static void createArrayList(int size) 
	{
		
		if( size <= 0 )
		{
			System.out.println("The size of the ArrayList that you wish to create is either 0 or is negative.\nSo it is impossible to create a ArrayList of the size that you specified.");
			System.out.println("Exiting the program.");
			System.exit(0);
		}
		
		else
		{
			
			System.out.println("Enter the type of ArrayList you want to create ( 0 - Integer / 1 - String ) : ");
			int arrayListType = sc.nextInt();
			
			sc.nextLine();

			
			if( arrayListType == 0 )
			{
				System.out.println("Enter the integer data to be inserted into the ArrayList : ");
				for ( int i = 0 ; i < size ; i++ )
				{
					
					int num = sc.nextInt();
					arrInt.add(num);
					
				}
			}
			
			else if ( arrayListType == 1 )
			{
				System.out.println("Enter the string data to be inserted into the ArrayList : ");
				for ( int i = 0 ; i < size ; i++ )
				{
					
					String str = sc.nextLine();
					arrStr.add(str);
					
				}
				
			}
			
			else
			{
				
				System.out.println("The type of ArrayList you wanted to create is not specified by the Admin.");
				System.out.println("Exiting the program");
				System.exit(0);
				
			}
			
		}
		
	}
	
	
	public static void printArrayList()
	{
		
		if( arrInt.size() > 0 )
		{
			for(int i : arrInt) 
			{
				System.out.print(i+" , ");
			}
			System.out.println();
		}
		
		else if ( arrStr.size() > 0 )
		{
			Iterator<String> arrListStringItr = arrStr.iterator();
			while(arrListStringItr.hasNext())
			{
				System.out.print(arrListStringItr.next()+" , ");
			}
			System.out.println();
		}
		
		else 
		{
			System.out.println("No arraylist's are created.");
		}
		
	}
	
	public static int replacementIndex()
	{
		
		System.out.println("Enter the index where you want to add an element in the ArrayList : ");
		int index = sc.nextInt();
		
//		if( index >= 0 && ( index < arrInt.size() || index < arrStr.size() ) )
		if( arrInt.size() > 0 )
		{
			if ( index >= 0 && index <= arrInt.size() )
			{
				return index;
			}
		}
		else if ( arrStr.size() > 0 )
		{
			if( index >= 0 && index <= arrStr.size() )
			{
				return index;
			}
		}
		
		System.out.println("The index in which you want to place an element is Out of Index Size");
		System.exit(0);
		
		return -1;
		
	}
	
	public static void addElementToArrayList(int index)
	{
		
		if( arrInt.size() > 0  )
		{
			if ( index >= 0 && index <= arrInt.size() )
			{
				System.out.println("Enter the element you want to add in the ArrayList : ");
				int element = sc.nextInt();
				
				arrInt.add(index, element);
			}
		}
		else
		{
			if( arrStr.size() > 0 )
			{
				if ( index >= 0 && index <= arrStr.size() )
				{
					System.out.println("Enter the element you want to add in the ArrayList : ");
					sc.nextLine();
					
					String str = sc.nextLine();
					
					arrStr.add(index, str);
				}
			}
		}
		
		printArrayList();
		
	}
	
	
	
	
	
	
}
