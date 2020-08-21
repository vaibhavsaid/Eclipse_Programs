package com.array.interface_reference;

import java.util.Scanner;

public class Program2 {
	static byte count;
	static void prime(int check) {
		
	}

	public static void main(String[] args) {
		int size,no;
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter the array size");
		size = scr.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the element sin array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scr.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(i>j) 
					no=i-j;
				else 
					no=j-i;
				prime(no);
			}
		}
	}
}
