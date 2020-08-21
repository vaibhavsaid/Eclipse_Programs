package com.array.interface_reference;

import java.util.Scanner;

public class Employee {
	static String[][] arr=new String[7][5];
	String name,designation;boolean value;
	boolean checkemp(String name,String designation){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==name ......) {
					System.out.println("emp name already add as" +designation);
					value= false;
				}
				else {
					value=true;
				}
				
			}
		}
		return value;
	}
	void setname(int i){
		int no=i;
		for (; i < (no+1); i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==null) {
					arr[i][j]=name;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		Employee e=new Employee();
		System.out.println("enter the name of emp");
		e.name=sc.nextLine();
		System.out.println("enter the designation of emp");
		e.designation=sc.nextLine();
		if(e.checkemp(e.name,e.designation)) {
		switch(e.designation) {
		case "HR":e.setname(0);
			break;
		case "TE":e.setname(1);
			break;
		case "Dev":e.setname(2);
			break;
		case "TL":e.setname(3);
			break;
		case "DL":e.setname(4);
			break;
		case "TM":e.setname(5);
			break;
		case "DM":e.setname(6);
		break;
		default:System.out.println("enter valid designation");
		}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j]!=null) {
						System.out.print(arr[i][j]+ " " );
					}
				}
				System.out.println();
			}
		}
		}
	}
}
