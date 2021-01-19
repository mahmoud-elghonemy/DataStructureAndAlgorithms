package com.ds;

public class StackUsingArray {

	private int MaxSize;
	private Object [] StackArray;
	private  int Top;
	private int CurSize;
	public StackUsingArray() {
		// TODO Auto-generated constructor stub
		MaxSize=100000;
		StackArray=new Object [100000];
		Top=-1;
		CurSize=0;
	}
	public StackUsingArray(int  size) {
		// TODO Auto-generated constructor stub
		StackArray=new Object [size];
		this.MaxSize=size;
		Top=-1;
		CurSize=0;
	}
	public boolean isEmpty()
	{
		return (Top==-1);  //o(n)
	}
	
	public void Push(Object e) 
	{
		StackArray[++this.Top]=e; //o(n)
		CurSize++;
	}
	public Object Top()
	{
		return StackArray[Top]; //o(n)
	}
	public void Pop()
	{
		CurSize--;
		--Top;    //o(n)
	}
	
	public boolean isFull() 
	{
		return (Top==MaxSize-1); //o(n)
	}
	
	public Object Size() 
	{
		return CurSize;   //o(n)
	}
	
	public void printStack() 
	{
		
		 while(! this.isEmpty()) 
         {
        	System.out.println(this.Top());
        	this.Pop();
         }
	}
	
}
