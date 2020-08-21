package com.day1;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		AgeValidation.checkage(sc.nextInt());
	}
}
