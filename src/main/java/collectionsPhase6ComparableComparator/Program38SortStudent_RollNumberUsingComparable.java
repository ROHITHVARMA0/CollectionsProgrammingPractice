package collectionsPhase6ComparableComparator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Program38SortStudent_RollNumberUsingComparable implements Comparable<Program38SortStudent_RollNumberUsingComparable>
{
	
	Integer rollNumber;
	String name;
	Integer marks;
	
	public Program38SortStudent_RollNumberUsingComparable(Integer rollNumber, String name, Integer marks) 
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	
	static ArrayList< Program38SortStudent_RollNumberUsingComparable > student;
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to create the Student data and Sort the data with the Student's Roll Number : ");
		if ( yesNoOption( sc.next() ) )
		{
			System.out.print("Enter the number of Student data you want to create : ");
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
			
			student = new ArrayList<Program38SortStudent_RollNumberUsingComparable>();
			
			for ( int i = 0 ; i < length ; i++ )
			{
				Program38SortStudent_RollNumberUsingComparable obj = createStudentData(i, sc);
				if ( obj == null )
				{
					i--;
					continue;
				}
				student.add( obj );
				
			}
			System.out.println("Student Details Before Sorting the Students Using Comaparable with RollNumber - ");
			for ( int i = 0 ; i < student.size() ; i++ )
			{
				System.out.println("The "+(i+1)+"th student details : RollNumber = "+student.get(i).rollNumber+" , Name = "+student.get(i).name+" , Marks = "+student.get(i).marks);
			}
			
			Collections.sort(student);
			
			System.out.println("Student Details After Sorting the Students Using Comaparable with RollNumber - ");
			for ( int i = 0 ; i < student.size() ; i++ )
			{
				System.out.println("The "+(i+1)+"th student details : RollNumber = "+student.get(i).rollNumber+" , Name = "+student.get(i).name+" , Marks = "+student.get(i).marks);
			}
		}
		
		
		sc.close();
	}
	
	public static Program38SortStudent_RollNumberUsingComparable createStudentData( int i , Scanner sc)
	{
		System.out.print("Enter the "+(i+1)+"th Student RollNumber : ");
		Integer rollNumber = numberInput(sc);
		if ( !positiveNumberValidityChecking(rollNumber) )
		{
			return null;
		}
		System.out.print("Enter the "+(i+1)+"th Student Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter the "+(i+1)+"th Student Marks : ");
		Integer marks = numberInput(sc);
		if ( !positiveNumberValidityChecking(marks) )
		{
			return null;
		}
		
		return new Program38SortStudent_RollNumberUsingComparable(rollNumber, name, marks);
	}
	
	public static boolean yesNoOption(String str)
	{
		return str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("Y");
	}
	
	public static void invalidInputMessage()
	{
		System.out.println("You have entered an invalid input.");
		System.out.println("So, stopping the execution of the program.");
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
			sc.next();
			invalidInputMessage();
			return null;
		}
		return num;
	}
	
	public static boolean positiveNumberValidityChecking( Integer num )
	{
		if ( num == null )
		{
			invalidInputMessage();
			return false;
		}
		else if ( num < 1 )
		{
			invalidInputMessage();
			return false;
		}
		return true;	
	}
	
	@Override
	public int compareTo(Program38SortStudent_RollNumberUsingComparable o) 
	{
		return this.rollNumber.compareTo(o.rollNumber);
		//return o.rollNumber > this.rollNumber ? 1 : -1;
	}

	@Override
	public String toString() 
	{
		return "RollNumber : "+rollNumber+" , Name : "+name+" , Marks : "+marks+" .";
	}
	

}
