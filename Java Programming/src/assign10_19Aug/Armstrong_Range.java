package assign10_19Aug;

public class Armstrong_Range {
	static int mul(int last,int count){
		int result=1;
		while(count!=0) {
			result=result*last;
			count--;
		}
		//System.out.println("result: " +result);
		return result;
	}
	static int digit(int num){
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
	static boolean isArmstrong(int num){
		int temp=num,count,sum=0,last;
		count=digit(num);
		//System.out.println("digit in num " +count);
		while(num!=0) {
			last=num%10;
			sum=sum+mul(last,count);
			num=num/10;
		}
		/*
		 * System.out.println("sum: "+sum); System.out.println("temp: "+temp);
		 * System.out.println(sum==temp);
		 */
		return sum==temp;
	}
	public static void main(String[] args) {
		int num=1,range=1000;
		for( ;num<range;num++) {
			boolean  result=isArmstrong(num);
			if(result) {
				System.out.println(num);
			}
		}
	}
}
