package collectionsPhase1Generics;

import java.util.ArrayList;

public class Program6_2GenericsArrayLIst 
{
	
	public static void main ( String[] args )
	{
		
		ArrayList<String> arrayListString = new ArrayList<String>();
		
		arrayListString.add("aaAA");
		arrayListString.add("bbBB");
		arrayListString.add("ccCC");
		
		for(String n : arrayListString )
		{
			System.out.println(n);
		}
		
	}
	
}
