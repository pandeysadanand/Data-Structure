package com.bl.hashTable;

import java.util.Map;
import java.util.TreeMap;

public class HashTable {
	/*
	 * Function to count frequency of words in the given string
	 */
	static void count_freq(String str) {
		Map<String, Integer> map = new TreeMap<>();

		// Splitting to find the word
		String arr[] = str.split(" ");

		// Loop to iterate over the words
		for (int i = 0; i < arr.length; i++) {

			/*
			 * Condition to check if the array element is present the hash-map
			 */
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		/*
		 * Loop to iterate over the elements of the map
		 */
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

	// main method
	public static void main(String[] args) {
		String str = "To be or not to be";
		System.out.println("Words and their correnspond frequencies : ");
		System.out.println("===========================================");

		// Function Call
		count_freq(str);
	}
}