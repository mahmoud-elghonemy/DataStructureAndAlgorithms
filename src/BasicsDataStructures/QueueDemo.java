package BasicsDataStructures;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	CircularQueue qu=new CircularQueue(10);
		CircularQueue qu2=new CircularQueue(1);
		for(int i=0;i<12;i++) {
			if(!qu.isFull()) {
				qu.insert(i);
			}else {
				System.out.println("sorry ,queue is full");
			}
		}
		if(!qu.isEmpty()) {
			qu.Remove();
		}
		System.out.println(qu.peekFront()+" "+qu.peekRear()+"...." );
		while( qu.Size()>0) {
			System.out.println(qu.Remove());
			
		}
		System.out.println("...............");
		CircularQueue theQueue = new CircularQueue(5); // queue holds 5 items
		theQueue.insert(10); // insert 4 items
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.Remove(); // remove 3 items
		theQueue.Remove(); // (10, 20, 30)
		theQueue.Remove();
		theQueue.insert(50); // insert 4 more items
		theQueue.insert(60); // (wraps around)
		theQueue.insert(70);
		theQueue.insert(80);
		while( !theQueue.isEmpty() ) // remove and display
		{ // all items
	
		Object n = theQueue.Remove(); // (40, 50, 60, 70, 80)
		System.out.print(n);
		System.out.print(" ");
		}
		System.out.println("");
		 */// end main()
		//QueueUsingLinkedlist Q=new QueueUsingLinkedlist(); 
	/*	Q.insert(10);
		Q.insert(5); 
		Q.insert(7);
		Q.insert(10);
		Q.insert(122);
		//Q.remove();
		Q.printQueue();
	*/

}
}
