package com.hidden;
import java.util.Scanner;
public class Program1file {
	static Scanner sc;boolean weekday;String vac;
	public String userDay(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day as mon,tue,wed,thu,fri,sat or sun");
		return  sc.nextLine();
	}
	public String uservacation(){
		System.out.println("if u r on vacation then type yes else type no");
		 vac=sc.nextLine();
		 System.out.println("user enter vac value as " + vac);
		return vac;
	}
}
