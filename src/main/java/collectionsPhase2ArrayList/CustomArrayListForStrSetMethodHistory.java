package collectionsPhase2ArrayList;

public class CustomArrayListForStrSetMethodHistory 
{
	
	int index;
	String oldValue;
	
	public  CustomArrayListForStrSetMethodHistory( int index , String oldValue )
	{
		this.index = index;
		this.oldValue = oldValue;
	}
	
	@Override
	public String toString()
	{
		return index + " - " + oldValue ; 
	}
	
}
