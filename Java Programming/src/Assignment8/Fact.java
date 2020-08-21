package Assignment8;

public class Fact {

	public static void main(String[] args) {
		int user=4,fact=1;
		for (int i = user; i>=2; i--) {
			fact=fact*i;								
		}
		System.out.println(fact);
	}
}
