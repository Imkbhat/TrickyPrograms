package com.bob.hms.admin.common.pract;

public class ArrayFindLargestNumber {

	public static int largestNum(int[] arr) {
		int max = 0;
		for (int i =0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,6,2,8,10,9,11};
		int x = largestNum(arr);
		System.out.println("Largest Num "+x);
		
	}

}
