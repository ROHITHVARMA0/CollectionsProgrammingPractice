package collectionsPhase5SetInterface;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
//import java.util.InputMismatchException;

public class Program31UnionIntersectionOfTwoHashSets 
{
	//Element range
	static final int startRange = 1;
	static final int endRange = 100;
	
	//HashSet Size Range
	static final int sizeRangeStart = 11;
	static final int sizeRangeEnd = 15;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create 2 HashSets and perform UNION and INTERSECTION ( YES / NO ) : ");
		if ( yesNoOption( sc.next() ) )
		{
			createHashSet();
		}
		
		sc.close();
	}
	
	public static void createHashSet()
	{
		int length1 = randomNumberSizeHashSet();
		int length2 = randomNumberSizeHashSet();
		
		Set<Integer> hashSet1 = new HashSet<>();
		Set<Integer> hashSet2 = new HashSet<>();
		
		for ( int i = 0 ; i < length1 ; i++ )
		{
			hashSet1.add(randomNumberInput());
		}
		
		for( int i = 0 ; i < length2 ; i++ )
		{
			hashSet2.add(randomNumberInput());
		}
		
		//1st HashSet
		System.out.println("The size of 1st HashSet : "+hashSet1.size());
		System.out.println("The 1st HashSet is : "+hashSet1);
		
		//2nd HashSet
		System.out.println("The size of 2nd HashSet : "+hashSet2.size());
		System.out.println("The 2nd HashSet is : "+hashSet2);
		
		unionOfHashSets(hashSet1, hashSet2);
		intersectionOfHashSets(hashSet1, hashSet2);
	}
	
	public static void unionOfHashSets(Set<Integer> hashSet1 , Set<Integer> hashSet2)
	{
		Set<Integer> unionHashSet = new HashSet<>(hashSet1);
		unionHashSet.addAll(hashSet2);
		System.out.println("Union of both HashSets is : "+unionHashSet);
	}
	
	public static void intersectionOfHashSets(Set<Integer> hashSet1 , Set<Integer> hashSet2)
	{
		Set<Integer> intersectionHashSet = new HashSet<>();
		for ( int ele : hashSet1 )
		{
			if ( hashSet2.contains(ele) )
			{
				intersectionHashSet.add(ele);
			}
		}
		
		System.out.println("The Intersection of both HashSets is : "+intersectionHashSet);
	}
	
	
	public static int randomNumberInput()
	{
		return ThreadLocalRandom.current().nextInt(startRange, endRange);
	}
	
	public static int randomNumberSizeHashSet()
	{
		return ThreadLocalRandom.current().nextInt(sizeRangeStart, sizeRangeEnd);
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
