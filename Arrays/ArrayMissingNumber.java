package com.bob.hms.admin.common.pract;

import java.util.Arrays;
import java.util.BitSet;

public class ArrayMissingNumber {
	
	public static void main(String[] args) {
		//Missing number from 1-100(1-1000)
		printMissingNumber(new int[] {1, 2, 3, 4, 6, 67, 55, 99}, 100);
	}
	
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitset = new BitSet(count);
		for (int number : numbers) {
			bitset.set(number-1);
		}
		System.out.printf("Missing numbers in integer array %s, with total "+Arrays.toString(numbers), count);
		
		int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
	}
}
