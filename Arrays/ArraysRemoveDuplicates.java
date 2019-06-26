package com.bob.hms.admin.common.pract;

public class ArraysRemoveDuplicates {
	
	public static int removeDuplicates(int[] arr, int n) {
		if (n == 0 || n == 1)
			return n;
		
		int[] temp = new int[n];
		int j=0;
		//first loop always should be using length we pass
		for (int i=0; i<n-1; i++) {
			if (arr[i]  != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		
		//this is to add last element in array
		temp[j++] = arr[n-1];
		
		//copy from temp to  arr
		for (int i=0;i<j;i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,6,6,7,8};
		int length = arr.length;
		length = removeDuplicates(arr, length);
		for (int i=0; i<length; i++)
			System.out.print(+arr[i]+" ");
	}
}
