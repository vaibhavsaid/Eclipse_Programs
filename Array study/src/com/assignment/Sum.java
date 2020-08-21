package com.assignment;

/* This program accept size and value of array from user and calculates the sum of all input and diaplay */


import com.hiddenfiles.Arrayhidden;                       //this files contain all hidden methods

public class Sum {											//statting of class
	public static int size,sum; public static int[] arr;  //declaring of global static variables and array 
	public static void main(String[] args) {				//starting of main
		Arrayhidden a = new Arrayhidden();					//creating obj
		size= a.arraysize();								//calling method for userinput of array size
		 arr=new int[size];									//assigning teh user size
		a.userinput();										//calling userinput method
		System.out.println(sum=a.calc());					//calling calc method for sum and dispalying
		System.out.println(a.biggest());					//calling biggest no
		System.out.println(a.smallest());					//calling smallest no
		
		// TODO Auto-generated method stub
		/* sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter values");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			System.out.println("enter values");
		}
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of " + n +" element is " + sum);
		
		*/
	}
}
