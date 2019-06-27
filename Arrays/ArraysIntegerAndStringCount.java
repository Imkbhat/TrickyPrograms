package com.bob.hms.admin.common.pract;

public class ArraysIntegerAndStringCount {

	public static void main(String[] args) {
		String[] x = {"Kiran", "100", "101", "102", "Bhat"};
		int cn = 0, cs= 0;
		for (int i=0; i<x.length; i++) {
			try {
				int a = Integer.parseInt(x[i]);
					cn++;
			} catch (NumberFormatException ex) {
					cs++;
			}
		}
		
		System.out.println("Numbers "+cn +" Strings "+cs);
	}

}
