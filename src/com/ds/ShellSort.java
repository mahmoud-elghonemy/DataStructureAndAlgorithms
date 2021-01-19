package com.ds;

public class ShellSort {
	 static int arr[]= {55,40,-22,10,60,-1,30};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	   for(int gap=arr.length-1/2;gap>0;gap=gap/2) 
	   {
		   
		   for(int i=gap;i<arr.length;i++) 
		   {
			   int temp=arr[i];
			   int j;
			   for( j=i; j>=gap && arr[j-gap]>temp;j-=gap) {
				  arr[j]=arr[j-gap];
			   }
			   arr[j]=temp;
		   }
	   }	
		
        	
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
