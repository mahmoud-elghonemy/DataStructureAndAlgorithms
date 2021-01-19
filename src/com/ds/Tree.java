package com.ds;

public class Tree {

	public TreeNode root;
	
	public void Tree(TreeNode Node) {
		root=Node;
	}
	
	
	public void insert(int value) 
	{
		if(root==null) {
			root=new TreeNode(value);
		}
		else 
		{
		     root.insert(value);	
		}
	}
	
	public void TraversalInOrder()
	{
		if(root !=null)
		{
		root.TraversalInOrder();	
		}
	}	
	public void TraversalPostOrder()
	{
		if(root !=null)
		{
		root.TraversalPostOrder();	
		}
	}	
	public void TraversalPreOrder()
	{
		if(root !=null)
		{
		root.TraversalPreOrder();	
		}
	}	

	public TreeNode get(int key) {
		if(root!=null) 
		{
			return root.get(key);
		}
		return null;
	}
	public int max() {
		if(root ==null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
			}
	}
	public int min() {
		if(root==null) 
		{
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
		
	}
	/*
	public int MaxDepth(TreeNode root )
	{
		if(root==null) {
			return -1;
		}
		else {
			 int Dright=MaxDepth(root.RightChild);
			 int Dleft=MaxDepth(root.LeftChild);
			 return (max(Dright,Dleft)+1);
			
		}
	}*/
}
