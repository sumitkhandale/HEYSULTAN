package com.sbm.stringcore;

public class Concept {
	public static void main(String[] args) {

		int[] aArray = { 1, 6, 2, 7, 7, 2, 5, 9, 12, 51, 12 };
		int i;
		int j;
		for (i = 0; i < aArray.length - 1; i++) {
			for (j = i + 1; j < aArray.length; j++) {
				if (aArray[i] == aArray[j]) {
					System.out.println("\n The Duplicate element in given array is: " + aArray[j]);
					
				}
			}
		}
	}

}
