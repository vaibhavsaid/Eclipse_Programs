package com.array;

public class Primitive_Count {
	static int count1,count2;
	public static void main(String[] args) {
		int[] arr=new int[1000];
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				arr[i]=2;
			}
			else if(i%3==0) {
				arr[i]=3;
			}
			else {
				arr[i]=4;
				count1++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==4) {
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
