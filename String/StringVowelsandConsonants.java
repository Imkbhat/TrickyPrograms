package com.bob.hms.admin.common.pract;

public class StringVowelsandConsonants {

	public static void main(String[] args) {
		String str = new String("i love my india");
		char[] charArr = str.toCharArray();
		int count = 0;
		for (char c : charArr) {
			switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					
			}
		}
		
		System.out.println("Number of Vowels Characters "+count);
	}

}
