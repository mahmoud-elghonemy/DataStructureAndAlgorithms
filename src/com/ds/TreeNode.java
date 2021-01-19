package com.ds;

public class TreeNode {

	private int value;
	private TreeNode RightChild;
	private TreeNode LeftChild;
	
	public TreeNode(int value) {
		
		this.value=value;
	}
	
	public void insert(int data)
	{
		if(data==value) 
		{
			return;
		}
		
		if(data <value) {
			
			if(LeftChild==null) 
			{
				LeftChild= new TreeNode(data);
			}else 
			{
				LeftChild.insert(data);
			}
			
			
		}else 
		{
			if(RightChild ==null) {
				RightChild =new TreeNode(data);
				
			}else {
				
				RightChild.insert(data);
			}
			
		}
		
		
		
	}
	

	public void TraversalInOrder() {// left nodes - root - right nodes
		
		if(LeftChild!=null) {
			LeftChild.TraversalInOrder();
		}
		System.out.print("data node= "+value +", ");
		
		if(RightChild!=null) 
		{
			RightChild.TraversalInOrder();
		}
		//result is sorted number or array 
	}
	
public void TraversalPreOrder() {//root- left nodes - right nodes 
	System.out.print("data node= "+value +", ");
		if(LeftChild!=null) {
			LeftChild.TraversalInOrder();
		}
		
		
		if(RightChild!=null) 
		{
			RightChild.TraversalInOrder();
		}
		
		 
	}
public void TraversalPostOrder() {// left nodes - right nodes-root 
		
		if(LeftChild!=null) {
			LeftChild.TraversalInOrder();
		}
	
		
		if(RightChild!=null) 
		{
			RightChild.TraversalInOrder();
		}
		System.out.print("data node= "+value +", ");
		 
	}

		public TreeNode get(int key) 
		{
			if(key==value) 
			{
				return this;
			}
			
			  if(key<value)
			{
				if(LeftChild!=null)
				{
					return LeftChild.get(key);	
				}
				
			}
			  else
			  {	
				if(RightChild !=null) {
					return RightChild.get(key);
				}
			 }
			return null;
		  }
		
		
    public int  min() 
    {
    	if(LeftChild ==null) {
    		return value;
    	}else {
    		return LeftChild.min();
    	}
    	
    }	
    
    public int max()
    {
    if(RightChild==null) 
    {
    return value;	
    }	else 
    {
    	return RightChild.max();
    	
    }
    	
    	
    }
		
	public void setValue(int value) {
		this.value=value;
	}
	public int get() {
		return this.value;
	}
}
