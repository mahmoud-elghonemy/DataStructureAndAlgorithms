package arrays;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		DynamicArray D_Array=new DynamicArray ();
		D_Array.put(4);
	
//	int size_arry= D_Array.getSize();
System.out.println("Size: "+ D_Array.getSize());
D_Array.put(4);
System.out.println("Size: "+ D_Array.getSize());

D_Array.put(5);
System.out.println("Size: "+ D_Array.getSize());

D_Array.put(6);
System.out.println("Size: "+ D_Array.getSize());

D_Array.put(7);
System.out.println("Size: "+ D_Array.getSize());


}
	}
