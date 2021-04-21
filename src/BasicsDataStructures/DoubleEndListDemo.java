package BasicsDataStructures;

public class DoubleEndListDemo {

	public DoubleEndListDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleEndList dell =new DoubleEndList();
		dell.insertLast(5);
		dell.insertLast(7);
		dell.insertFirst(2);
		dell.insertFirst(74);
	Node n=	dell.deleteFirst();
	  //Node nn=  dell.deleteLast();//error
	    dell.DisplayDoubleEndList();
	}

}
