package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class Program3RemoveOccurancesOfAGivenElementFromArrayList 
{
	
	static Scanner sc = new Scanner(System.in);
	
//	static ArrayList<Integer> arrListInt;
//	static ArrayList<String> arrListStr;
	
	static ArrayList<?> arrList;
	
	public static void main ( String[] args )
	{
		CreateIntAndStrArray.main(args);
		arrList = CreateIntAndStrArray.returnArrayList();
		
		removeOccurances();
		
		printArrayListUsingPrintln();
	}
	
	public static void removeOccurances()
	{
		System.out.println("Do you want to remove occurances from the arraylist ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.println("Enter the number of element's occurances you want to remove from the arraylist : ");
			int times = sc.nextInt();
			if ( genericFinding( arrList.get(0) ) == 1 )
			{
				for ( int i = 0 ; i < times ; i++ )
				{
					int count = 0 ;
					System.out.print("Enter the element you want to remove the occurances of it : ");
					int num = sc.nextInt();
					for ( int j = 0 ; j < arrList.size() ; j++ )
					{
						if ( arrList.get(j).equals(num) )
						{
							count++;
							if ( count > 1 )
							{
								arrList.remove(j);
								j--;
							}
						}
					}
				}
			}
			else if ( genericFinding( arrList.get(0) ) == 2 )
			{
				for ( int i = 0 ; i < times ; i++ )
				{
					int count = 0 ;
					System.out.print("Enter the element you want to remove the occurances of it : ");
					sc.nextLine();
					String str = sc.nextLine();
					for ( int j = 0 ; j < arrList.size() ; j++ )
					{
						if ( arrList.get(j).equals(str) )
						{
							count++;
							if ( count > 1 )
							{
								arrList.remove(j);
								j--;
							}
						}
					}
				}
			}
			else 
			{
				System.out.println("Not the generic type we have anticipated.");
				System.out.println("So exiting the program.");
				return;
			}
		}
	}
	
	public static boolean yesNoOption( String str )
	{
		if( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y") )
		{
			return true;
		}
		return false;
	}
	
	public static int genericFinding( Object obj )
	{
		if ( obj instanceof Integer )
		{
			return 1;
		}
		else if ( obj instanceof String )
		{
			return 2;
		}
		return 0;
	}
	
	public static void printArrayListUsingPrintln()
	{
		System.out.println(arrList);
	}
	
}
