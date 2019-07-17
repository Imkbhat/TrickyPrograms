package com.bob.hms.admin.common.pract;

public class ArraysSecondMaxElement {

	public static void main(String[] args) {
		int[] arr = {2,4,1,6,5,8,9};
		
		//bubble sort technique
		for (int i=0 ; i<arr.length;i++) {
			int temp = 0;
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i=0;i<arr.length;i++)
				System.out.println(arr[i] +" ");
		
		System.out.println("Second large element in an array is "+arr[arr.length-2]);
	}	

}
