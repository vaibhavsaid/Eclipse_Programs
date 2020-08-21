package com.assignment;

public class Employee {								//starting of class
	int id;String name;float sal;					//decalring non-static global variable
	Employee(int id, String name){					//parameterize cons
		this.id=id;									//initiaalizing obj 
		this.name=name;
		this.sal=20000;
		this.display();
	}
	Employee(int id, String name,float sal){			//parameterize cons
		this.id=id;										//initiaalizing obj
		this.name=name;
		this.sal=sal;
		this.display();
	}
	void display() {									//display method
		System.out.println("emp id " + this.id);
		System.out.println("emp name " + this.name);
		System.out.println("emp sal " + this.sal);
	}
	public static void main(String[] args) {			//starting of main
		Employee e =new Employee(1,"vaibhav");			//crating obj with initializing obj by passing values in cons
		Employee e1 =new Employee(2,"raj",2000);
	}													//end of main
}														//end of class
