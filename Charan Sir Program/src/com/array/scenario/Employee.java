package com.array.scenario;

import java.util.Scanner;

public class Employee {
	static String[][] arr=new String[7][5];
	String name,designation;byte show_names;
	
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
	void showname(int i){
		System.out.println("list of employee work in this department");
		int no=i;
		for (; i < (no+1); i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
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
			
			System.out.println("press 0,1,2,3,4,5,6 to fing name of emp in dep HR,TE,Dev,TL,DL,TM,DM resp.");
			 e.show_names=sc.nextByte();
			switch(e.show_names) {
			case 0:e.showname(0);
				break;
			case 1:e.showname(1);
				break;
			case 2:e.showname(2);
				break;
			case 3:e.showname(3);
				break;
			case 4:e.showname(4);
				break;
			case 5:e.showname(5);
				break;
			case 6:e.showname(6);
			break;
			default:System.out.println("wrong input given");
			}
		}
		
	}
}
