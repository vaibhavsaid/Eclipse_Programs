package HomeworkException;
import java.util.Scanner;

import HideException.LowSalException;

/**
 * This program used to stored and display Employees information.
 * Program will throw exception if experience is not between 2.5 to 3.6.
  */

public class EmpP5 {
	int empId;
	String empName, designation;
	double basic;
	double hra;
	String designation1 = "Manager", designation2 = "Officer", designation3 = "CLERK";

	EmpP5(int empId, String empName, String designation, double basic) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
	}

	void printDET() {
		System.out.println("empid is " + empId);
		System.out.println("empname  is " + empName);
		System.out.println("emp designation is " + designation);
		System.out.println("emp basic is " + basic);
		System.out.println("emp hra is " + hra);
	}

	void calculateHRA(String designation) {
		if (designation.equals(designation1)) {
			this.hra=basic/10;
		}
		else if (designation.equals(designation2)) {
			this.hra=(12/100)*basic;
		}
		else {
			this.hra=basic/20;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empid");
		int empId = sc.nextInt();
		System.out.println("enter empname");
		String empName = sc.next();
		System.out.println("enter emp designation");
		String designation = sc.next();
		System.out.println("enter emp basic sal");
		double basic = sc.nextDouble();
		if(basic <500) {
			throw new LowSalException("u enter basic which is less than 500");
		}
		EmpP5 e = new EmpP5(empId, empName, designation, basic);
		e.calculateHRA(designation);
		e.printDET();
	}
}
