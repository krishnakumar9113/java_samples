package com.sample.BST;

public class Node {

	    private int data;
	    private Node left;
	    private Node right;

	    public Node(int Value){
	        data = Value;
	        left = null;
	        right = null;
	    }

	    public void setRightChild(Node n)
	    {
	        right = n;
	    }

	    public void setLeftChild(Node n){
	        left = n;
	    }

	    public Node getRightChild(){
	        return right;
	    }

	    public Node getLeftChild(){
	        return left;
	    }

	    public int getData(){
	        return data;
	    }

	    public void setData(int x){
	        data = x;
	    }
	
}
