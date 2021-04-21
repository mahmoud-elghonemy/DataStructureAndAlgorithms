package BasicsDataStructures;

public class DoubleLinkedList {
	 DoubleNode first;
	 DoubleNode last;
	 int size;
	 
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
		first=null;
		last=null;
		
	}
	
	public DoubleLinkedList(DoubleNode n) {
		first=n;
		last=n;
		
	}
	
	
	public boolean isEmpty() //o(1)
	{
		
	return  (this.size==0 || (first==null && last==null) )	;
	}
	
	
	public void AddFirst(DoubleNode newNode) //o(1)
	{
		if(this.isEmpty()) 
		{
			first=newNode;
			last=newNode;
			newNode.next=null;
			newNode.prevs=null;
		}
		else
		{
			first.prevs=newNode;
			newNode.next=first;
			first=newNode;
			newNode.prevs=null;
			
		}
		this.size++;
	}
	
	public void AddLast(DoubleNode newNode) { //o(1)
		
		if(this.isEmpty()) 
		{
			first=newNode;
			last=newNode;
			newNode.next=null;
			newNode.prevs=null;
		}else
		{
			last.next=newNode;
			newNode.prevs=last;
			last=newNode;
			
		}
		this.size++;
	}
           
	public DoubleNode DeleteFirst()  //o(1)
	{ 
		DoubleNode temp=first;
		first=first.next;
		first.prevs=null;
		this.size--;
		return temp;
		
		
	}
	
	public DoubleNode DeleteLast()  //o(1)
	{
		DoubleNode temp=last;
		last=last.prevs;
		last.next=null;
		this.size--;
		return temp;
	}
	
	public void Delete(int key) //o(n)
	{    
		DoubleNode cur=first;
		
		if(this.first ==null || this.last==null) {
			return;
		}
		while(cur !=null) 
		{
			if(cur.idata== key) 
			{
				if(cur==first) 
				{
					first=cur.next;
					cur.next.prevs=null;
				}else if(cur==last) 
				{ 
					cur.next=null;
					last=cur.prevs;
					
				}else
				{
				
				cur.prevs.next=cur.next;
				cur.next.prevs=cur.prevs;
				
				}
			}
			cur=cur.next;
		} 
		this.size--;
	}
	
	public void DisplayForward() 
	{
		DoubleNode cur=first;
		if(!this.isEmpty()) {
			while(cur!=null)
			{
				
				System.out.println("value node in doublylinkedlist is "+ cur.idata);
				cur=cur.next;
			}
		}else {
			System.out.println("doubly  linkedlist is empty");
		}
		
	}
	
	public void  DisplayBackword()
	{
		DoubleNode cur=last;
		if(!this.isEmpty()) {
			while(cur!=null)
			{
				
				System.out.println("value node in doublylinkedlist is "+ cur.idata);
				cur=cur.prevs;
			}
		}else {
			System.out.println("doubly linkedlist is empty");
		}
		
		
	} 
	
	
}
