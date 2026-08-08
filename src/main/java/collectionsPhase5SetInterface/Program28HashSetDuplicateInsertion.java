package collectionsPhase5SetInterface;

import java.util.Set;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program28HashSetDuplicateInsertion 
{
	
	public static void main(String[] main)
	{
		Scanner sc = new Scanner ( System.in );
		System.out.print("Do you want to create a HashSet to know whether it allows to store Duplicate Values ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createHashSet(sc);
		}
		sc.close();
	}
	
	public static void createHashSet(Scanner sc)
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
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}

}
