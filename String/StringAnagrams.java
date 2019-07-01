package com.bob.hms.admin.common.pract;

import java.util.Arrays;

public class StringAnagrams {
	
	public static boolean isAnagram(String s1, String s2) {
		
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		
		if (charArr1.length != charArr2.length) {
			return false;
		} 
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		for (int i=0; i< charArr1.length; i++) {
			if (charArr1[i] != charArr2[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str1 = "Kiran";
		String str2  = "nariKa";
		boolean isAnagram = isAnagram(str1, str2);
		if (isAnagram) {
			System.out.println("Both Strings are Anagram's");
		} else {
			System.out.println("Both Strings are Not  Anagram's");
		}
	}

}
