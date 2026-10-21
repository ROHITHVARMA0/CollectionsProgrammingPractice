package collectionsPhase6ComparableComparator;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

//class AgeComparator implements Comparator<Program0002Comparator>
//{
//    @Override
//    public int compare(Program0002Comparator emp1,
//                       Program0002Comparator emp2)
//    {
//    	if ( emp1.age > emp2.age )
//			return 1;
//		else if ( emp1.age < emp2.age )
//			return -1;
//		else
//			return 0;
//    }
//}

public class Program0002Comparator 
{

	int id;
	String name;
	int age;
	String mail;
	
	
	
	public Program0002Comparator(int id, String name, int age ) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mail = String.valueOf(id)+"@company.com";
	}
	
	public static void main(String[] args)
	{
		ArrayList<Program0002Comparator> compEmp = new ArrayList<Program0002Comparator>();
		compEmp.add(new Program0002Comparator(101, "ram", 21) );
		compEmp.add(new Program0002Comparator(102, "raj", 22) );
		compEmp.add(new Program0002Comparator(22, "ramesh", 63) );
		compEmp.add(new Program0002Comparator(73, "rishi", 32) );
		compEmp.add(new Program0002Comparator(26328, "ricky", 45) );
		System.out.println("The Employees Details before Sorting based on the Age : ");
		for ( Program0002Comparator p : compEmp )
		{
			System.out.println(p);
		}
		
		Collections.sort(compEmp , new Comparator<Program0002Comparator>()
				{
					public int compare( Program0002Comparator emp1 , Program0002Comparator emp2 )
					{
						return Integer.compare(emp1.age, emp2.age);
					}
				}
				);
		
		System.out.println("The Employees Details after Sorting based on the Age : ");
		for ( Program0002Comparator p : compEmp )
		{
			System.out.println(p);
		}
	}
	
//	@Override
//	public int compare(Program0002Comparator emp1, Program0002Comparator emp2) {
//		if ( emp1.age > emp2.age )
//			return 1;
//		else if ( emp1.age < emp2.age )
//			return -1;
//		else
//			return 0;
//	}
	
	@Override
	public String toString()
	{
		return "Program0002Comparator [ id = "+id+" ], [ name = "+name+" ] , [ age = "+age+" ] , [ mail = "+mail+" ]";
	}


}
