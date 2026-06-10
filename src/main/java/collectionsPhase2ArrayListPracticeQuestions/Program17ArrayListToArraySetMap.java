package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class Program17ArrayListToArraySetMap 
{
	
static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main( String[] args )
	{
		System.out.print("Do you want to create an ArrayList : ");
		if ( yesNoOption( sc.next() ) )
		{
			createArrayList();
			
			convertArrayListToArray();
			
			convertArrayListToSet();
			
			convertArrayListToMap();
		}
		else
		{
			System.out.println("As you don't want to create an arraylist we decided to quit the execution of the program.");
			return;
		}
	}
	
	public static void createArrayList()
	{
		System.out.print("Enter the type of ArrayList you want to create ( 1 - Integer / 2 - String ) :  ");
		int arrayListCreationOption = sc.nextInt();
		
		if ( arrayListCreationOption != 1 && arrayListCreationOption != 2 )
		{
			System.out.println("Entered an invalid input.\nSo exiting the program");
			System.exit(0);
		}
		
		System.out.print("Enter the length of arraylist you want to create : ");
		int arrayListLength = sc.nextInt();
		
		if ( arrayListLength < 1 )
		{
			System.out.println("You have given an invalid input to craete a nested arraylist.\nSo exiting the program.");
			return;
		}
		
		if ( arrayListCreationOption == 1 )
		{
			createIntArrayList(arrayListLength);
		}
		if ( arrayListCreationOption == 2 )
		{
			createStrArrayList(arrayListLength);
		}
	}
	
	public static void createIntArrayList( int length)
	{
		arrListInt = new ArrayList<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+ 1) + "th element to be inserted into the list : ");
			arrListInt.add(sc.nextInt());
		}
	}
	
	public static void createStrArrayList(int length)
	{
		arrListStr = new ArrayList<String>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			if ( i == 0 )
			{
				sc.nextLine();
			}
			System.out.print("Enter the " + (i+ 1) + "th element to be inserted into the list : ");
			arrListStr.add(sc.nextLine());
		}
	}
	
	public static void convertArrayListToArray()
	{
		if( arrListInt != null )
		{
			int[] intArr = new int[arrListInt.size()];
			System.out.print("The arraylist after conversion to array is : ");
			for ( int i = 0 ; i < intArr.length ; i++ )
			{
				intArr[i] = arrListInt.get(i);
				System.out.print(intArr[i]+" , ");
			}
			System.out.println();
//			System.out.println("The arraylist after conversion to array is : "+intArr);
		}
		else if( arrListStr != null )
		{
			String[] strArr = new String[arrListStr.size()];
			System.out.print("The arraylist after conversion to array is : ");
			for ( int i = 0 ; i < strArr.length ; i++ )
			{
				strArr[i] = arrListStr.get(i);
				System.out.print(strArr[i]+" , ");
			}
			System.out.println();
//			System.out.println("The arraylist after conversion to array is : "+strArr);
		}
		else if ( arrListInt == null && arrListStr == null )
		{
			System.out.println("Both the arraylists are null so the ArrayList To Array Conversion is Not Possible.");
			System.out.println("So exiting from the execution of program");
			return;
		}
	}
	
	public static void convertArrayListToSet()
	{
		if( arrListInt != null )
		{
			Set<Integer> intSet = new HashSet<Integer>();
			for ( int num : arrListInt )
			{
				intSet.add(num);
			}
			System.out.println("The arraylist after conversion to set is : "+intSet);
		}
		else if( arrListStr != null )
		{
			Set<String> strSet = new HashSet<String>();
			for ( String str : arrListStr )
			{
				strSet.add(str);
			}
			System.out.println("The arraylist after conversion to set is : "+strSet);
		}
		else if ( arrListInt == null && arrListStr == null )
		{
			System.out.println("Both the arraylists are null so the ArrayList To Set Conversion is Not Possible.");
			System.out.println("So exiting from the execution of program");
			return;
		}
	}
	
	public static void convertArrayListToMap()
	{
		if( arrListInt != null )
		{
			Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
			for ( int i = 0 ; i < arrListInt.size() ; i++ )
			{
				intMap.put(i, arrListInt.get(i));
			}
			System.out.println("The arraylist after conversion to map is : "+intMap);
		}
		else if( arrListStr != null )
		{
			Map<Integer, String> strMap = new HashMap<Integer, String>();
			for ( int i = 0 ; i < arrListStr.size() ; i++ )
			{
				strMap.put(i, arrListStr.get(i));
			}
			System.out.println("The arraylist after conversion to map is : "+strMap);
		}
		else if ( arrListInt == null && arrListStr == null )
		{
			System.out.println("Both the arraylists are null so the ArrayList To Set Conversion is Not Possible.");
			System.out.println("So exiting from the execution of program");
			return;
		}
	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
	
}
