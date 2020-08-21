package com.day1;

public class Divisible7 {

	public static void main(String[] args) {
		byte start=100;
		while(start>=7) {
			if(start%7==0) {
				System.out.println(start);
			}
			start--;
		}
		
	}
}
