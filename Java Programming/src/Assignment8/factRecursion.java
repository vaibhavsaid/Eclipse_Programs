package Assignment8;

public class factRecursion {
	static int fact=1;
	public static void main(String[] args) {
		int user=5;
		System.out.println(fact(user));
	}
	static int fact(int user) {
		if(user>=2) {
			fact=fact*user;
			user--;
			fact(user);
		}
		return fact;
	}
}
