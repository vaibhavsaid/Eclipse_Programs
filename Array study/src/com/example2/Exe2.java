package com.example2;

public class Exe2 {
	
	public static void main(String[] args) {
		int count=0,count1=0;
		int[] arr=new int[5000];
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				arr[i]=2;
				
			}
			else if(i%3==0) {
				arr[i]=3;
				count1++;
			}
			else if(i%4==0) {
				arr[i]=4;
			}
			else {
				arr[i]=5;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3)
				count++;
		}
		System.out.println(count1++);
		System.out.println(count++);
	}
}
