package com.bob.hms.admin.common.pract;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Kiran Bhat";
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String  ==> "+rev);
	}

}
