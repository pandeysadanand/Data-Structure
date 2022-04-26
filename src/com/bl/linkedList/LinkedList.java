package com.bl.linkedList;

/*
 * @author: sadanand pandey
 * creating simple linked list
 */
import java.util.*;

public class LinkedList {
	public static void main(String[] args) {
		List list = new java.util.LinkedList<>();
		/*
		 * Adding number to list
		 */
		list.add(0, 56);
		list.add(1, 30);
		list.add(2, 70);
		/*
		 * printing all element present in list
		 */
		System.out.println(list);
	}
}