package collectionsPhase0;

import java.util.Scanner;

public class Program2FixedSizeMethodProblem 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the length of an array : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for ( int i = 0 ; i < length ; i++ )
		{
			
			arr[i] = sc.nextInt();
			
		}
		
		//Now I want to add another number into the array and it is impossible to add another new value into the array
		//So now I need to create a new array with additional length required by the user and then add the additional value into the array
		//Which leads to taking more time to add even a single value and more space is wasted 
		
		System.out.println("Enter the value that you need to add extra values to the array : ");
		int extraDataLength = sc.nextInt();
		
		int[] newArr = new int[length+extraDataLength];
		
		for ( int i = 0 ; i < newArr.length ; i++ )
		{
			if( i < length )
			{
				newArr[i] = arr[i];
			}
			else
			{
				newArr[i] = sc.nextInt();
			}
		}
		
		for ( int num : newArr )
		{
			System.out.print(num+" ");
		}
		
		sc.close();
		
		//And adding or removing an an element from an array will be like the same scenario waiting both time and space 
		//So we need to look for an alternative so that we can easily manipulate the collection of data
		//So using collections in java is a better solution to overcome the above mentioned hurdles
		
	}
	
}
