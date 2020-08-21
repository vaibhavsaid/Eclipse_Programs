package com.cheecked_Unchecked_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exe {
	public static void main(String[] args) {
		System.out.println("main");
		int num = 40, count = 0;
		for (; num != 0; ) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
		System.out.println("end11");
		/*
		 * try { FileReader r = new FileReader("s"); } catch (FileNotFoundException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}
}
