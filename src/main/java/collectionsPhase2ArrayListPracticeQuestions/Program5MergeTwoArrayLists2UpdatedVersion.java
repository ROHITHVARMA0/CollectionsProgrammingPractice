package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Program5MergeTwoArrayLists2UpdatedVersion 
{	
	static Scanner sc = new Scanner(System.in);
	
	public static void main( String[] args )
	{
		ArrayList<Object> arrList1 = createArrayList();
		ArrayList<Object> arrList2 = createArrayList();
		
		System.out.println("Do you want to merge the arraylists ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			ArrayList<Object> mergedArrayList = new ArrayList<Object>();
			mergedArrayList.addAll(arrList1);
			mergedArrayList.addAll(arrList2);
			
			System.out.println(mergedArrayList);
		}
		
	}
	public static ArrayList<Object> createArrayList()
	{
		ArrayList<Object> arrayList = new ArrayList<>();
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayListCreateOption = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int arrayListLength = sc.nextInt();
		
		if ( arrayListCreateOption == 2 )
		{
			sc.nextLine();
		}
		
		for ( int i = 0 ; i < arrayListLength ; i++ )
		{
			System.out.print("Enter the "+ (i+1) + "th element to insert into the arraylist : ");
			if ( arrayListCreateOption == 1 )
			{
				arrayList.add( sc.nextInt() );
			}
			else if ( arrayListCreateOption == 2 )
			{
				arrayList.add( sc.nextLine() );
			}
			else
			{
				System.out.println("Invalid option.");
				return arrayList;
			}
		}
		return arrayList;
		
	}
	
	public static boolean yesNoOption( String str )
	{
		if ( str.equalsIgnoreCase( "YES" ) || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
}
