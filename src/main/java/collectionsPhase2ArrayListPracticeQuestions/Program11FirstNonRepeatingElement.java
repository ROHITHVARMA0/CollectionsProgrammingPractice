package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class Program11FirstNonRepeatingElement 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Object> arrList;
	
	public static void main( String[] args )
	{
		createArrayList();
		
		firstNonRepeatingElement();
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
	
	public static void firstNonRepeatingElement()
	{
		for ( int i = 0 ; i < arrList.size() ; i++ )
		{
			int count = 0;
			for ( int j = 0 ; j < arrList.size() ; j++ )
			{
				if ( i == j )
				{
					continue;
				}
				if ( arrList.get(i).equals( arrList.get(j) ) )
				{
					count++;
					break;
				}
//				if ( count > 0 )
//				{
//					continue;
//				}
			}
			if( count == 0 )
			{
				System.out.println("The first non-repeating element in the arraylist is : "+arrList.get(i));
				break;
			}
		}
	}
	
}
