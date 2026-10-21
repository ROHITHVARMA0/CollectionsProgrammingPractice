package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Program43FrequencyOfWordsInStatement 
{
	
	public static void main ( String[] args ) throws StreamReadException, BindException, IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create a HashMap in order to count the Frequency of Words in the Statement : ");
		if ( yesNoOption ( sc.next() ) )
		{
			frequencyOfWordsInStatement();
		}
		
		sc.close();
	}
	
	public static void frequencyOfWordsInStatement() throws StreamReadException, BindException, IOException
	{
		HashMap<String , Integer> hashMap = new HashMap<String, Integer>();
		
		String statement = statementExtractionFromJsonFile();
		
		System.out.println("The selected statement is : "+statement);
		
		String[] string = statement.split(" ");
		
		for ( String str : string )
		{
			if ( hashMap.containsKey(str) )
			{
				int count = hashMap.get(str);
				hashMap.put(str, count+1);
			}
			else
			{
				hashMap.put(str, 1);
			}
		}
		
//		To count the frequency of words irrespective of Case- Sensitivity
//		for ( String str : string )
//		{
//			String lwr_str = str.toLowerCase();
//			if ( hashMap.containsKey(lwr_str) )
//			{
//				int count = hashMap.get(lwr_str);
//				hashMap.put(lwr_str, count+1);
//			}
//			else
//			{
//				hashMap.put(lwr_str, 1);
//			}
//		}
		
		for ( HashMap.Entry<String, Integer> entry : hashMap.entrySet() )
		{
			System.out.println("Word : "+entry.getKey()+" , Count : "+entry.getValue());
		}
	}
	
	public static String statementExtractionFromJsonFile() throws StreamReadException , BindException, IOException
	{
		ObjectMapper objMapper = new ObjectMapper();
		
		ArrayList<String> arrListStrings = objMapper.readValue(
														new File ("C:\\Users\\2440837\\eclipse-workspace\\BasicProgramming\\src\\main\\java\\FrequencyOfWordsInStatement.json"),
														new TypeReference<ArrayList<String>>() {}); 
		
		return arrListStrings.get(randomNumberGenration(0, arrListStrings.size()));
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static int randomNumberGenration( int origin , int bound )
	{
		return ThreadLocalRandom.current().nextInt(origin, bound);
	}
	
}
