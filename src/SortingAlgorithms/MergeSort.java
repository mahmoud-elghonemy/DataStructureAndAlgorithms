package SortingAlgorithms;

public class MergeSort {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 int arr[]= {55,40,-22,10,60,20,30};
		
		
		MergeSort(arr,0,arr.length-1);
		
		
		
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
			
		
  
	}
	
	public static void MergeSort(int a[], int start ,int end) 
	{
		if(end-start <2) 
		{
			return;
		}
		
		int mid=(end+start)/2;
		
		MergeSort(a,start,mid);
		MergeSort(a,mid+1,end);
	    merge(a,start,mid+1,end);	
		
	}

	public static void merge(int a[],int l ,int m, int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int Left[]=new int [n1];
		int Right[]=new int [n2];
		for(int i=0;i<n1;i++) 
		{
			Left[i]=a[l+i];
		}
		for(int j=0;j<n2;j++) 
		{
			Right[j]=a[m+1+j];
		}
		
		int i=0 ,j=0;
		int k=1;
		while(i<=n1 && j <= n2) 
		{
			if(Left[i]  <= Right[j])
			{
				a[k]=Left[i];
				i++;
				
			}else {
				a[k]=Right[j];
				j++;
			}
			k++;
		}
		while(i<n1) 
		{
			a[k]=Left[i];
			k++;
			i++;
		}
		while(j<n2) {
			a[k]=Right[j];
			k++;
			j++;
			
		}
	
	}
}
