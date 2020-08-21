package Assign9;

public class P3 {
	static int fact(int last){
		int fact=1;
		for (; last>=2; last--) {
			fact=fact*last;								
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("start main");
		int range=150,user=5,last,value,n,sum;
		for (int num=1;num<range;num++) {
			 n=num;sum=0;
			while(n!=0) {
				last=n%10;
				n=n/10;
				value=fact(last);
				sum=sum+value;
			}
			if(num==sum) {
				System.out.println(num);
			}
			//System.out.println("n at end " +n);
		}
		System.out.println("end");
	}
}
