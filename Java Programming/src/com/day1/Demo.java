package com.day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		String day,vac;
		boolean weekday=true,vacation;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day as mon,tue,wed,thu,fri,sat or sun");
		 day=sc.nextLine();
		 if(day.equals("mon")|| day.equals("tue")|| day.equals("wed")|| day.equals("thu")|| day.equals("fri")|| day.equals("sat")|| day.equals("sun")) {
		 switch(day) {
		 case "mon":
		 case "tue":
		 case "wed":
		 case "thu":
		 case "fri":weekday=true;
		 break;
		 case "sat":
		 case "sun":weekday=false;
		 break;
		 }
		 System.out.println("updated value in weekday variable is:" + weekday);
		 System.out.println("if u r on vacation then type yes else type no");
		 vac=sc.nextLine();
		 System.out.println("user enter vac value as " + vac);
		 if(vac.equals("yes") || vac.equals("Yes")) {
			 vacation=true;
			 System.out.println("in if block");
			 System.out.println("updated value in vacation variable is:" + vacation);
		 }
		 else {
			vacation=false;
			System.out.println("in else block");
			System.out.println("updated value in vacation variable is:" + vacation);
		}
		 if(weekday !=true || vacation==true) {
			 System.out.println("you are slepping");
		 }
		 else {
			System.out.println("not slepping");
		}
	}
		 else {
			 System.out.println("invlaid day enter");
		 }
	}
}
