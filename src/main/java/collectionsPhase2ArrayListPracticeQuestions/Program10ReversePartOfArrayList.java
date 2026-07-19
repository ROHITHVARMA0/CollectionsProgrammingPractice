package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class Program10ReversePartOfArrayList 
{
	
	static ArrayList<Object> arrList;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main( String[] args )
	{
		createArrayList();
		
		System.out.println("Original ArrayList : "+arrList);
		
		reversePartOfArrayList();
		
		System.out.println("ArrayList after the partial reversing : "+arrList);
	}


		
	public static void createArrayList()
	{
		arrList = new ArrayList<Object>();
			
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayCreationType = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();
		
		if ( arrayCreationType == 2 )
		{
			sc.nextLine();
		}
			
		if (length <= 0) {
		    System.out.println("Invalid size!");
		    return;
		}
		
		if ( length > 0  )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + ( i+1 ) + "th element to insert into the arraylist : " );
				if ( arrayCreationType == 1 )
				{
					arrList.add( sc.nextInt() );
				}
					if ( arrayCreationType == 2 )
				{
					arrList.add(sc.nextLine());
				}
			}
		}
	}
	
	public static void reversePartOfArrayList()
	{
		System.out.println("Do you want to reverse a part of arraylist ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.println("Enter the element index from where you want to reverse the arraylist : ");
			int index = sc.nextInt();
			index = index - 1;
			if ( index < 0 || index > arrList.size() )
			{
				System.out.println("The indexing you have mentioned is either greater than the size of arraylist or negative.");
//				System.out.println("So Exiting the program.");
//				System.exit(0);
				return;
			}
			
			else
			{
				int length = arrList.size() - 1 ;
				while( index < length )
				{
					
					Object obj1 = arrList.get(index);
					Object obj2 = arrList.get(length);
//					arrList.remove(index);
//					arrList.add( index , obj2 );
//					arrList.remove(length);
//					arrList.add( length , obj1 );
					arrList.set(index, obj2);
					arrList.set(length, obj1);
					index++;
					length--;
				}
					
			}
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
