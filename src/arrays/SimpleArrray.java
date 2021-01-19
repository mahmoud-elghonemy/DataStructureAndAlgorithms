package arrays;

public class SimpleArrray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // one dimension array 
		int []arr =new int [3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		System.out.println("Simple Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("");
		// objects array
		Students [] stu=new Students [2];
		stu[0]=new Students("mahmoud",10);
		stu[1]=new Students("ahmed ",11);
	
		System.out.println("Objects arrays:");
		for(Students o :stu) {
			System.out.println(o.name+":"+o.id);
		}
		
	
	
	System.out.println("");
	
	// two dimension array 
	int [][] TwoD=new int [3][3];
	TwoD[0][0]=1;
	TwoD[0][1]=1;
	TwoD[0][2]=1;
	TwoD[1][0]=1;
	TwoD[1][1]=1;
	TwoD[1][2]=1;
	TwoD[2][0]=1;
	TwoD[2][1]=1;
	TwoD[2][2]=1;
	System.out.println("two dimension array:");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(TwoD[i][j]+" ");
		}
		System.out.println("");
	}
	
	}
}
