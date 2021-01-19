package com.ds;

public class LinkedList {

	Node first;
	int size=0;
	
	public LinkedList(Node newNode) {
		// TODO Auto-generated constructor stub
		first=newNode;
		
	}
	public LinkedList() {
		// TODO Auto-generated constructor stub
		first=null;
		
	}
	/*function used count size linkedlist */
	public int  SizeLinkedList() {
		return size;
	}
	/*function used "is it empty or no "*/
	public boolean IsEmpty() 
	{  //o(1)
		return (first==null);
	}
	
	public void AddFirst(Node newNode)
	{
		//o(1)
		if(IsEmpty())
		{
		first=newNode;
		}else 
		{
		newNode.next=first;
		first=newNode;
		}
	size++;
	}
	
	public void DeleteFirst() 
	{ //o(1)
		if(!IsEmpty()) {
		first=first.next;
      
		}
		size--;
		
	}
	
	public void AddLast(int idata) 
	{ //o(n)
		Node newNode=new Node(idata);
		if(IsEmpty()) 
		{
			first=newNode;
		}else {
			 Node cur = first;
			 while(cur.next !=null) {
				 cur=cur.next;
			 }
			 cur.next=newNode;
			
		}
		size++;
		
	}
	
	public Node DeleteLast() 
	{  //o(n)
		Node temp;
		Node cur=first.next;
		Node prev=first;
		if(!IsEmpty()) {
			while(cur!=null) {
				prev=cur;
				cur=cur.next;
				
			}
			temp=cur;
			prev.next=null;
			size--;
			return temp;
			
		}
		return null;
		
	}
	
	/*find element  */
	public Node Find_Element (int key) 
	{    
		Node cur = first;
		while(cur.value!=key)
		{
			if(cur.next==null) {
				return null;
			}else {
				cur=cur.next;
			}
		}
		return cur;
				
		
	}
	
	public Node Delete(int key) {
		Node cur=first;
		Node prev=first;
		while(cur.value != key)
		{
		if(cur.next == null)
			return null; // didn’t find it
			else
			{
			prev = cur; // go to next link
			cur = cur.next;
			}
			 // found it
			if(cur == first) // if first link
			first = first.next; // change first
			else // otherwise
			prev.next = cur.next; // bypass it
		}
			return cur;
	}
	
	/*merge sort*/
	/*function get middle linked list */
	 public  Node getMiddle(Node  first) 
	    { 
	        if (first == null) 
	            return null; 
	  
	        Node slow =first, fast =first; 
	  
	        while (fast.next != null && fast.next.next != null) { 
	            slow = slow.next; 
	            fast = fast.next.next;
	        } 
	        return slow; 
	    } 
	 public Node sortTwoNode(Node a,Node b) {
		 if (a==null || b==null) {
			 return null;
		 }
		 Node res=null;
		 if(a.value<=b.value) {
			 res=a;
			 res.next=sortTwoNode(a.next,b);
		 }else {
			 res=b;
			 res.next=sortTwoNode(a,b.next);
			 
		 }
		 return res;
	 }
	 public Node MergeSort(Node  first) 
	 {
		 if(first==null || first.next==null)
		 {
			 return null;
		 }
		 Node mid=getMiddle(first);
		 Node midNext=mid.next;
		 mid.next=null; //seperate two linkedlist
		 
		 Node linkedLeft=MergeSort(first);
		 Node linkedRight=MergeSort(midNext);
		 Node sortLinkedlist=sortTwoNode(linkedLeft,linkedRight);
		 return sortLinkedlist;
		 
		 
	 }
	  void printList(Node n) 
	    { 
	        while (n != null) { 
	            System.out.print(n.value + " "); 
	            n = n.next; 
	        } 
	    } 
	
	
	public void DisplayLinkedList()
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
