package collectionsPhase3LinkedListPracticeQuestions;

public class ListNode 
{
	
	int val;
	ListNode next;
	ListNode prev;
	
	ListNode ()
	{
		
	}
	
	ListNode ( int val )
	{
		this.val = val;
		this.next = null;
		this.prev = null;
	}
	public ListNode ( int val , ListNode next ) 
	{
		this.val = val;
		this.next = next;
	}
	
	
}
