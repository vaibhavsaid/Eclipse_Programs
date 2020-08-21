package com.array.interface_reference;

public class Exe3 {

	public static void main(String[] args) {
		Animal[][] A=new Animal[3][3];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if(i%2==0)
					A[i][j]=new Cat();
				else if(j%3==0)
					A[i][j]=new Dog();
				else {
					A[i][j]=new Lizard();
				}
			}
		}
		for (int f = 0; f < A.length; f++) {
			for (int i = 0; i < A[f].length; i++) {
				System.out.println(A[f][i]);
			}
		}
	/*	for (int f = 0; f < A.length; f++) {
			for (int i = 0; i < A[f].length; i++) {
				if(A[f][i] instanceof Dog) {
					System.out.println("Dog obj present");
				}
			}
		}*/
	}
}
