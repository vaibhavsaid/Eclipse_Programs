package com.dimention;

public class Type2 {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5},{6,7,8}};
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		*/
		
		for(int i[]:a) {
			for(int i2:i) {
				System.out.print(i2);
			}
			System.out.println();
		}
		
		//for each loop
		int[][][] b = {{{1,2,3},{4,5,6}},{{7,8},{9,10,11}}};
		for(int i[][]:b) {
			for(int i2[]:i) {
				for(int i3:i2) {
					System.out.println(i3);
				}
			}
		}
	}
}
