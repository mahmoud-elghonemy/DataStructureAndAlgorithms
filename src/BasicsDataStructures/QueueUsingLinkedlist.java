package BasicsDataStructures;

public class  QueueUsingLinkedlist {
  
	Node front ;
	Node rear;
	LinkedList ll=new LinkedList();
	public QueueUsingLinkedlist()
	{
		// TODO Auto-generated constructor stub
		front=null;
		rear=null;
		
	}
	public boolean  isEmpty() {
		return ll.IsEmpty() ;
	}
	
	public void insert(int item) 
	{
		if(ll.IsEmpty())
		{
			ll.AddFirst(new Node(item));
			
		}
	}
	public Node remove() 
	{
	   return ll.DeleteLast();
	}
	
	public void printQueue() 
	{
		ll.DisplayLinkedList();
	}
	
	
	

}
