package HomeworkException;

import java.util.Scanner;

import HideException.P4IllegalArgumentException;

public class Employee {
	int empNumber;
	String name;
	float exp;

	Employee(int empNumber, String name, float exp) {
		this.empNumber = empNumber;
		this.name = name;
		this.exp = exp;
	}

	void display() {
		System.out.println("emp number is " + this.empNumber);
		System.out.println("emp name is " + this.name);
		System.out.println("emp exp is " + this.exp);
	}

	static boolean validation(float exp) {
		if (exp < 2.5 && exp > 3.6) {
			throw new P4IllegalArgumentException("experience not matching criteria");
		} 
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp no");
		int empNumber = sc.nextInt();
		System.out.println("enter emp name");
		String name = sc.next();
		System.out.println("enter emp experience");
		float exp = sc.nextFloat();
		if(validation(exp)) {
			Employee e = new Employee(empNumber, name, exp);
			e.display();
		}
	}
}
