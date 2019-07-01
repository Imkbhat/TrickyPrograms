package com.bob.hms.admin.common.pract;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Nitin";
		StringBuilder builder = new StringBuilder(str);
		String revStr = builder.reverse().toString();
		if (str.equalsIgnoreCase(revStr)) {
			System.out.printf(str +" and "+ revStr +" are Palindrome");
		} else {
			System.out.printf(str +" and "+ revStr +" are Not Palindrome");
		}
	}

}
