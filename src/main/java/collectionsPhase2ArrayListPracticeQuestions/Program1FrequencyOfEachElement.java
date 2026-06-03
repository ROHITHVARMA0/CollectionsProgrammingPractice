package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

public class Program1FrequencyOfEachElement 
{
	
	static ArrayList<?> arrList;
	
	public static void main ( String[] args )
	{
		CreateIntAndStrArray.main(args);
		
		arrayListStoring();
		
		frequencyFindingForElementsUsingLinkedHashSet();
		
		frequencyFindingForElementsUsingHashMap();
		
	}
	
	public static void arrayListStoring()
	{
		arrList = CreateIntAndStrArray.returnArrayList();
	}
	
	public static void frequencyFindingForElementsUsingLinkedHashSet()
	{
		LinkedHashSet<?> uniqueElementSet = new LinkedHashSet<>(arrList);
		
		ArrayList<?> uniqueElementArrayList = new ArrayList<>(uniqueElementSet);
		
		System.out.println("The frequency of elements by using LinkedHashSet.");
		
		for ( int i = 0 ; i < uniqueElementArrayList.size() ; i++ )
		{
			int count = 0 ;
			for ( int j = 0 ; j < arrList.size() ; j++ )
			{
				if ( uniqueElementArrayList.get(i).equals( arrList.get(j) ) )
				{
					count++;
				}
			}
			System.out.println("The frequency of the element " + uniqueElementArrayList.get(i) + " is " + count );
		}
	}
	
	public static void frequencyFindingForElementsUsingHashMap()
	{
		System.out.println("The frequency of elements by using HashMap.");
		
		HashMap<Object,Integer> uniqueElementHashMap = new HashMap<>();
		for ( Object obj : arrList )
		{
			uniqueElementHashMap.put(obj, uniqueElementHashMap.getOrDefault(obj, 0) + 1 );
		}
//		for ( int i = 0 ; i < arrList.size() ; i++ )
//		{
//			uniqueElementHashMap.put( arrList.get(i) , 0 );
//		}
		
		
//		for ( Map.Entry<Object,Integer> unique : uniqueElementHashMap.entrySet()  )
//		{
//			Object obj = unique.getKey();
//			int count = 0 ;
//			for ( int i = 0 ; i < arrList.size() ; i++ )
//			{
//				if ( obj.equals(arrList.get(i)) )
//				{
//					count++;
//				}
//			}
//			uniqueElementHashMap.put(obj, count);
//			System.out.println("The frequency of the element " + obj + " is " + count );
//		}
		
		uniqueElementHashMap.forEach((key,value) -> System.out.println("The frequency of element "+key+" is "+value));
		
		System.out.println(uniqueElementHashMap);
		
		for ( Map.Entry<Object,Integer> entry : uniqueElementHashMap.entrySet() )
		{
			System.out.println("The frequency of element "+ entry.getKey()+ " is "+entry.getValue());
		}
		
	}
	
}
