package arrays;

import java.util.Arrays;

public class DynamicArray {
int data[];
int size;
			public DynamicArray() {
				size=0;
				data=new int [1];
			  }

			public int getSize() {
				return data.length;
			}
public int get(int index) {
	return data[index];
}
public void put(int element) {
	ensureCapacity(size+1);
	data[size++]=element;
	
}
		public void ensureCapacity(int minCapacity)
		{ 
			int oldCapacity=data.length;
			if(minCapacity>oldCapacity) {
				int newCapacity=oldCapacity*2;
				if(newCapacity<minCapacity) {
					newCapacity=minCapacity;
				}
			
			data=Arrays.copyOf(data, newCapacity);
			}
			
		}
}
