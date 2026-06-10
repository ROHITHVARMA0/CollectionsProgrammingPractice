package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;

public class Program14LongestIncreasingSubsequence {
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> arrListInt;
	static ArrayList<String> arrListStr;
	
	public static void main ( String[] args )
	{
		System.out.println("Do you want to create an ArrayList ( YES / NO ) : ");
		if ( yesNoOption(sc.next()) )
		{
			createArrayList();
			findLongestSubsequence();
		}		
	}
	
	public static void createArrayList ()
	{
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int typeOfArrayListCreation = sc.nextInt();
		
		if ( typeOfArrayListCreation != 1 && typeOfArrayListCreation != 2 )
		{
			System.out.println("You have entered invalid input");
			return;
		}
		
		System.out.println("Enter the number of elements to be inserted into the ArrayList : ");
		int length = sc.nextInt();
		
		if ( typeOfArrayListCreation == 1 )
		{
			createIntArrayList(length);
		}
		else
		{
			createStrArrayList(length);
		}
		
	}
	
	public static void createIntArrayList(int length)
	{
		arrListInt = new ArrayList<Integer>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
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
			System.out.print("Enter the " + (i+1) + "th element to insert into the arraylist : " );
			arrListStr.add(sc.nextLine());
		}
	}
	
	public static void findLongestSubsequence()
	{
		if ( arrListInt != null )
		{
			int length = arrListInt.size();
			ArrayList<Integer> lisCount = new ArrayList<>(Collections.nCopies(length, 1));
			for ( int i = 1 ; i < length ; i++ )
			{
				for ( int j = 0 ; j < i ; j++ )
				{
					if ( arrListInt.get(i) > arrListInt.get(j) )
					{
						if ( lisCount.get(i) < lisCount.get(j)+1 )
						{
							lisCount.set(i, lisCount.get(j)+1 );
						}
					}
				}
			}
			System.out.print("The longest subsequence in the given arraylist is ");
//			lisCount.sort(null);
//			System.out.println( lisCount.getLast() );
			System.out.println(Collections.max(lisCount));
		}
		if ( arrListStr != null )
		{
			int length = arrListStr.size();
			ArrayList<Integer> lisCount = new ArrayList<>(Collections.nCopies(length, 1));
			
			for ( int i = 1 ; i < length ; i++ )
			{
				for ( int j = 0 ; j < i ; j++ )
				{
					if ( arrListStr.get(i).length() > arrListStr.get(j).length() )
					{
						if ( lisCount.get(i) < lisCount.get(j)+1 )
						{
							lisCount.set(i, lisCount.get(j)+1 );
						}
					}
				}
			}
			System.out.print("The longest subsequence in the given arraylist is ");
//			lisCount.sort(null);
//			System.out.println( lisCount.getLast() );
			System.out.println(Collections.max(lisCount));
		}
	}
	
	public static boolean yesNoOption(String str)
	{
		if ( str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y")  )
		{
			return true;
		}
		return false;
	}
	

//	public static int findLISLength(ArrayList<Integer> nums) {
//		// Edge case: If the list is empty, the LIS length is 0
//		if (nums == null || nums.isEmpty()) {
//			return 0;
//		}
//
//		int n = nums.size();
//		// lisCount[i] will store the length of LIS ending at index i
//		ArrayList<Integer> lisCount = new ArrayList<>(Collections.nCopies(n, 1));
//
//		// Bottom-up Dynamic Programming
//		for (int i = 1; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				// If the current element is greater than a previous element
//				if (nums.get(i) > nums.get(j)) {
//					// Update the LIS value if it gives a longer sequence
//					if (lisCount.get(i) < lisCount.get(j) + 1) {
//						lisCount.set(i, lisCount.get(j) + 1);
//					}
//				}
//			}
//		}
//		// The overall maximum value in lisCount is our final answer
//		return Collections.max(lisCount);
//	}
//
//	public static void main(String[] args) {
//		// Example array from our previous discussion: [10, 9, 2, 5, 3, 7, 101, 18]
//		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18));
//
//		int result = findLISLength(numbers);
//
//		System.out.println("Original List: " + numbers);
//		System.out.println("Length of Longest Increasing Subsequence: " + result);
//	}
}
