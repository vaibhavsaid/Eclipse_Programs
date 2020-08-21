package com.Exception_Handling;

public class Executable {

	public static void main(String[] args) {
		System.out.println("start of main");
		System.out.println(10/0);
		System.out.println("End of main");
		new ArithmeticException(); 
	}
}
