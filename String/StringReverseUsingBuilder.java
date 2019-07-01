package com.bob.hms.admin.common.pract;

public class StringReverseUsingBuilder {

	public static void main(String[] args) {
			String str = new String("Kiran Bhat");
			StringBuilder builder = new StringBuilder(str);
			String revStr = builder.reverse().toString();
			System.out.println("String Reverse after "+revStr );
	}

}
