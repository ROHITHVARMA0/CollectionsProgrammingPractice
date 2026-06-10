package collectionsPhase2ArrayListPracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Program11FirstNonRepeatingElementUpdatedVersion 
{
	
static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Object> arrList;
	
	static HashMap< Object , Integer > hashMap;
	
	public static void main( String[] args )
	{
		createArrayList();
		
		firstNonRepeatingElement();
	}
	
	public static void createArrayList()
	{
		arrList = new ArrayList<Object>();
			
		System.out.println("Enter the type of arraylist you want to create ( 1 - Integer / 2 - String ) : ");
		int arrayCreationType = sc.nextInt();
		
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
					if ( arrayCreationType == 2 )
				{
					arrList.add(sc.nextLine());
				}
			}
		}
	}
	
	public static void firstNonRepeatingElement()
	{
		hashMap = new HashMap<Object,Integer>();
		for ( Object obj : arrList )
		{
			hashMap.put(obj, hashMap.getOrDefault(obj, 0)+ 1 );
		}
		for ( Object obj : arrList )
		{
			if ( hashMap.get(obj) == 1 )
			{
				System.out.println("The first non-repeating element in the arraylist is : "+obj);
				return;
			}
		}
		System.out.println("The arraylist has no non-repeating elements.");
	}
	
	
}
