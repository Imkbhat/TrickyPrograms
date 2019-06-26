package com.bob.hms.admin.common.pract;

import java.util.Arrays;

public class ArrayFindLargestAndSmallestNumber {

	public static void largestAndSmallestNum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("Given integer array : " + Arrays.toString(arr));
        System.out.println("Largest number in array is : " + max);
        System.out.println("Smallest number in array is : " + min);	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,6,2,8,10,9,11};
		largestAndSmallestNum(arr);
	}

}
