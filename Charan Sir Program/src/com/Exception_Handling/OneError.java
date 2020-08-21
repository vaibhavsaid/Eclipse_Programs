package com.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OneError {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("start");
		int i,j;
		System.out.println("enter i" );
		try {
			i=sc.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("invalid input");
			i=0;
		}
		System.out.println("enter j" );
		try {
			j=sc.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("invalid input");
			j=0;
		}
		System.out.println("end");
	}

}
