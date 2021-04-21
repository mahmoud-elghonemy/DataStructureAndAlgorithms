package BasicsDataStructures;

public class DoubleEndList {
  private Node first;
  private Node last;
  private int size;
	public DoubleEndList() {
		// TODO Auto-generated constructor stub
		first=null;
		last=null;
	}
    public boolean isEmpty() {
    	return (first==null);
    }
    
    public void insertFirst(int value)
    {   //O(1)
    	Node newNode=new Node(value);
    	
    	if(isEmpty())
    	{
    		first=newNode;
    		last=newNode;
    	}else
    	{  
    		newNode.next=first;
    	
    		first=newNode;
    
    		
    	}
    	size++;
    }
    
    public void insertLast(int value) 
    { //o(1)
    	Node cur=first;
    	Node newNode=new Node(value);
    	if(isEmpty())
    	{
    		first=newNode;
    	
    	}else 
    	{
    		
  
    		last.next=newNode;
    	}
    	last=newNode;
    	size++;
    }
    public Node deleteFirst()
    { //o(1)
    	Node temp=null;
    	if(!isEmpty())
    	{
    		temp=first;
        	first =first.next;
    	}
    	size--;
    	return temp;
    	
    	
    }
    /*
    public Node deleteLast() //o(n)
    {  Node temp=null;
    	Node cur=first;
    	if(!isEmpty()) {
    	while(cur!=last) {
    		if(cur.next==last) {
    			temp=last;
    			cur.next=null;
    			last =cur;
    		}
    		cur=cur.next;
    	}
    	
    }
    	return temp;
    }*/
    

	public void DisplayDoubleEndList()
	{  Node current =first; int i=1;  //O(n)
	System.out.println("Linked list first to end ");
		while(current !=null) {
			
		//	DisplayNode(current);
			System.out.println("num node "+ i + ",value node is "+ current.value );
			current=current.next;
			i++;
		}
	}
    
    
    
}
