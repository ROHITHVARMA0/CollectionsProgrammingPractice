package collectionsPhase2ArrayList;

public class CustomArrayListForIntSetMethodHistory 
{
	
	int index;
	int oldValue;
	
	public CustomArrayListForIntSetMethodHistory ( int index , int oldValue )
	{
		this.index = index;
		this.oldValue = oldValue;
	}
	
	@Override
	public String toString()
	{
		return index+" - "+oldValue;
	}
	
}
