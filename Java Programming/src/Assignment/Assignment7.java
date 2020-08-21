package Assignment;

public class Assignment7 {

	public static void main(String[] args) {
		//num(1);
		int z=1;
		while(z!=0) {
			int ew=20;
			System.out.println(ew);
			z++;
		}
	}
	static void num(int n) {
		if(n<=5) {
			System.out.println(n);
			n++;
			num(n);
		}
	}
}
