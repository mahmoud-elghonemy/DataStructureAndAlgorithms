package com.ds;

public class main {

	public static  int binarysearch(int a[],int low ,int high,int key){
		if(low>high) {
			return a[high];
		}else {
			int mid=(low+high)/2;
			if(a[mid]>=key) {
				return binarysearch(a,low,mid,key);
			}else {
			return	binarysearch(a,mid,high,key);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int  []{10,12,15,30,42};
	System.out.println(	binarysearch(a,0,5,40));
		

	}
	
	

}
