package com.dimention;

public class Types {

	public static void main(String[] args) {
		int[] a=new int[] {10,20,30};
		//1st method
		/*System.out.println("1st approach");
		for (int i = 0; i < a.length; i++) { 		
			System.out.println(a[i]);
		}
		*/
		//2nd approach
		/*System.out.println("2nd appraoch");
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		*/
		//3rd appraoch 
		/*System.out.println("3rd appraoch");
		int i=0;
		do {
			System.out.println(a[i]);
			i++;
		}while(i<a.length);
		*/
		
		//4th appraoch
		System.out.println("4th appraoch");
		for(int i:a) {
			System.out.println(i);
		}
	}
}
