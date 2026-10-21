package collectionsPhase7MapInterface;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Program42FrequencyOfCharactersInString 
{
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to Create a HashMap in order to count the Frequency of Characters in the string : ");
		if ( yesNoOption(sc.next()) )
		{
			frequencyOfCharctersUsingHashMap();
		}
		sc.close();
	}
	
	public static void frequencyOfCharctersUsingHashMap() throws StreamReadException, DatabindException, IOException
	{
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		ArrayList<String> arrListStrings = stringsExtractionFromJsonFile();
		
		String str = arrListStrings.get(randomNumberGenerator(0, arrListStrings.size()));
		
		System.out.println("The string taken is : "+str);
		
		for ( int i = 0 ; i< str.length() ; i++ )
		{
			char ch = str.charAt(i);
			if ( hashMap.containsKey(ch) )
			{
				int count = hashMap.get(ch);
				hashMap.put(ch, count+1 );
			}
			else
			{
				hashMap.put(ch, 1);
			}
		}
		
		for ( HashMap.Entry< Character , Integer > entry : hashMap.entrySet() )
		{
			System.out.println("Character : "+entry.getKey()+" , Count : "+entry.getValue());
		}
	}
	
	public static ArrayList<String> stringsExtractionFromJsonFile() throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		ArrayList<String> arrList = mapper.readValue(
											new File("C:\\Users\\2440837\\eclipse-workspace\\BasicProgramming\\src\\main\\java\\FrequencyOfCharactersInString.json"), 
											new TypeReference<ArrayList<String>>() {
											});
		
		return arrList;
	}
	
	public static ArrayList<String> stringsExtractionFromJsonFileNew() throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();

		ArrayList<String> strings = mapper.readValue(
	                new File("unique_1000_strings.json"),
	                mapper.getTypeFactory()
	                      .constructCollectionType(ArrayList.class, String.class) );
		
		return strings;
	}
	
	public static boolean yesNoOption ( String str )
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static int randomNumberGenerator( int origin , int bound )
	{
		return ThreadLocalRandom.current().nextInt(origin, bound);
	}
	
}
