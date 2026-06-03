package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Program4CountOccurancesUsingCollectionFrequency 
{
	static ArrayList<?> arrList;
	
	static LinkedHashSet<?> linkedHashSet;
	
	public static void main ( String[] args )
	{
		CreateIntAndStrArray.main(args);
		
		arrList = CreateIntAndStrArray.returnArrayList();
		
		linkedHashSet = new LinkedHashSet<>(arrList);
		
		countOccurancesUsingCollectionFrequency();
	}
	
	public static void countOccurancesUsingCollectionFrequency()
	{
		
		for ( Object obj : linkedHashSet )
		{
			//Object obj = arrList.get(i);
			System.out.println("The number of times the occurance of element "+obj +" in the arraylist is "+Collections.frequency(arrList, obj));
			
		}
	}
}
