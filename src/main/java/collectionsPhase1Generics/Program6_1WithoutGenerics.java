package collectionsPhase1Generics;

import java.util.ArrayList;

public class Program6_1WithoutGenerics 
{
	
	
	//@SuppressWarnings("unchecked")
	public static void main ( String[] args )
	{
		
		//@SuppressWarnings("rawtypes")
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add("Hello World!");
		arr.add(3.14);
		
		
		String text = (String) arr.get(1);
		System.out.println("First element : "+text);
		
		try
		{
			String oops = (String) arr.get(0);
		}
		catch ( ClassCastException e )
		{
			System.out.println("Error : " + e.getMessage());
		}
		
		System.out.println(arr.get(1));
		
	}
	
	
	
}
