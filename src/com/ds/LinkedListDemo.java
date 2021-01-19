package com.ds;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*  LinkedList link=new LinkedList();
   
   link.AddFirst(new Node(5,null));
   link.AddFirst(new Node(7,null));
   link.AddFirst(new Node(4,null));
   link.AddFirst(new Node(3,null));
   link.DisplayLinkedList();
   System.out.println( link.SizeLinkedList());
   System.out.println(".............");
   link.DeleteFirst();
   System.out.println( link.SizeLinkedList());
   link.DisplayLinkedList();*/
		/*
   LinkedList ll=new LinkedList();
   ll.AddLast(3);
   ll.AddLast(4);
   ll.AddLast(7);
   ll.AddLast(5);
   ll.DisplayLinkedList();
   System.out.println("size ll is " + ll.SizeLinkedList());
   System.out.println("................");
   Node nn= ll.DeleteLast();
   
   System.out.println( "element deleted is "+nn.value );
   ll.DisplayLinkedList();
   System.out.println("size ll is " + ll.SizeLinkedList()); */
		  LinkedList ll2=new LinkedList();
		  ll2.AddLast(10);
		   ll2.AddLast(8);
		   ll2.AddLast(6);
		   ll2.AddLast(9);
		   ll2.DisplayLinkedList();
		   System.out.println("size ll2 is " + ll2.SizeLinkedList());
		   System.out.println("................");
		Node n  = ll2.Find_Element(8);
		if(n==null)   System.out.println("not found");
	  System.out.println("i finded element is "  + n.value );
	  
		 ll2.Delete(8);
		   ll2.DisplayLinkedList();
		  ll2.first=ll2.MergeSort(ll2.first);
		ll2.printList(ll2.first);
	}

}
