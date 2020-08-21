package com.assignment;

public class Product {
	String pid,pname;
	float price;

	public static void main(String[] args) {
		Product[] arr=new Product[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Product();
		}
		
	}

}
