package com.bl.binarysearchtree;

import java.util.Scanner;

/*
 * @author :Sadanand pandey 
 * creating BST for inserting node
 */
public class BinaryTree {
	public static void main(String[] args) {
		// calling run method to perform insertion
		new BinaryTree().run();
	}

	/*
	 * represent the node of BST
	 */
	static class Node {
		Node left;
		Node right;
		int number;

		/*
		 * created constructor to sset value of number
		 */
		public Node(int number) {
			this.number = number;
		}
	}

	/*
	 * in this run() method taking inputs from user and setting to insert() method
	 */
	public void run() {
		Node rootNode = new Node(56);
		System.out.println("Creating binary tree with root values ");
		System.out.println("=========================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of node of binary tree : ");
		int element = sc.nextInt();
		for (int i = 0; i < element; i++) {
			System.out.println("Enter number : " + i);
			int number = sc.nextInt();
			insert(rootNode, number);
		}
	}

	/*
	 * inserting number to right position in the tree by comparing each time
	 */
	public void insert(Node node, int number) {
		if (number < node.number) {
			if (node.left != null) {
				insert(node.left, number);
			} else {
				System.out.println("Inserted " + number + " to left of node " + node.number);
				node.left = new Node(number);
			}
		} else if (number > node.number) {
			if (node.right != null) {
				insert(node.right, number);
			} else {
				System.out.println("Inserted " + number + " to righ of node " + node.number);
				node.right = new Node(number);
			}
		}
	}
}