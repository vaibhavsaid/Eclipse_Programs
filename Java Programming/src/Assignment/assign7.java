package Assignment;

public class assign7 {											//start of class

	public static void main(String[] args) {					//start of main
		int num=888,last,temp=0,count=0;					//declaration and initialization of variables
		while(num!=0) {											//loop execute till num values becomes 0 
			last=num%10;										//to extract last digit in a number
			num=num/10;											//to eliminate last digit in a num
			if(last==8) {										//checking the value in variable last and and comparing with 8
				if(last==temp) {								//comparing with 2 consecutive digit in a num.if it is 8 then 
					count=count+2;								//keep count double
				}
				else {
					count++;									//else inc counter by 1
				}
			}
			temp=last;											//assign last value to temp  
		}
		System.out.println("no of 8 in given no is "+count);	//print the count varible
	}															//end of main
}																//end of class
