package collectionsPhase3LinkedListPracticeQuestions;

public class Program12ImplementOwnLinkedList 
{
	
	private ListNode head;
	
	public void add ( int data )
	{
		ListNode newNode = new ListNode(data);
		
		if ( head == null )
		{
			head = newNode;
			return;
		}
		
		ListNode temp = head;
		
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void display()
	{
		ListNode temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void addFirst(int data)
	{
		ListNode newNode = new ListNode(data);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void removeFirst()
	{
		if(head == null)
		{
			System.out.print("List is empty");
			return;
		}
		head = head.next;
	}
	
	public void removeLast()
	{
		if (head == null)
		{
			return;
		}
		if(head.next == null)
		{
			head = null;
			return;
		}
		
		ListNode temp = head;
		
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		temp.next = null;
		
	}
	
	public int size()
	{
		int count = 0;
		ListNode temp = head;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public int get(int index)
	{
		if ( index < 0 || index >= size() )
		{
			throw new IndexOutOfBoundsException("Index: "+index);
		}
		
		ListNode temp = head;
		for ( int i = 0 ; i < index ; i++ )
		{
			temp = temp.next;
		}
		return temp.val;
	}
	
}
