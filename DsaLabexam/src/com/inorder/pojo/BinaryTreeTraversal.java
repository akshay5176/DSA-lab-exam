package com.inorder.pojo;

public class BinaryTreeTraversal {
public Node root;
	
	public BinaryTreeTraversal() {
		this.root = null;
	}
	
	public void printInorder(Node node) {
		if(node == null) {
			return;
		}
		
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}
	
	
	public void printInorder() {
		
		printInorder(root);
	}

}
