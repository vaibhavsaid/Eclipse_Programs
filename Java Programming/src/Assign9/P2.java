package Assign9;

public class P2 {
	static int fact(int last){
		int fact=1;
		for (; last>=2; last--) {
			fact=fact*last;								
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("start main");
		int count=0,user=5,last,value,n,sum;
		for (int num=1;count<user;num++) {
			//System.out.println("num at begining " +num);
			 n=num;sum=0;
			//System.out.println("num value is "+num);
			while(n!=0) {
				last=n%10;
				//System.out.println("last value is " +last);
				n=n/10;
				value=fact(last);
				//System.out.println(" value is " +value);
				sum=sum+value;
			}
			//System.out.println("total sum is  " +sum);
			//System.out.println("n is " +n);
			if(num==sum) {
				System.out.println(num);
				System.out.println("count is  " + ++count);
			}
			//System.out.println("n at end " +n);
		}
		System.out.println("end");
	}

}
