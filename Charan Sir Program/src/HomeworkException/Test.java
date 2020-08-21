package HomeworkException;

import java.util.Scanner;

import HideException.Program1Exception1;

public class Test {
	int a, b;
	double result;

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add() {
		this.result = this.a + this.b;
		System.out.println(result);
	}

	void sub() {
		this.result = this.a - this.b;
		System.out.println(result);
	}

	void mul() {
		this.result = this.a * this.b;
		System.out.println(result);
	}

	void div() throws ArithmeticException{
		this.result = (this.a / this.b);
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to add \n" + "2 to sub \n" + "3 to mul \n" + "4 to div");
			byte user = sc.nextByte();
			System.out.println("enter 1st number");
			int a = sc.nextInt();
			System.out.println("enter 2nd number");
			int b = sc.nextInt();
			// if(b==0)
			// throw new Program1Exception1("you enter b value as 0. / by zero error");
			Test my = new Test(a, b);
			switch (user) {
			case 1:
				my.add();
				break;
			case 2:
				my.sub();
				break;
			case 3:
				my.mul();
				break;
			case 4:
				my.div();
				break;
			default:
				System.out.println("invalid input.........");
			}
		}
	}
}
