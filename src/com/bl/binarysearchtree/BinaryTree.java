package com.bl.binarysearchtree;

import java.util.Scanner;

/*
 * @author: sadanand pandey 
 * code for inserting number to BST
 */
class BST_class {

	class Node {
		int key;
		Node left, right;

		public Node(int data) {
			key = data;
			left = right = null;
		}
	}

	/*
	 * BST root node
	 */
	Node root;

	/*
	 * Constructor for BST =>initial empty tree
	 */
	BST_class() {
		root = null;
	}

	// insert a node in BST
	void insert(int key) {
		root = insert_Recursive(root, key);
	}

	// recursive insert function
	Node insert_Recursive(Node root, int key) {
		/*
		 * tree is empty
		 */
		if (root == null) {
			root = new Node(key);
			return root;
		}
		/*
		 * traverse the tree
		 */
		if (key < root.key)
			root.left = insert_Recursive(root.left, key);
		else if (key > root.key)
			root.right = insert_Recursive(root.right, key);
		return root;
	}

	/*
	 * method for inorder traversal of BST
	 */
	void inorder() {
		inorder_Recursive(root);
	}

	// recursively traverse the BST
	void inorder_Recursive(Node root) {
		if (root != null) {
			inorder_Recursive(root.left);
			System.out.print(root.key + " ");
			inorder_Recursive(root.right);
		}
	}

	boolean search(int key) {
		root = search_Recursive(root, key);
		if (root != null)
			return true;
		else
			return false;
	}

	// recursive insert function
	Node search_Recursive(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		if (root.key > key)
			return search_Recursive(root.left, key);
		// val is less than root's key
		return search_Recursive(root.right, key);
		
	}
}

class BinaryTree {
	public static void main(String[] args) {
		BST_class bst = new BST_class();

		/*
		 * insert data into BST
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of binary tree: ");
		int length = sc.nextInt();
		for (int i = 0; i < length; i++) {
			System.out.println("Enter number: " + i);
			int number = sc.nextInt();
			bst.insert(number);
		}

		/*
		 * print the BST
		 */
		System.out.println("The BST Created with input data(Left-root-right):");
		bst.inorder();
		System.out.println();
		System.out.println("Enter number to search : ");
		int searchNumber = sc.nextInt();
		boolean ret_val = bst.search (searchNumber);
        System.out.println(searchNumber +" found in BST:" + ret_val );
	}
}