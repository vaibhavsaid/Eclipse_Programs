package Assign9;

public class P4 {
	static int fact(int last) {
		int fact = 1;
		for (; last >= 2; last--) {
			fact = fact * last;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("start main");
		int count = 0, user = 3, last, value, n, sum,result=0;
		for (int num = 1; count < user; num++) {
			n = num;
			sum = 0;
			while (n != 0) {
				last = n % 10;
				n = n / 10;
				value = fact(last);
				sum = sum + value;
			}
			if (num == sum) {
				System.out.println(num);
				result=result+num;
				System.out.println("count is  " + ++count);
			}
			// System.out.println("n at end " +n);
		}
		System.out.println("sum of 1st " +user + " no is " +result );
		System.out.println("end");
	}
}
