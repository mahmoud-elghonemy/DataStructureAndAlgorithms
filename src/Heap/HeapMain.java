package Heap;

public class HeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heap h=new Heap (10);
		h.insert(80);
		h.insert(75);
		h.insert(17);
		h.insert(20);
		h.insert(72);
		h.insert(37);
		h.insert(5);
		h.printHeap();
		System.out.println(h.peek());
		System.out.println();
		h.remove();
		System.out.println(h.peek());
		h.printHeap();
	}

}
