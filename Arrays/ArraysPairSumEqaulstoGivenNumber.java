package com.bob.hms.admin.common.pract;

public class ArraysPairSumEqaulstoGivenNumber {
	
	public static void printPairsEqualsToSum(int[] arr, int sum) {
		
		for (int i=0; i<arr.length; i++) {
			int first = arr[i];
			for (int j= i+1; j<arr.length; j++) {
				int second = arr[j];
				if ((first+second) == sum) {
					System.out.printf("Sum of (%d, %d) %n ", first, second);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[]  arr = {1,2,3,4,5,6,7,8};
		printPairsEqualsToSum(arr, 8);
	}
}
