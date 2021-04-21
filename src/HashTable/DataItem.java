package HashTable;

public class DataItem {
 
	private int key;
	private int data;
	public DataItem(int key,int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this .key=key;
	}
	int getkey() {
		return key;
	}
	int getdata() {
		return data;
	}
	void setkey(int key) {
		this.key=key;
	}
	void setdata(int data) {
		this.data=data;
	}
	

}
