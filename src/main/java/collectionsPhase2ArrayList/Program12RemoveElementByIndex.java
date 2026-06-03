package collectionsPhase2ArrayList;

import java.util.Scanner;

public class Program12RemoveElementByIndex 
{
	
	static int optionOfArrayListCreation;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.println("Do you want to work on ArrayList ( YES / NO ) : ");
		String str = sc.nextLine();
		
		if( optionYesNo(str) )
		{
			System.out.println("So you want to work on ArrayList : ");
			System.out.println("So decide in which way you want to work on ArrayList - ");
			System.out.println("1 - Just Creating an ArrayList and Printing it");
			System.out.println("2 - Creating an ArrayList and Inserting an element into the ArrayList");
			System.out.println("3 - Creating an ArrayList and Inserting an element into the ArrayList and Removing a specific element by Value");
			System.out.println("4 - Creating an ArrayList and Inserting an element into the ArrayList and Removing a specific element by Index");
			
			optionOfArrayListCreation = sc.nextInt();
			
			arrayListCreationScenario(optionOfArrayListCreation);

		}
		else 
		{
			System.out.println("As you don't want to work on ArrayList.");
			System.out.println("Exiting the program.");
			System.exit(0);
		}
		
	}
	
	public static boolean optionYesNo( String str )
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
	public static void arrayListCreationScenario( int num ) 
	{
		if( num == 1  )
		{
			Program9ArrayListLoopingIterating.main(null);
		}
		else if ( num == 2 )
		{
			Program10AddElementAtSpecificIndexVersionUpdated.main(null);
		}
		else if ( num == 3 )
		{
			Program11RemoveElementByValue.main(null);
		}
		else if ( num == 4 )
		{
			Program10AddElementAtSpecificIndexVersionUpdated.main(null);
			
			System.out.println("Enter the index from which you have to remove the element : ");
			int index = sc.nextInt();
			
			removeElementFromArrayListByIndex(index);
		}
	}
	
	
	//Own code
	public static void removeElementFromArrayListByIndex ( int index )
	{
		
		if ( CreateIntArrayList.arrListInt != null && ( CreateIntArrayList.arrListInt.size() > 0 && CreateIntArrayList.arrListInt.size() > index ) )
		{
			System.out.println("Arraylist before removing the element fromt the "+index+"th index : ");
			CreateIntArrayList.printArrayList();
			System.out.println("We are removing the element at the index - "+index);
			CreateIntArrayList.arrListInt.remove(index-1);
			System.out.println("Arraylist after removing the element fromt the "+index+"th index : ");
			CreateIntArrayList.printArrayList();
		}
		else if ( CreateStrArrayList.arrListStr != null && ( CreateStrArrayList.arrListStr.size() > 0 && CreateStrArrayList.arrListStr.size() > index ) )
		{
			System.out.println("Arraylist before removing the element fromt the "+index+"th index : ");
			CreateStrArrayList.printArrayList();
			System.out.println("We are removing the element at the index - "+index);
			CreateStrArrayList.arrListStr.remove(index-1);
			System.out.println("Arraylist after removing the element fromt the "+index+"th index : ");
			CreateStrArrayList.printArrayList();

		}
		else
		{
			System.out.println("The index you want to remove is out of the index scope of arraylist.");
			System.out.println("So exiting the program");
			System.exit(0);
		}
	}
	
	//Copilot code
//	public static void removeElementFromArrayListByIndex(int index)
//	{
//	    if (CreateIntArrayList.arrListInt != null &&
//	        index >= 0 && index < CreateIntArrayList.arrListInt.size())
//	    {
//	        System.out.println("Before removal:");
//	        CreateIntArrayList.printArrayList();
//
//	        CreateIntArrayList.arrListInt.remove(index);
//
//	        System.out.println("After removal:");
//	        CreateIntArrayList.printArrayList();
//	    }
//	    else if (CreateStrArrayList.arrListStr != null &&
//	             index >= 0 && index < CreateStrArrayList.arrListStr.size())
//	    {
//	        System.out.println("Before removal:");
//	        CreateStrArrayList.printArrayList();
//
//	        CreateStrArrayList.arrListStr.remove(index);
//
//	        System.out.println("After removal:");
//	        CreateStrArrayList.printArrayList();
//	    }
//	    else
//	    {
//	        System.out.println("Invalid index.");
//	    }
//	}
	
	
}
