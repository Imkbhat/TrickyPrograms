package com.bob.hms.admin.common.pract;

public class StringPermutationOfaWord {
	
	//i first index
	//j is second index
	public static String swap(String a, int i,  int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	
	//s is start index
	//e is end index
	private static void permute(String str, int s, int e) {
		if (s == e) { //first and last index are same simply return String
			System.out.println(str);
		} else {
			for (int i=s;i<=e;i++) { //loop through from 1st index till  last index
				str = swap(str, s, i ); //swap str with start index and next index
				permute(str, s+1, e); //again recurse permute with next of start and end
				str = swap(str, s, i); // again swap str with start and next
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "ABC";
		StringPermutationOfaWord word = new StringPermutationOfaWord();
		word.permute(str, 0, str.length()-1);
	}

}

//Output
/*
* ABC
* ACB
* BAC
* BCA
* CBA
* CAB
*/
