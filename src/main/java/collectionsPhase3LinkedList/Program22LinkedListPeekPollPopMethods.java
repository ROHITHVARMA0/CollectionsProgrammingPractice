package collectionsPhase3LinkedList;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Program22LinkedListPeekPollPopMethods 
{
	static Scanner sc = new Scanner(System.in);
	
	static LinkedList<Integer> linListInt;
	static LinkedList<String> linListStr;
	
	public static void main ( String[] args )
	{
		System.out.print("Do you want to create a linkedlist : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedList();
			
			if ( linListInt != null || linListStr != null )
			{
				performPeekPollPop();
			}
			else 
			{
				System.out.println("As the linkedlist is null we are exiting from the program.");
				return;
			}
		}
	}
	
	public static void createLinkedList()
	{
		System.out.print("Enter the number of elements you want to insert into the linkedlist : ");
		int length = sc.nextInt();
		
		if( length < 1 )
		{
			System.out.println("As you have entered an invalid input for the creation of linkedlist.");
			System.out.println("We are opting to stop the execution of the program.");
			return;
		}
		
		System.out.print("Enter the type of linkedlist you want to create ( 1 - Integer / 2 - String ) : ");
		int linkedListCreationOption = sc.nextInt();
		
		if ( linkedListCreationOption == 1 )
		{
			linListInt = new LinkedList<Integer>();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
				linListInt.add(sc.nextInt());
			}
			System.out.println("The Original LinkedList : "+linListInt);
		}
		else if ( linkedListCreationOption == 2 )
		{
			linListStr = new LinkedList<String>();
			sc.nextLine();
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + (i+1) + "th element to be inserted into the linkedlist : " );
				linListStr.add(sc.nextLine());
			}
			System.out.println("The Original LinkedList : "+linListStr);
		}
		else
		{
			System.out.println("As you have entered an invalid input for the type of linkedlist creation.");
			System.out.println("We have opted to stop the execution of the program.");
			return;
		}
	}
	
	public static void performPeekPollPop()
	{
		if ( linListInt != null )
		{
			System.out.print("Do you want to perform peek on the linkedlist : ");
			if ( yesNoOption(sc.next()) )
			{
				Integer peekInteger = linListInt.peek();
				if ( peekInteger != null )
				{
					System.out.println("peek on linkedlist : "+peekInteger);
				}
				else
				{
					System.out.println("The linkedlist is empty so cannot perform peek operation.");
				}
			}
			else
			{
				System.out.println("As you don't want to perform peek on linkedlist we are moving to other remaining methods.");
			}
			System.out.print("Do you want to perform poll on the linkedlist : ");
			if( yesNoOption(sc.next()) )
			{
				Integer pollInteger = linListInt.poll();
				if ( pollInteger != null )
				{
					System.out.println("poll on linkedlist : "+pollInteger);
				}
				else
				{
					System.out.print("As the linkedlist is empty and no element exists in the linkedlist we cannot perform poll on linkedlist.");
				}
			}
			else
			{
				System.out.println("As you don't want to perform poll on linkedlist we are moving to other remaining methods.");
			}
			System.out.print("Do you want to perform pop on the linkedlist : ");
			if( yesNoOption(sc.next()) )
			{
				try 
				{
					Integer popInteger =  linListInt.pop();
					System.out.println("pop on linkedlist : "+popInteger);
//					System.out.println("pop on linkedlist : "+linListInt.pop());
				}
				catch ( NoSuchElementException e )
				{
					System.out.print("As the linkedlist is empty and no element exists in the linkedlist we cannot perform pop on linkedlist.\nAnd the exception we caught while performing pop on linkedlist is ");
					e.printStackTrace();
					return;
				}
			}
			else
			{
				System.out.println("As you don't want to perform pop on linkedlist we are moving to other remaining methods.");
			}
			System.out.println("LinkedList after performing actions : "+linListInt);
		}
		else
		{
			System.out.print("Do you want to perform peek on the linkedlist : ");
			if ( yesNoOption(sc.next()) )
			{
				String peekString = linListStr.peek();
				if ( peekString != null )
				{
					System.out.println("peek on linkedlist : "+peekString);
				}
				else
				{
					System.out.println("The linkedlist is empty so cannot perform peek operation.");
				}
			}
			else
			{
				System.out.println("As you don't want to perform peek on linkedlist we are moving to other remaining methods.");
			}
			System.out.print("Do you want to perform poll on the linkedlist : ");
			if( yesNoOption(sc.next()) )
			{
				String pollString = linListStr.poll();
				if ( pollString != null )
				{
					System.out.println("poll on linkedlist : "+pollString);
				}
				else
				{
					System.out.print("As the linkedlist is empty and no element exists in the linkedlist we cannot perform poll on linkedlist.");
				}
			}
			else
			{
				System.out.println("As you don't want to perform poll on linkedlist we are moving to other remaining methods.");
			}
			System.out.print("Do you want to perform pop on the linkedlist : ");
			if( yesNoOption(sc.next()) )
			{
				try 
				{
					String popString =  linListStr.pop();
					System.out.println("pop on linkedlist : "+popString);
				}
				catch ( NoSuchElementException e )
				{
					System.out.print("As the linkedlist is empty and no element exists in the linkedlist we cannot perform pop on linkedlist.\nAnd the exception we caught while performing pop on linkedlist is ");
					e.printStackTrace();
					return;
				}
			}
			else
			{
				System.out.println("As you don't want to perform pop on linkedlist we are moving to other remaining methods.");
			}
			System.out.println("LinkedList after performing actions : "+linListStr);
		}
	}
	
	public static boolean yesNoOption( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
