package com.ds;

public class CircularQueue {
   int rear;
   int front;
   Object [] QueueArray;
   int CurSize;
   int MaxSize;
   
	public CircularQueue() {
		// TODO Auto-generated constructor stub
		front=0;
		rear=-1;
		 QueueArray=new Object[100000];
		 CurSize=0;
		 MaxSize=100000;
		
		
	}
	
	public CircularQueue(int MaxSize) {
		// TODO Auto-generated constructor stub
		front=0;
		rear=-1;
		 QueueArray=new Object[MaxSize];
		 CurSize=0;
		 this.MaxSize=MaxSize;
		
		
	}
	
 public boolean isEmpty() {
	 return (rear==-1 || CurSize==0); //o(1)
	 
 }	
 public boolean isFull() {
	 return (this.CurSize==this.MaxSize);//o(1)
 }
 
 public void insert(Object e) {
	 if(rear == MaxSize-1) // deal with wraparound
		 rear = -1;
	 QueueArray[++rear]=e;
	 CurSize++;//o(1)
 }
 public Object Remove() {
	 
	 Object temp=QueueArray[front++];  //O(1)
	 if(front == MaxSize) // deal with wraparound
		 front = 0;
	 CurSize--;
	return temp;
 }
 
 public Object peekFront() {
	return  QueueArray[front];//o(1)
 }
 public Object peekRear() {
	return  QueueArray[rear];//o(1)
 }
	
 public int Size() {
	 return this.CurSize;
 }
 
}
