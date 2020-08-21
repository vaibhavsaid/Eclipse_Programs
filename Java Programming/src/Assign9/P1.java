package Assign9;

public class P1 {
	static int fact(int last){
		int fact=1;
		for (; last>=2; last--) {
			fact=fact*last;								
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		int num=40585,last,sum=0,value,n=num;
		while(num!=0) {
			last=num%10;
			System.out.println("last value is " +last);
			num=num/10;
			value=fact(last);
			System.out.println(" value is " +value);
			sum=sum+value;
			System.out.println("sumis " +sum);
		}
		System.out.println("total sum is " +sum);
		if(n==sum) {
			System.out.println("given no " +n+ " is armstring");
		}
		else {
			System.out.println("given no " +n+ " is not armstring");
		}
	}

}