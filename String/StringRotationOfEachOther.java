package com.bob.hms.admin.common.pract;

import java.util.Scanner;

public class StringRotationOfEachOther {
	
	public static boolean isRotationArEqual(String original, String rotated) {
		if (original.length() != rotated.length()) {
			return false;
		}
		
		String concatenatedStr = original + original;
		if (concatenatedStr.indexOf(rotated) != -1) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter original String");
		String s1 = scan.nextLine();
		
		System.out.println("Please enter rotation of String");
		String s2 = scan.nextLine();
		
		if(isRotationArEqual(s1,s2)) {
			System.out.println(s1 +" and  "+ s2 +" are rotation of each other");
		} else {
			System.out.println(s1 +" and  "+ s2 +" are not rotation of each other");
		}
		
	}

}
