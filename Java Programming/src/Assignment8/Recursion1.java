package Assignment8;

public class Recursion1 {
	static int n=3;
	public static void main(String[] args) {
		three(0);
	}
	static void three(int count) {
		if(count<=100) {
			if(count%10==n) {
				System.out.println(count);
			}
			three(++count);
		}
	}
}
