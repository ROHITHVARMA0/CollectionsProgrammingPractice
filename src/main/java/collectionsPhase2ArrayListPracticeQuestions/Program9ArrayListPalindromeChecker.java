package collectionsPhase2ArrayListPracticeQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class Program9ArrayListPalindromeChecker 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Object> arrList;
//	static boolean flag = true;
	
	public static void main ( String[] args )
	{
		createArrayList();
		
		if ( checkPalindromeOrNot() )
		{
			System.out.println("The arraylist is Palindrome.");
		}
		else
		{
			System.out.println("The arraylist is Not Palindrome.");
		}
	}
	
	public static void createArrayList()
	{
		arrList = new ArrayList<Object>();
		
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayCreationType = sc.nextInt();
		
		if ( arrayCreationType != 1 && arrayCreationType != 2 )
		{
			System.out.println("The input you entered is invalid.");
			return;
		}
		
		System.out.println("Enter the number of elements you want to insert into the arraylist : ");
		int length = sc.nextInt();
		
		if ( arrayCreationType == 2 )
		{
			sc.nextLine();
		}
		
		if (length <= 0) {
		    System.out.println("Invalid size!");
		    return;
		}
		
		if ( length > 0  )
		{
			for ( int i = 0 ; i < length ; i++ )
			{
				System.out.print("Enter the " + ( i+1 ) + "th element to insert into the arraylist : " );
				if ( arrayCreationType == 1 )
				{
					arrList.add( sc.nextInt() );
				}
				else if ( arrayCreationType == 2 )
				{
					arrList.add(sc.nextLine());
				}
				else
				{
					System.out.println("You have entered an invalid input.");
					return;
				}
			}
		}
	}
	
	public static boolean checkPalindromeOrNot()
	{
		int i = 0 ;
		int j = arrList.size() - 1 ;
		while ( i < j )
		{
			if ( ! arrList.get(i).equals(arrList.get(j)) )
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
