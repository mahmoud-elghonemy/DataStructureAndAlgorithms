package com.ds;

public class StackUsingLinkedlist {
	LinkedList ll=new LinkedList();
	//private int top=-1;
	private  int Top;
	private int CurSize;
	public StackUsingLinkedlist() {
		// TODO Auto-generated constructor stub
		ll.first=null;
		Top=-1;
	}
    
	public boolean isEmpty() {
		return (Top==-1);//O(n)
	}
	
	public void Push(Node e) {
		ll.AddFirst(e);
		Top++;//O(n)
		CurSize++;
	}
	
	public void Pop() 
	{
		ll.DeleteFirst();//O(n)
		Top--;
		CurSize--;
	}
	
	public Object Top() {
	 return ll.first.value; //O(n)
	}
	public Object Size() 
	{
		return CurSize;   //o(n)
	}
}
