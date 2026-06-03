package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program6CommonElementsInArrayLists 
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main( String[] args )
	{
		ArrayList<Object> arrList1 = createArrayList();
		ArrayList<Object> arrList2 = createArrayList();
		
		System.out.println("Do you want to find the common elements in the arraylists ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) && arrList1 != null && arrList2 != null )
		{
//			findCommonElementsInArrayLists( arrList1 , arrList2 );
			findCommonElementsInArrayLists2(arrList1, arrList2);
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
	
	public static void findCommonElementsInArrayLists( ArrayList<?> arrList1 , ArrayList<?> arrList2 )
	{
		LinkedHashSet<Object> linkedHashSet1 = new LinkedHashSet<>(arrList1);
		LinkedHashSet<Object> linkedHashSet2 = new LinkedHashSet<>(arrList2);
		
		ArrayList<Object> arrayList1 = new ArrayList<>(linkedHashSet1);
		ArrayList<Object> arrayList2 = new ArrayList<>(linkedHashSet2);
		
		ArrayList<Object> commonElementsArrayList = new ArrayList<Object>();
		
		for ( int i = 0 ; i < arrayList1.size() ; i++ )
		{
			for ( int j = 0 ; j < arrayList2.size() ; j++ )
			{
				if ( arrayList1.get(i).equals(arrayList2.get(j)) )
				{
					System.out.print(arrayList1.get(i));
					commonElementsArrayList.add(arrayList1.get(i) +" , ");
				}
			}
		}

	}
	
	public static void findCommonElementsInArrayLists2( ArrayList<Object> arrList1 , ArrayList<Object> arrList2 )
	{
		Set<Object> set1 = new LinkedHashSet<>(arrList1);
		Set<Object> set2 = new LinkedHashSet<>(arrList2);
		
		set1.retainAll(set2);
		
		System.out.println(set1);
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
