package BasicsDataStructures;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack using array
		/*
		StackUsingArray st=new StackUsingArray(10);
		
		 st.Push(4);
    	 st.Push(5);
    	 st.Push(10);
    	 st.Push(9);
    	 st.Push(4);
    	 st.Push(5);
    	 st.Push(10);
    	 st.Push(9);
    	 st.Push(4);
    	 st.Push(5);
    	 
             if (!st.isFull()) 
             { 
            	
            	 st.Push(10);
            	 st.Push(9);
             }else {
            	System.out.println("Stack is full , sorry you can't push number");
             }
             
           
          st.printStack(); */
		
		StackUsingLinkedlist stll=new StackUsingLinkedlist();
		stll.Push(new Node(5));
		stll.Push(new Node(6));
		stll.Push(new Node(7));
		stll.Push(new Node(8));
		stll.Pop();
		 while(! stll.isEmpty()) 
         {
        	System.out.println(stll.Top());
        	stll.Pop();
         }
	}

}
