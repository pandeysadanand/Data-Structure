package com.bl.linkedList;

import java.util.Scanner;
/*
*@author: Sadanand pandey
*/
public class LinkedList {

	Node head;

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */

	static class Node {
		int data;
		Node next;

		// constructor
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * method to insert new node
	 */
	public static LinkedList insert(LinkedList list, int data) {
		/* creating new node */
		Node newNode = new Node(data);
		newNode.next = null;
		/*
		 * if new node is empty, thenb new node as head
		 */
		if (list.head == null) {
			list.head = newNode;
		} else {
			/*
			 * Else traverse till the last node and insert the new node 
			 */
			Node tail = list.head;
			while (tail.next != null) {
				tail = tail.next;
			}
			// insert new node at last
			tail.next = newNode;
		}
		return list;
	}

	/*
	 * method to print the linkedList
	 */
	public static void display(LinkedList list) {
		Node currNode = list.head;
		System.out.println("---------------------");
		System.out.print("LinkedList: ");

		// traverse through linkedList
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			// go to next node
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		int number;
		LinkedList list = new LinkedList();
		int element;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to insert: \n" );
		element = sc.nextInt();
		for(int i = 1; i <= element; i++) {
			System.out.print("Enter number " + i + " : ");
			number = sc.nextInt();
			list = insert(list, number);
		}
				display(list);
	}
}
