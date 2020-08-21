package com.day1;

import com.hidden.Program1file;

public class Program1 {
	static boolean weekday;static boolean vacation;
	public static void main(String[] args) {
		Program1file p =new Program1file();
		String day=p.userDay();
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
	
		String vac= p.uservacation();
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
		 

