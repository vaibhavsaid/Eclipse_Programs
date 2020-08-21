package com.array.interface_reference;

import java.util.Scanner;

public class Books {
	String s1;
	static String[][] arr=new String[4][5];
	void aBook(int i ) {
		int no=i;
		for (; i < (no+1); i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==null) {
					arr[i][j]=s1;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		Books b1=new Books();
		System.out.println("enter the book name");
		b1.s1=sc.nextLine();
		sc.close();
		 char fletter=b1.s1.charAt(0);
		 switch(fletter) {
		 case 'a':b1.aBook(0);
		 	break;
		 case 'b':b1.aBook(1);
		 	break;
		 case 'c':b1.aBook(2);
			 break;
		 case 'd':b1.aBook(3);
			 break;
		 }
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]!=null) {
					System.out.print(arr[i][j]+ "  " );
				}
				
			}
			System.out.println();
		}
		 System.out.println("...........................................");
		}
	}
}
