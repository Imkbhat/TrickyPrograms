package com.bob.hms.admin.common.pract;

import java.util.HashMap;
import java.util.Map;

public class StringFindRepeatCharecters {
	
	public static void findRepeatCharacters(String str) {
		char[] charArr = str.toCharArray();
		Map<Character,Integer> countMap = new HashMap<Character, Integer>();
		for (char ch : charArr) {
			if (countMap.containsKey(ch)) {
				int val = countMap.get(ch);
				countMap.put(ch, ++val);
			} else {
				countMap.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> keyValMap : countMap.entrySet()) {
			System.out.println("Character "+keyValMap.getKey() +" has count "+keyValMap.getValue());
		}
		
	}

	public static void main(String[] args) {
		findRepeatCharacters("I LOVE MY INDIA");
	}

}
