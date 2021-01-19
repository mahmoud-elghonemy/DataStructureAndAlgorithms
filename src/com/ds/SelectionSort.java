package com.ds;

public class SelectionSort {
	 static int arr[]= {55,40,-22,10,-55,-1,30};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* doctor code*//*
		for(int i=0;i<arr.length-1;i++) 
		{
			int indexMin=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[indexMin]) {
					indexMin=j;
				}
				
			}
			swap(indexMin,i);
			
			
		}
		*/
		
		for(int i=arr.length-1;i>0;i--) 
		{
		     int indexMax=i;
	
		 
				for(int j=i-1;j>=0;j--) 
				{
					if(arr[j]>arr[indexMax]) {
						indexMax=j;
					}
				
				}
					
				swap(indexMax,i);
		}
		
		
		/*
		 unstable
		 in palce 
		 o(n^2) 
		 */
		/*
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}*/
		
		
		

	}
	public static void swap(int one,int two)
	{
		int temp=arr[one];
		arr[one]=arr[two];
		arr[two]=temp;
		
	}

}
