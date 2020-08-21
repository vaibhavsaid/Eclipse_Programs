package com.dimention;

public class Demo {
	public static void main(String[] args) {
		int[][] c = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[2][2]);
		System.out.println("length is " + c.length);
		System.out.println(c[0].length);
		System.out.println("stary");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
		System.out.println("end");
	}
}
