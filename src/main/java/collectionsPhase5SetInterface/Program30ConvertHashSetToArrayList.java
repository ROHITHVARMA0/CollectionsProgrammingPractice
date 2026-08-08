package collectionsPhase5SetInterface;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Program30ConvertHashSetToArrayList 
{
	
	public static void main(String[] main)
	{
		Scanner sc = new Scanner ( System.in );
		System.out.print("Do you want to create a HashSet to convert it into ArrayList ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			System.out.print("Do you want to insert elements manually ( 1 ) or insert elements in range ( 2 ) : ");
			int option = 0 ;
			try
			{
				option = sc.nextInt();
			}
			catch ( InputMismatchException e )
			{
				System.out.println("As you have entered an invalid input, stopping the execution of the program.");
				return;
			}
			if ( option < 1 )
			{
				System.out.println("As you have entered an invalid input, stopping the execution of the program.");
				return;
			}
			else if ( option == 1 )
			{
				createHashSetManually(sc);
			}
			else if ( option == 2 )
			{
				createHashSetRange(sc);
			}
			else
			{
				System.out.println("You have entered an inavlid input.");
				System.out.println("So, stopping the execution of the program.");
			}
		}
		sc.close();
	}
	
	public static void createHashSetRange(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the HashSet : ");
		int length = 0 ;
		try
		{
			length = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		if ( length < 1 )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		
		Set<Integer> hashSet = new HashSet<>();
		
		int count = 0;
		while( count < length )
		{
			int temp = count;
			// Intentionally generate duplicate values after halfway point
			if ( temp > length/2 )
			{
				temp = temp/2;
			}
			System.out.print("The value "+(temp)+" is inserted into HashSet.");
			System.out.println(hashSet.add(temp));
			System.out.println("The size of HashSet : "+hashSet.size());
			System.out.println("The hashset : "+hashSet);
			count++;
		}
		
		if ( hashSet.size() > 0 )
		{
			hashSetToArrayList(hashSet);
		}
	}
	
	public static void createHashSetManually(Scanner sc)
	{
		System.out.print("Enter the number of elements you want to insert into the HashSet : ");
		int length = 0 ;
		try
		{
			length = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		if ( length < 1 )
		{
			System.out.println("As you have entered an invalid input, stopping the execution of the program.");
			return;
		}
		
		Set<Integer> hashSet = new HashSet<Integer>();
		
		int count = 0;
		while( count < length )
		{
			System.out.print("Enter the "+(count+1)+"th element to insert into HashSet : ");
			if (!hashSet.add(sc.nextInt()))
			{
				System.out.println("You have entered a value which is already present in the HashSet.");
				System.out.println("So, HashSet will not allows duplicates.");
				System.out.println("So, stopping the execution of the program.");
				break;
			}
			else if ( count == length-1 )
			{
				System.out.println("The values you have added are not duplicate values.");
			}
			count++;
		}
		if ( hashSet.size() > 0 )
		{
			hashSetToArrayList(hashSet);
		}
	}
	
	public static void hashSetToArrayList(Set<Integer> hashSet)
	{
		System.out.println("The HashSet : "+hashSet);
		List<Integer> arrList = new ArrayList<>(hashSet);
		System.out.println("The ArrayList : "+arrList);
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
