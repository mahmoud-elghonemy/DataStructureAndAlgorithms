package BasicsDataStructures;

public class DoubleLinkedListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DoubleLinkedList dll=new DoubleLinkedList();
             dll.AddFirst(new DoubleNode (5) );
             dll.AddFirst(new DoubleNode (6) );
             dll.AddLast(new DoubleNode (7));
             dll.AddLast(new DoubleNode (8));
             dll.AddLast(new DoubleNode (10));
             dll.AddLast(new DoubleNode (11));
             dll.DeleteFirst();
             dll.DeleteLast();
            dll.Delete(8);
             System.out.print("forword:");
             dll.DisplayForward();
             System.out.print("backword:");
             dll.DisplayBackword();
	       
	}

}
