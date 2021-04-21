package Tree;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree t1= new Tree();
		t1.insert(25);
		t1.insert(10);
		t1.insert(35);
		t1.insert(27);
		t1.insert(25);
		t1.insert(5);
		t1.insert(11);
		t1.TraversalInOrder();
	
		TreeNode t2=t1.get(5);
		
		System.out.println(t2.get());
		t2=t1.get(30);
	//	System.out.println(t2.get());
		t2=t1.get(5555);
		System.out.println();
		System.out.println(t1.min());
		System.out.println(t1.max());
}

}
