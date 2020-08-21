package com.assignment;

import java.util.Scanner;						//importing scanner class

public class FTP {								//start of class
	static Scanner sc; static int fact,j;		//declaring static variable
	static int factorial() {					//factorial method implementation
		System.out.println("enter no for which u want factorail");		//user input
		int factno = sc.nextInt();										//storing user input
		if(factno>0) {													//vaalidation
		 fact=1;														//initialize
		for (int i = factno; i >=1; i--) {								//loop find the factorial
			fact=fact*i;
		}
		}
		else {
			System.out.println("wrong input");						//wrong input msg
		}
		return fact;											//returing fact value to caller
	}
	static void table() {										//table method implementation
		System.out.println("enter no for which u want table");	//user input
		int no = sc.nextInt();									//storing user input
		if(no>1) {												//validation
		for(int i=1;i<=10;i++) {								
			System.out.println(no*i);							//table calculate
		}
		}
		else {
			System.out.println("wrong input");					//wrong user input
		}
	}
	static void prime() {										//prime no implementaation method
		System.out.println("enter no for which u want to find prime or not");  //user input
		int value = sc.nextInt();												//storing user input
		if(value>1) {														//validation
			for(int i=2; i<value; i++)
			{
				if(value%i==0)
				{
					j=j+1;												//flag variable 
				}

			}

			if(j>0){

			System.out.println("The no which u entered is " +value +"which is not a prime " );
			}

			else{
			System.out.println("The no which u entered is " +value +"which is a prime ");
			}
		}
		else {
			System.out.println("wrong input");
		}
	}

	public static void main(String[] args) {		//starting of main
		// TODO Auto-generated method stub
		 FTP.sc = new Scanner(System.in);				//creating scanner obj
		System.out.println("enter choice");				//user msg
		byte user = sc.nextByte();						//storing user input
		switch(user) {									//input to swith
		case 1:System.out.println("fact of given no is " + factorial());
			break;
		case 2:table();
			break;
		case 3:FTP.prime();
			break;
		}
	}
}
