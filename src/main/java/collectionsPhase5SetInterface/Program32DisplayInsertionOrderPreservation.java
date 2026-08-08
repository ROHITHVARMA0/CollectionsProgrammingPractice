package collectionsPhase5SetInterface;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.concurrent.ThreadLocalRandom;

public class Program32DisplayInsertionOrderPreservation 
{
	
	public static void main(String[] orgs)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to showcase that LinkedHashSet will store elements in Insertion Order ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			createLinkedHashSet(sc);
		}
		
		sc.close();
	}
	
	public static void createLinkedHashSet( Scanner sc )
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
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		Set<Integer> hashSet = new HashSet<>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
//			System.out.print("Enter the "+(i+1)+"th element to insert into the LinkedHashSet : ");
//			try
//			{
//				int ele = sc.nextInt();
				int ele = randomNumber();
				linkedHashSet.add(ele);
				hashSet.add(ele);
				System.out.println("You have entered the element "+ele+" into the LinkedHashSet and HashSet.");
				System.out.println("After insertion of the "+ele+" into the\nHashSet : "+hashSet+"\nLinkedHashSet : "+linkedHashSet);
//			}
//			catch ( InputMismatchException e )
//			{
//				System.out.println("You have entered an invalid input.");
//				System.out.println("So, stopping the execution of the program.");
//				return;
//			}
			
		}
	}
	
	public static int randomNumber()
	{
		return ThreadLocalRandom.current().nextInt(1, 9999);
	}
	
	public static boolean yesNoOption( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
}
