package collectionsPhase3LinkedList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Program23ArrayListVsLinkedList 
{
	
	static LinkedHashMap<String, Double> arrayListTime = new LinkedHashMap<String, Double>();
	static LinkedHashMap<String, Double> linkedListTime = new LinkedHashMap<String, Double>();
	
	static ArrayList<Integer> arrListInt;
	static LinkedList<Integer> linListInt;
	
	public static void main(String[] args)
	{
		long programStartTime = System.nanoTime();
		
		createArrayList();
		
		createLinkedList();
		
		addElementIntoArrayList();
		
		addElementIntoLinkedList();
		
		removeArrayList();
		
		removeLinkedList();
		
		accessArrayList();
		
		accessLinkedList();
		
//		printArrayList();
//		
//		printLinkedList();
		
		printTime();
		
		long programEndTime = System.nanoTime();
		long programDuration = programEndTime - programStartTime;
		
		System.out.println("Total Program Execution Duration :  "+nanoToSecond(programDuration)+" Seconds.");
	}
	
//	1 second = 1000000000 nanoseconds
	
	public static void createArrayList()
	{
		long arrayListCreationStartTime = System.nanoTime();
		
		arrListInt = new ArrayList<Integer>();
		
		long arrayListCreationEndTime = System.nanoTime();
		long arrayListCreationDuration = arrayListCreationEndTime - arrayListCreationStartTime;
		
//		System.out.println("The ArrayList Creation Time is : "+arrayListCreationDuration+" NanoSeconds.");
//		System.out.println("The ArrayList Creation Time is : "+nanoToSecond(arrayListCreationDuration)+" Seconds");
		arrayListTime.put("ArrayList Creation Duration ", nanoToSecond2(arrayListCreationDuration) );
		
		long arrayListInsertionStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 1000000 ; i++ )
		{
			arrListInt.add(i);
		}
		
		long arrayListInsertionEndTime = System.nanoTime();
		long arrayListInsertionDuration = arrayListInsertionEndTime - arrayListInsertionStartTime;
		
//		System.out.println("The ArrayList Insertion time for "+arrListInt.size()+" elements is "+arrayListInsertionDuration+" NanoSeconds");
//		System.out.println("The ArrayList Insertion time for "+arrListInt.size()+" elements is "+nanoToSecond(arrayListInsertionDuration)+" Seconds");
		arrayListTime.put("ArrayList Insertion Duration ", nanoToSecond2(arrayListInsertionDuration) );

//		System.out.println("Total time taken to create and insert the "+arrListInt.size()+" elements is " + ( arrayListCreationDuration + arrayListInsertionDuration ) + " NanoSeconds.");
//		System.out.println("Total time taken to create and insert the "+arrListInt.size()+" elements is " + nanoToSecond( ( arrayListCreationDuration + arrayListInsertionDuration ) ) + " Seconds.");
		arrayListTime.put("ArrayList Create And Insertion Duration ", nanoToSecond2(arrayListCreationDuration+arrayListInsertionDuration));
		
//		System.out.println(nanoToSecond2(arrayListInsertionDuration));
		
	}
	
	public static void createLinkedList()
	{
		long linkedListCreationStartTime = System.nanoTime();
		
		linListInt = new LinkedList<Integer>();
		
		long linkedListCreationEndTime = System.nanoTime();
		long linkedListCreationDuration = linkedListCreationEndTime - linkedListCreationStartTime;
		
//		System.out.println("The ArrayList Creation Time is : "+linkedListCreationDuration+" NanoSeconds.");
//		System.out.println("The ArrayList Creation Time is : "+nanoToSecond(linkedListCreationDuration)+" Seconds.");
		linkedListTime.put("LinkedList Creation Duration ", nanoToSecond2(linkedListCreationDuration) );
		
		long linkedListInsertionStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 1000000 ; i++ )
		{
			linListInt.add(i);
		}
		
		long linkedListInsertionEndTime = System.nanoTime();
		long linkedListInsertionDuration = linkedListInsertionEndTime - linkedListInsertionStartTime;
		
//		System.out.println("The ArrayList Insertion time for "+linListInt.size()+" elements is "+linkedListInsertionDuration+" NanoSeconds");
//		System.out.println("The ArrayList Insertion time for "+linListInt.size()+" elements is "+nanoToSecond(linkedListInsertionDuration)+" Seconds");
		linkedListTime.put("LinkedList Insertion Duration ", nanoToSecond2(linkedListInsertionDuration) );
		
//		System.out.println("Total time taken to create and insert the "+linListInt.size()+" elements is " + ( linkedListCreationDuration + linkedListInsertionDuration ) + " NanoSeconds.");
//		System.out.println("Total time taken to create and insert the "+linListInt.size()+" elements is " + nanoToSecond( ( linkedListCreationDuration + linkedListInsertionDuration ) ) + " Seconds.");
		linkedListTime.put("LinkedList Create and Insertion Duration ", nanoToSecond2(linkedListCreationDuration+linkedListInsertionDuration));

	}
	
	public static void addElementIntoArrayList()
	{
//		add at the beginning
		long arrayListAddAtBeginningStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.add(0,11);
		}
		
		long arrayListAddAtBeginningEndTime = System.nanoTime();
		long arrayListAddAtBeginningDuration = arrayListAddAtBeginningEndTime - arrayListAddAtBeginningStartTime;
		
		arrayListTime.put("ArrayList Add Element At Beginning Duration ", nanoToSecond2(arrayListAddAtBeginningDuration));
		
//		add at the middle
		long arrayListAddAtMiddleStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.add(arrListInt.size()/2,12);
		}
		
		long arrayListAddAtMiddleEndTime = System.nanoTime();
		long arrayListAddAtMiddleDuration = arrayListAddAtMiddleEndTime - arrayListAddAtMiddleStartTime;
		
		arrayListTime.put("ArrayList Add Element At Middle Duration ", nanoToSecond2(arrayListAddAtMiddleDuration));
		
//		add at the end
		long arrayListAddAtEndStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.add(13);
		}
		
		long arrayListAddAtEndEndTime = System.nanoTime();
		long arrayListAddAtEndDuration = arrayListAddAtEndEndTime - arrayListAddAtEndStartTime;
		
		arrayListTime.put("ArrayList Add Element At End Duration ", nanoToSecond2(arrayListAddAtEndDuration));
	}
	
	public static void addElementIntoLinkedList()
	{
//		add at the beginning
		long linkedListAddAtBeginningStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.addFirst(11);
		}
		
		long linkedListAddAtBeginningEndTime = System.nanoTime();
		long linkedListAddAtBeginningDuration = linkedListAddAtBeginningEndTime - linkedListAddAtBeginningStartTime;
		
		linkedListTime.put("LinkedList Add Element At Beginning Duration ", nanoToSecond2(linkedListAddAtBeginningDuration));
		
//		add at the middle
		long linkedListAddAtMiddleStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.add(linListInt.size()/2,12);
		}
		
		long linkedListAddAtMiddleEndTime = System.nanoTime();
		long linkedListAddAtMiddleDuration = linkedListAddAtMiddleEndTime - linkedListAddAtMiddleStartTime;
		
		linkedListTime.put("LinkedList Add Element At Middle Duration ", nanoToSecond2(linkedListAddAtMiddleDuration));
		
//		add at the end
		long linkedListAddAtEndStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.addLast(13);
		}
		
		long linkedListAddAtEndEndTime = System.nanoTime();
		long linkedListAddAtEndDuration = linkedListAddAtEndEndTime - linkedListAddAtEndStartTime;
		
		linkedListTime.put("LinkedList Add Element At End Duration ", nanoToSecond2(linkedListAddAtEndDuration));
	}
	
	public static void removeArrayList()
	{
//		remove at Beginning
		long arrayListRemoveAtBeginningStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.remove(0);
		}
		
		long araryListRemoveAtBeginningEndTime = System.nanoTime();
		long arrayListRemoveAtBeginningDuration = araryListRemoveAtBeginningEndTime - arrayListRemoveAtBeginningStartTime;
		
		arrayListTime.put("ArrayList Remove At Beginning Duration ", nanoToSecond2(arrayListRemoveAtBeginningDuration));
		
//		remove at Middle
		long arrayListRemoveAtMiddleStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.remove(arrListInt.size()/2);
		}
		
		long araryListRemoveAtMiddleEndTime = System.nanoTime();
		long arrayListRemoveAtMiddleDuration = araryListRemoveAtMiddleEndTime - arrayListRemoveAtMiddleStartTime;
		
		arrayListTime.put("ArrayList Remove At Middle Duration ", nanoToSecond2(arrayListRemoveAtMiddleDuration));
		
//		remove at End
		long arrayListRemoveAtEndStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.remove(arrListInt.size()-1);
		}
		
		long araryListRemoveAtEndEndTime = System.nanoTime();
		long arrayListRemoveAtEndDuration = araryListRemoveAtEndEndTime - arrayListRemoveAtEndStartTime;
		
		arrayListTime.put("ArrayList Remove At End Duration ", nanoToSecond2(arrayListRemoveAtEndDuration));
	}
	
	public static void removeLinkedList()
	{
//		remove at beginning
		long linkedListRemoveAtBeginningStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.removeFirst();
		}
		
		long linkedListRemoveAtBeginningEndTime = System.nanoTime();
		long linkedListRemoveAtBeginningDuration = linkedListRemoveAtBeginningEndTime - linkedListRemoveAtBeginningStartTime;
		
		linkedListTime.put("LinkedList Remove At Beginning Duration ", nanoToSecond2(linkedListRemoveAtBeginningDuration));
		
//		remove at middle
		long linkedListRemoveAtMiddleStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.remove(linListInt.size()/2);
		}
		
		long linkedListRemoveAtMiddleEndTime = System.nanoTime();
		long linkedListRemoveAtMiddleDuration = linkedListRemoveAtMiddleEndTime - linkedListRemoveAtMiddleStartTime;
		
		linkedListTime.put("LinkedList Remove At Middle Duration ", nanoToSecond2(linkedListRemoveAtMiddleDuration));
		
//		remove at end
		long linkedListRemoveAtEndStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.removeLast();
		}
		
		long linkedListRemoveAtEndEndTime = System.nanoTime();
		long linkedListRemoveAtEndDuration = linkedListRemoveAtEndEndTime - linkedListRemoveAtEndStartTime;
		
		linkedListTime.put("LinkedList Remove At End Duration ", nanoToSecond2(linkedListRemoveAtEndDuration));
	}
	
	public static void accessArrayList()
	{
		long arrayListAccessStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			arrListInt.get(i);
		}
		
		long arrayListAccessEndTime = System.nanoTime();
		long arrayListAccessDuration = arrayListAccessEndTime - arrayListAccessStartTime;
		
		arrayListTime.put("Array List Access 10000 Elements Duration ", nanoToSecond2(arrayListAccessDuration));
	}
	
	public static void accessLinkedList()
	{
		long linkedListAccessStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			linListInt.get(i);
		}
		
		long linkedListAccessEndTime = System.nanoTime();
		long linkedListAccessDuration = linkedListAccessEndTime - linkedListAccessStartTime;
		
		linkedListTime.put("Linked List Access 10000 Elements Duration ", nanoToSecond2(linkedListAccessDuration));
	}
	
	public static void printArrayList ()
	{
		long arrayListPrintStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < arrListInt.size() ; i++ )
		{
			System.out.println(arrListInt.get(i));
		}
		
		long arrayListPrintEndTime = System.nanoTime();
		long arrayListPrintDuration = arrayListPrintEndTime - arrayListPrintStartTime;
		
		arrayListTime.put("ArrayList Print Duration ", nanoToSecond2(arrayListPrintDuration));
	}
	
	public static void printLinkedList ()
	{
		long linkedListPrintStartTime = System.nanoTime();
		
		for ( int i = 0 ; i < linListInt.size() ; i++ )
		{
			System.out.println(linListInt.get(i));
		}
		
		long linkedListPrintEndTime = System.nanoTime();
		long linkedListPrintDuration = linkedListPrintEndTime - linkedListPrintStartTime;
		
		linkedListTime.put("LinkedList Print Duration ", nanoToSecond2(linkedListPrintDuration));
	}
	
	public static void printTime()
	{
		Iterator<Map.Entry<String, Double>> arrayListTimeIterator = arrayListTime.entrySet().iterator();
		Iterator<Map.Entry<String, Double>> linkedListTimeIterator = linkedListTime.entrySet().iterator();
		while ( arrayListTimeIterator.hasNext() && linkedListTimeIterator.hasNext()  )
		{
			Map.Entry<String, Double> arrEntry = arrayListTimeIterator.next();
			Map.Entry<String, Double> linEntry = linkedListTimeIterator.next();
			
		    System.out.println(arrEntry.getKey()+"\t\t"+arrEntry.getValue()+" Seconds");
		    System.out.println(linEntry.getKey()+"\t\t"+linEntry.getValue()+" Seconds");
		    
		}
	}
	
	public static double nanoToSecond2 ( long num )
	{
		return (double)num / 1000000000.0;
	}
	
	public static String nanoToSecond( long num )
	{
		String secondFormat = String.format("%.7f", num/1000000000.0);
//		/1000000000
//		return num/1000000000;
		return secondFormat;
	}
	
}
