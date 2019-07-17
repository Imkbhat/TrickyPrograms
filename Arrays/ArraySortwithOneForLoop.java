package com.bob.hms.admin.common.pract;

public class ArraySortwithOneForLoop {

	public static void main(String[] args) {
		int[] arr = {100, 5,2,4,1,6,7,-2,-1};
		
		for (int  i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				arr[i] = arr[i] + arr[i-1];
				arr[i-1] = arr[i] - arr[i-1];
				arr[i] = arr[i] - arr[i-1];
				i = 0;
			}
		}
		
		System.out.println("Sorted Array :");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i] +" ");
	}

}

/*
 * Sorted Array :
-2 
-1 
1 
2 
4 
5 
6 
7 
100 
 * 
 */
