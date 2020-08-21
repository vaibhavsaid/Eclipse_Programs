package com.array.interface_reference;

public class Exe {
	static Object ob;
	public static void main(String[] args) {
		Animal a1=new Cat();
		Animal a2=new Dog();
		Animal a3=new Lizard();
		Animal a4=new Cat();
		Animal a5=new Dog();
		Animal a6=new Lizard();
		Animal a7=new Cat();
		Animal a8=new Dog();;
		Animal a9=new Lizard();
		System.out.println(ob);
	}
}
