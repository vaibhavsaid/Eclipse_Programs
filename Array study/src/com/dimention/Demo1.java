package com.dimention;

public class Demo1 {

	public static void main(String[] args) {
		/*int[][][] a = new int[2][][];
		System.out.println(a);
		System.out.println(a[0]);
		a[0]=new int[2][];
		System.out.println(a[0]);
		System.out.println(a[0][0]);
		a[0][0]=new int[3];
		System.out.println(a[0][0]);
		a[0][1]=new int[2];
		System.out.println(a[0][1]);
		System.out.println(a[1]);
		a[1]=new int[2][];
		System.out.println(a[1]);
		System.out.println(a[1][0]);
		a[1][0]=new int[2];
		a[1][1]=new int[3];
		System.out.println(a[1][1].length);
		System.out.println(a[1].length);
		*/
		int[][][] b = {{{1,2,3},{4,5,6}},{{7,8},{9,10,11}}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int j2 = 0; j2 < b[i][j].length; j2++) {
					System.out.print(b[i][j][j2]+ " ");
				}
				System.out.println();
			}
		}
	}
}
