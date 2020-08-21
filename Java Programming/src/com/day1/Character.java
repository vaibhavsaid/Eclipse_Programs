package com.day1;

public class Character {

	public static void main(String[] args) {
		char start='A';
		//System.out.println(start);
		while(start<=90) {
			if(start%2==0) {
				System.out.println(start);
			}
			start++;
		}
	}
}
