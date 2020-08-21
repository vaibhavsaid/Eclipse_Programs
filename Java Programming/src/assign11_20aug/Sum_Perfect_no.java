package assign11_20aug;

public class Sum_Perfect_no {
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
		int n=4,count=0,sum=0;
		for(int num=1;count<n;num++) {
			boolean result=isperfect(num);
			if(result) {
				sum=sum+num;
				count++;
			}
		}
		System.out.println("sum:  " + sum);
	}
}
