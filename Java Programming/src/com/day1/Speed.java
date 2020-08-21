package com.day1;

public class Speed {

	public static void main(String[] args) {
		int x=10;
		System.out.println("main");
		while(x--> 0) {
			//System.out.println(x);
			System.out.println("inside while");
		}
		System.out.println("end");
		
		
		/*int speed=88,result;                           //declaration of variables
		boolean birthday=true;							//speed range
		if(speed<=60 && speed>0) 
		{
			System.out.println(0 + " No ticket");		//display result
		}
		else if(speed>=61 && speed<=80)					//speed range
		{
			if(birthday==true)							//checking birthday variable 
			{
				result=speed-5;							//On birthday speed can be 5 higher allowed 
				if(result<=60)							//for result variable less and equal to 60 return 0 else 1
				{
					System.out.println(0 + " No ticket");
				}
				else {
					System.out.println(1 + " Small ticket");
				}
			}
			else {												//return 1 when birthday variable is false
				System.out.println(1 + " Small ticket");
			}
		}
		else if(speed>=81 && speed<=300)					//speed range
		{
			if(birthday==true)								//checking birthday variable 
			{
				result=speed-5;									//On birthday speed can be 5 higher allowed 
				if(result<=80)									//for result variable less and equal to 80 return 1 else 2
				{
					System.out.println(1 + " Small ticket"); 
				}
				else {
					System.out.println(2 + " big ticket");
				}
			}
			else {
				System.out.println(2 + " big ticket");         //return 2 when birthday variable is false
			}
		}
		else {												//for negative speed return invalid speed
			{
				System.out.println("invalid speed");
			}
		}
		*/
	}
}
