package com.demo1;

public class C {
	
	static int i=10;
	static A a1 = new A() ;
	{
		System.out.println("C class anonymous block");
	}
	C(){
		System.out.println("C class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.a1.k=30;
		System.out.println(C.a1.k);
		System.out.println(C.a1);
	}
}
