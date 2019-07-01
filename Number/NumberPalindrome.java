package com.bob.hms.admin.common.pract;

public class NumberPalindrome {
	
	public static  int isNumPalindrome(int number) {
		
		int reverse =0;
		int reminder = 0;
		do {
			reminder = number%10;
			reverse = reverse * 10 + reminder;
			number = number/10;
		} while (number > 0);

		return reverse;
	}

	public static void main(String[] args) {
		int number = 21112;
		int reverse = isNumPalindrome(number);
		if (number == reverse) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is Not a Palindrome");
		}
	}

}
