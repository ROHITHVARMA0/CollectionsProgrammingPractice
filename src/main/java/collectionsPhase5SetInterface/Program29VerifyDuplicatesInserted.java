package collectionsPhase5SetInterface;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Program29VerifyDuplicatesInserted 
{
	public static void main(String[] main)
	{
		Scanner sc = new Scanner ( System.in );
		System.out.print("Do you want to create a HashSet to know whether Duplicate Values are inerted ot not ( YES / NO ) : ");
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
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
}
