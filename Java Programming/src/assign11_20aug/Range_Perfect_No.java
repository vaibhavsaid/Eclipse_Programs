package assign11_20aug;


public class Range_Perfect_No {
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
		int num=1,range=10000;
		for( num=1;num<=range;num++) {
			boolean result=isperfect(num);
			if(result) {
				System.out.println(num);
			}
		}
	}
}