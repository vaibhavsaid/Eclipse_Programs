package assign11_20aug;

public class Perfect {
	static boolean isperfect(int num){
		int sum=0,div;
		for(div=1;div<=num/2;div++) {
			if(num%div==0) {
				sum=sum+div;
			}
		}
		return num==sum;
	}
	public static void main(String[] args) {
		int num=100;
		boolean result=isperfect(num);
		if(result) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect no");
		}
	}

}
