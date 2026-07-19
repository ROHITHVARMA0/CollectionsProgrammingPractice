package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.List;

public class Program13SortArrayListUsingBuiltInMethods 
{
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Object> arrList;

	public static void main(String[] args) {
		createArrayList();

		sortingMethods();
	}

	public static void createArrayList() 
	{
		arrList = new ArrayList<Object>();

		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayCreationType = sc.nextInt();

		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();

		if (arrayCreationType == 2) 
		{
			sc.nextLine();
		}

		if (length <= 0) 
		{
			System.out.println("Invalid size!");
			return;
		}

		if (length > 0) 
		{
			for (int i = 0; i < length; i++) 
			{
				System.out.print("Enter the " + (i + 1) + "th element to insert into the arraylist : ");
				if (arrayCreationType == 1) 
				{
					arrList.add(sc.nextInt());
				}
				if (arrayCreationType == 2) 
				{
					arrList.add(sc.nextLine());
				}
			}
		}
	}

	public static void sortingMethods() 
	{
		if (arrList == null || arrList.isEmpty()) 
		{
			System.out.println("ArrayList is empty. Nothing to sort.");
			return;
		}

		System.out.println("\nOriginal ArrayList: " + arrList);

		// Define a custom comparator that safely casts Objects to Comparable
		Comparator<Object> safeComparator = (obj1, obj2) -> {
			if (obj1 instanceof Comparable && obj2 instanceof Comparable) 
			{
				// This safely handles both Integer and String comparisons
				return ((Comparable<Object>) obj1).compareTo(obj2);
			}
			return 0; // Fallback if types aren't comparable
		};

		// Method 1: Using built-in ArrayList sort with our safe comparator
		arrList.sort(safeComparator);
		System.out.println("Sorted using arrList.sort() : " + arrList);

		// Method 2: Using Collections.sort() with our safe comparator
		Collections.sort(arrList, safeComparator);
		System.out.println("Sorted using Collections.sort() : " + arrList);
	}

}
