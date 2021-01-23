package com.sample.BST;

public class Execution {

	public static void main(String[] args) {
		Tree bst = new Tree();

		Node root;
		root = new Node(20);
		bst.insert(root, 5);
		bst.insert(root, 1);
		bst.insert(root, 15);
		bst.insert(root, 9);
		bst.insert(root, 7);
		bst.insert(root, 12);
		bst.insert(root, 30);
		bst.insert(root, 25);
		bst.insert(root, 40);
		bst.insert(root, 45);
		bst.insert(root, 42);

		bst.inorder(root);
		System.out.println("Search "+bst.search(14, root).getData());
	}
}
