package com.ds;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {55,40,-22,10,-2,20,30};
		 for(int i=0;i<arr.length;i++) {
			 int temp=arr[i];
			 int j;
			 for(j=i;j>0 && arr[j-1]>temp ;j--) 
			 {
				 arr[j]=arr[j-1];
			 }
			 arr[j]=temp;
		 }
		 
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				}
				
	}
	/*
	 stable
	 in palce 
	 o(n^2) 
	 */

}
