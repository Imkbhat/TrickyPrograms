package com.bob.hms.admin.common.pract;

import java.util.Arrays;

public class ArrayMissingOneElement {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,10};
		int missing = getMissingNumber(arr, 10);
		System.out.printf("Missing number in array %s is %d %n", Arrays.toString(arr), missing);
	}
	
	public static int getMissingNumber(int[] numbers, int count) {
		int expectedSum =  (count * (count+1)/2);
		int actualSum = 0;
		for (int number : numbers) {
			actualSum += number;
		}
		return expectedSum - actualSum;
	}

}

//Logic: Find Sum of all element  by using count ex: n(n+1)/2
// and using array find actual sum, and do, totalSum - ActualSum
