package Heap;

public class Heap {

	private int heap[];
	private int size;
	
	public Heap() 
	{
		heap=new int [1000000];
	}
	
	public Heap(int capacity)
	{
		heap=new int[capacity];
	}
	
	public boolean  isFull()
	{
		return size==heap.length ;
	}
	
	public boolean isEmpty() 
	{
		return size==0;
	}
	
	public int getParent(int index) 
	{
		return (index-1)/2;
	}
	
	public int getChild(int index, boolean left) {
		return 2*index+(left ?1:2);
	}
	
	public int peek() 
	{
		/*corner case */
		if(isEmpty()) {
			System.out.println("Heap is empty");
			return Integer.MAX_VALUE;
		}
		
		return heap[0];
	}
	
	public void insert(int value) //log (n)
	{
		
		/*cornar case */
		if(isFull()) {
			System.out.println("Heap is full ");
			return;
		}
		
		heap[size]=value;
		TrickleUP(size);
		size++;
		
	
		
	}
	
	public int remove()
	{
		/* corner case */
		if(isEmpty()) 
		{
			System.out.println("Heap is empty");
			return 0;
		}
		
		int root = heap[0];
		heap[0]=heap[size-1];
		TrickleDown(0);
		return root;
		
		
	}
	
	public void TrickleUP (int index)
	{
	int NewItem=heap[index];
	while(index>0 && NewItem > heap[getParent(index)] ) 
	{
	heap[index]=heap[getParent(index)];
	index=getParent(index);
	}
	heap[index]=NewItem;

	}
	
	public void TrickleDown(int index)
	{
	int largeChild;
	int top=heap[index];
	 while(index<size/2) {
		 int rightChild=getChild(index,false);
		 int leftChild=getChild(index,true );
		 if(rightChild < size && heap[rightChild] > heap[leftChild] ) {
			 largeChild=rightChild;
		 }else 
		 {
			 largeChild=leftChild;
		 }
		 
		 
		 if(top>heap[largeChild])
		 {
			 break;
		 }
		 heap[index]=heap[largeChild];
		 index=largeChild;
		 
	 }
	 heap[index]=top;
	
	}
	
    public void printHeap() {
    	
    	for(int i=0;i<size;i++) {
    		
    		System.out.print(heap[i] +", ");
    	}
    	System.out.println();
    }	
	
}
