package collectionsPhase6ComparableComparator;

import java.util.Collections;
import java.util.ArrayList;

public class Program0001Comparable implements Comparable<Program0001Comparable>
{
	
	int id;
	String name;
	int age;
	String mail;
	
	
	
	public Program0001Comparable(int id, String name, int age ) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.mail = String.valueOf(id) + "@company.com";
	}

	@Override
	public int compareTo( Program0001Comparable obj )
	{
		if ( this.id < obj.id )
			return 1;
		else if ( this.id > obj.id )
			return -1;
		else
			return 0;
		
//		return this.id < obj.id ? 1 : -1;
		
//		return Integer.compare( this.id , obj.id );
	}
	
	public static void main ( String[] args )
	{
		ArrayList<Program0001Comparable> progCom = new ArrayList<>();
		progCom.add(new Program0001Comparable(101, "ram", 21) );
		progCom.add(new Program0001Comparable(102, "raj", 22) );
		progCom.add(new Program0001Comparable(22, "ramesh", 63) );
		progCom.add(new Program0001Comparable(73, "rishi", 32) );
		progCom.add(new Program0001Comparable(26328, "ricky", 45) );
		
		Collections.sort(progCom);
		
		for (Program0001Comparable p : progCom)
			System.out.println(p);
		
		
	}

	@Override
	public String toString() {
		return "Program0001Comparable [id=" + id + ", name=" + name + ", age=" + age + ", mail=" + mail + "]";
	}
		
	
}
