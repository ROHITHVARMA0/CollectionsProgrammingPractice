package collectionsPhase3LinkedListPracticeQuestions;

import java.util.Scanner;
import java.util.LinkedList;

public class Program11StackQueueDequeUsingLinkedList 
{
	static LinkedList<Integer> linListStack ;
	static LinkedList<Integer> linListQueue ;
	static LinkedList<Integer> linListDeque ;

	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to implement Stack, Queue and Deque using LinkedList ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			dataPreparation();
			dataInput(sc);
			System.out.print("Do you want to perform the removal of the elements from the respective memory ( YES / NO ) : ");
			if ( yesNoOption(sc.next()) )
			{
				System.out.print("How many elements do you want to remove : ");
				int removalCycle = sc.nextInt();
				for ( int i = 0 ; i < removalCycle ; i++ )
				{
					removeElementFromStack();
					removeElementFromQueue();
					removeElementFromDeque(sc);
				}
			}
			else
			{
				return;
			}
			System.out.print("Do you want to view the element using the peek method from LinkedList perspective ( YES / NO ) : ");
			if ( yesNoOption(sc.next()) )
			{
				System.out.println("Peek Element from Stack : "+peekElementFromStack());
				System.out.println("Peek Element from Queue : "+peekElementFromQueue());
				System.out.println("Peek Element from Deque : "+peekElementFromDeque(sc));
			}
			else
			{
				return;
			}
		}
		sc.close();
	}
	
	public static void dataPreparation()
	{
		linListStack = new LinkedList<Integer>();
		linListQueue = new LinkedList<Integer>();
		linListDeque = new LinkedList<Integer>();
	}
	
	public static void dataInput(Scanner sc)
	{
		System.out.println("Enter the number of elements you want to enter in the respected data storage : ");
		int length = sc.nextInt();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th element value : ");
			int value = sc.nextInt();
			createStackUsingLinkedList(value);
			createQueueUsingLinkedList(value);
			createDequeUsingLinkedList(value,sc);
		}
	}
	
	public static void createStackUsingLinkedList( int num )
	{	
		linListStack.addLast(num);
	}
	
	public static void createQueueUsingLinkedList( int num )
	{
		linListQueue.addFirst(num);
	}
	
	public static void createDequeUsingLinkedList( int num , Scanner sc )
	{
		System.out.println("Where do you want to insert your element in the Deque ( 1 - First / 2 - Last ) : ");
		int insertionOption = sc.nextInt();
		if ( insertionOption == 1 )
		{
			linListDeque.addFirst(num);
		}
		else if ( insertionOption == 2 )
		{
			linListDeque.addLast(num);
		}
		else
		{
			System.out.println("As you have entered an invalid input we are stopping the execution of the program.");
			return;
		}
	}
	
	public static void removeElementFromStack ()
	{
		if ( !linListStack.isEmpty() )
		{
			linListStack.removeLast();
		}
		else
		{
			System.out.println("As the stack is empty we cannot remove element.");
			return;
		}
	}
	
	public static void removeElementFromQueue ()
	{
		if ( !linListQueue.isEmpty() )
		{
			linListQueue.removeLast();
		}
		else
		{
			System.out.println("As the queue is empty we cannot remove element.");
			return;
		}
	}
	
	public static void removeElementFromDeque ( Scanner sc )
	{
		if ( !linListDeque.isEmpty())
		{
			System.out.println("Where do you want to remove your element in the Deque ( 1 - First / 2 - Last ) : ");
			int insertionOption = sc.nextInt();
			if ( insertionOption == 1 )
			{
				linListDeque.removeFirst();
			}
			else if ( insertionOption == 2 )
			{
				linListDeque.removeLast();
			}
			else
			{
				System.out.println("As you have entered an invalid input we are stopping the execution of the program.");
				return;
			}
		}
		else
		{
			System.out.println("As the deque is empty we cannot remove element.");
			return;
		}
	}
	
	public static int peekElementFromStack()
	{
		if ( !linListStack.isEmpty() )
		{
			return linListStack.getLast();
		}
		else
		{
			System.out.println("As the Stack is empty we cannot peek for the element.");
			return 0;
		}
	}
	
	public static int peekElementFromQueue()
	{
		if ( !linListQueue.isEmpty() )
		{
			return linListQueue.getLast();
		}
		else
		{
			System.out.println("As the Queue is empty we cannot peek for the element.");
			return 0;
		}
	}
	
	public static int peekElementFromDeque(Scanner sc)
	{
		if ( !linListDeque.isEmpty() )
		{
			System.out.println("Where do you want to peek your element in the Deque ( 1 - First / 2 - Last ) : ");
			int insertionOption = sc.nextInt();
			if ( insertionOption == 1 )
			{
				return linListDeque.getFirst();
			}
			else if ( insertionOption == 2 )
			{
				return linListDeque.getLast();
			}
			else
			{
				System.out.println("As you have entered an invalid input we are stopping the execution of the program.");
				return 0;
			}
		}
		else
		{
			System.out.println("As the Deque is empty we cannot peek for the element.");
			return 0;
		}
	}
	
	public static boolean yesNoOption ( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
