package com.day1;

public class AgeValidation extends RuntimeException {
	AgeValidation(){
		 
	 }
	 AgeValidation(String s1){
		 super(s1);
	 }
	static void checkage(int age){
		if(age<18) {
			System.out.println("not eligible");
		}
		else if(age>=120) {
			throw new AgeValidation("invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}
}
