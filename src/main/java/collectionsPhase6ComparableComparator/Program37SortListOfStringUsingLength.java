package collectionsPhase6ComparableComparator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;
import java.util.Comparator;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Program37SortListOfStringUsingLength 
{
	
	static final int randomWordsListOrigin = 0;
	static final int randomWordsListBound = 8;
	
	static final int randomWordsSizeOrigin = 0;
	static final int randomWordsSizeBound = 998;
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to Create a ArrayList of Strings and Sort them using the Length ( YES / NO ) : ");
		if ( yesNoOption ( sc.next() ) )
		{
			System.out.print("Do you want to create the List of Strings Manually ( 1 ) or Randomlly ( 2 ) : ");
			Integer option = numberInput(sc);
			if ( option == null )
			{
				invalidInputMessage();
				return;
			}
			else if ( option == 1 )
			{
				createListofStringsManually(sc);
			}
			else if ( option == 2 )
			{
				createListOfStringsRandomly(sc);
			}
			else 
			{
				invalidInputMessage();
				return;
			}
		}
		
		sc.close();
	}
	
	public static void createListofStringsManually(Scanner sc)
	{
		System.out.print("Enter the number of Strings you want to insert into the ArrayList : ");
		Integer length = numberInput(sc);
		if ( length == null )
		{
			invalidInputMessage();
			return;
		}
		else if ( length < 1 )
		{
			invalidInputMessage();
			return;
		}
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print("Enter the "+(i+1)+"th String that you want to insert into the ArrayList : ");
			String str = sc.next();
			arrList.add(str);
		}
		System.out.println("The List of Strings after creation of ArrayList is : \n"+arrList);
		
		sortArrayListOfStringsUsingLength(arrList);
	}
	
	public static void createListOfStringsRandomly(Scanner sc) throws StreamReadException, DatabindException, IOException
	{
		System.out.print("Enter the number of elements you wat to insert into the ArrayList Randomly : ");
		Integer length = numberInput(sc);
		if ( length == null )
		{
			invalidInputMessage();
			return;
		}
		else if ( length < 1 )
		{
			invalidInputMessage();
			return;
		}
		
		ArrayList<ArrayList<String>> arrOfArrList = new ArrayList<ArrayList<String>>(arrOfArrayListWords());		
		ArrayList<String> arrList = new ArrayList<String>();
		
		for ( int i = 0 ; i < length ; i++ )
		{
//			System.out.println(arrOfArrList.size());
//			int innerSize = ThreadLocalRandom.current().nextInt(arrOfArrList.size());
//			System.out.println(arrOfArrList.get(innerSize).size());
//			int outerSize = ThreadLocalRandom.current().nextInt(arrOfArrList.get(innerSize).size());
//			
//			arrList.add(arrOfArrList.get(innerSize).get(outerSize));
			
			arrList.add(arrOfArrList
					.get( randomNumber(randomWordsListOrigin, randomWordsListBound) )
					.get( randomNumber(randomWordsSizeOrigin, randomWordsSizeBound) ) );
		}
		System.out.println("The List of Strings after creation of ArrayList is : \n"+arrList);
		
		sortArrayListOfStringsUsingLength(arrList);
	}
	
	public static void sortArrayListOfStringsUsingLength( ArrayList<String> arrList )
	{
		Collections.sort( arrList , new Comparator<String>()
				{
					@Override
					public int compare( String a , String b )
					{
						if ( a.length() > b.length() )
							return 1;
						else if ( a.length() < b.length() )
							return -1;
						else
							return 0;
					}
				}
				);
		System.out.println("The ArrayList of Strings after sorting them according to the Length of Strings : \n"+arrList);
	}
	
	public static ArrayList<ArrayList<String>> arrOfArrayListWords() throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String, ArrayList<String>> map =
		        mapper.readValue(
		                new File("C:\\Users\\2440837\\eclipse-workspace\\BasicProgramming\\src\\main\\java\\SortStringsUsingLengthData.json"),
		                new TypeReference<Map<String, ArrayList<String>>>() {});
		
		return new ArrayList<ArrayList<String>>(map.values());
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static int randomNumber ( int origin , int bound )
	{
		return ThreadLocalRandom.current().nextInt(origin, bound+1);
	}
	
	public static Integer numberInput(Scanner sc)
	{
		int num = 0;
		try 
		{
			num = sc.nextInt();
		}
		catch ( InputMismatchException e )
		{
			return null;
		}
		return num;
	}
	
	public static void invalidInputMessage()
	{
		System.out.println("You have enterd an invalid input.");
		System.out.println("So, stopping the execution of the program");
	}

	
}
