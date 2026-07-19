package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;

public class Program2FindSecondLargestElement 
{
	static ArrayList<?> arrList;
	
	public static void main ( String[] args )
	{
		CreateIntAndStrArray.main(args);
		
		arrList = CreateIntAndStrArray.returnArrayList();
		
		arrListTypeDetectionAndSorting();
		
	}
	
	public static void arrListTypeDetectionAndSorting()
	{
		Object obj = arrList.get(0);
		//arrList.sort(null);
		if ( obj instanceof Integer )
		{
			intArrayListSorting();
		}
		else if ( obj instanceof String )
		{
			strArrayListSorting();
		}
		else
		{
			System.out.println("Exiting.........");
			return;
			
		}
	}
	
	public static void intArrayListSorting()
	{
		arrList.sort(null);
		System.out.println("The sorted arraylist is : "+ arrList);
		System.out.println("The second largest element in the arraylist is "+arrList.get(arrList.size()-2));
	}
	
	@SuppressWarnings("unchecked")
	public static void strArrayListSorting()
	{
		ArrayList<String> strArrList = ( ArrayList < String > ) ( arrList );
		arrList.sort(null);
		System.out.println("The second largest element in the arraylist according to sort(alphabetical)  method is "+arrList.get(arrList.size()-2));
		
		for ( int i = 0 ; i < strArrList.size() ; i++ )
		{
			for ( int j = i + 1 ; j < strArrList.size() ; j++ )
			{
				if ( strArrList.get(i).length() > strArrList.get(j).length() )
				{
					String temp = strArrList.get(i);
					strArrList.set(i, strArrList.get(j) );
					strArrList.set(j, temp);
				}
				else if ( strArrList.get(i).length() == strArrList.get(j).length() )
				{
					if ( strArrList.get(i).compareTo(strArrList.get(j)) > 0 )
					{
						String temp = strArrList.get(i);
						strArrList.set(i, strArrList.get(j) );
						strArrList.set(j, temp );
					}
				}
			}
		}
		
//		for ( int i = 0 ; i < arrList.size() ; i++ )
//		{
//			for ( int j = i+1 ; j < arrList.size() ; j++ )
//			{
//				if ( arrList.get(i).toString().length() > arrList.get(j).toString().length() )
//				{
//					String temp = (String)arrList.get(i);
//					arrList.set(i, arrList.get(j));
//					arrList.set(j, temp);
//				}
//			}
//		}
		
		PrintArrayPrintlnMethod.printArray(arrList);
		System.out.println("The second largest element in the arraylist according to the length is "+arrList.get(arrList.size()-2));
	}
	
}
