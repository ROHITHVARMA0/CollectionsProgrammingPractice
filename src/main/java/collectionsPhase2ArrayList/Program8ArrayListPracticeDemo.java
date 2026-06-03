package collectionsPhase2ArrayList;

import java.util.ArrayList;

public class Program8ArrayListPracticeDemo 
{
	
	public static void main (String[] args)
	{
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(arrList.get(0)+1);
		arrList.addFirst(56);
		arrList.addLast(100);
		arrList.add(2, 50);
		
		System.out.println("ArrayList successfully created and added 5 Integer elements into it.");
		
		
//		for ( int i = 0 ; i < arrList.size() ; i++ )
//		{
//			System.out.print(arrList.get(i)+" ");
//		}
//		
//		System.out.println();
//		
//		for( int num : arrList ) 
//		{
//			System.out.print(num + " ");
//		}
		
			
		
	}
	
	static ArrayList<Integer> arrLisInt = new ArrayList<Integer>();
	
	public static void arrayListIntAdding(int i)
	{
		
		arrLisInt.add(i);
		//System.out.println();
		
	}
	
	static ArrayList<String> arrListStr = new ArrayList<String>();
	
	public static void arrayListStr(String str)
	{
		
		arrListStr.add(str);
		
	}
	
}