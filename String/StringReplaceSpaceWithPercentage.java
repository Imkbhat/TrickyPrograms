package com.bob.hms.admin.common.pract;

public class StringReplaceSpaceWithPercentage {

	public static void main(String[] args) {
		String str = "Java is Great";
		String afterReplace = str.replaceAll("\\s", "%20");
		System.out.println(afterReplace);
	}

}
