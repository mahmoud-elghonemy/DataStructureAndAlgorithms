package BasicsDataStructures;

public class Node {
    
	int value;
	Node next;
	
	public Node( ) {
		// TODO Auto-generated constructor stub
       
		
	}
	public Node(int value ) {
		// TODO Auto-generated constructor stub
		this.value=value;
		
	}
	public Node(int value,Node next) {
		// TODO Auto-generated constructor stub
		this.value=value;
		this.next=next;
	}
	
	public void DisplayNode(Node n)
	{
		System.out.println("Value :"+ n.value);
		
	}
	

}
