package com.hiddenfiles;

import java.util.Scanner;

import com.assignment.Sum;						//importing sum class for some public members access


public class Arrayhidden {						//starting of class
	static int n;								//static varibale to hold array size 
	public static Scanner sc;					//Scanner varible
	public int arraysize(){						//method for user input for array
	 sc = new Scanner(System.in);
	System.out.println("enter size of array");  //user input
	n=sc.nextInt();
	return n;									//return to caller
	}
	public void userinput(){					//used for store user input into the array
	System.out.println("enter values");
	for (int i = 0; i < Sum.arr.length; i++) {
		Sum.arr[i]=sc.nextInt();					//storing to array 
		System.out.println("enter values");
	}
	}
	public int calc(){								//mehtod to add all values in array
	for (int i = 0; i < Sum.arr.length; i++) {		
		Sum.sum = Sum.sum + Sum.arr[i];				//storing result in sum
	}
	return Sum.sum;									//return sum to caller
	}
	public int biggest(){								//mehtod to  find biggest no
		int big = Sum.arr[0] > Sum.arr[1] ?  Sum.arr[0]:Sum.arr[1];
		for (int i = 2; i < Sum.arr.length; i++) {
			if(Sum.arr[i]>big)
				big=Sum.arr[i];	
		}
			return big;							//return big to caller
		}
	public int smallest(){								//mehtod to  find smallest no
		int small = Sum.arr[0] < Sum.arr[1] ?  Sum.arr[0]:Sum.arr[1];
		for (int i = 2; i < Sum.arr.length; i++) {
			if(Sum.arr[i]<small)
				small=Sum.arr[i];	
		}
			return small;							//return small to caller
		}
}
