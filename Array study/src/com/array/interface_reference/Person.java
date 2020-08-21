package com.array.interface_reference;
//company program1
public class Person {
	int week=5 ;
	 int total=(week*30);
	float per;
	 int[] attn;
	int[] prod ;
	int[] clfb ;
	   String[] name = new String[20];
	   
	   void cal_sum()
	   {
	       int sum=0;
	       for(int i=0;i<week;i++){
	           sum = sum + attn[i] + prod[i] + clfb[i];
	       }
	       per= sum;
	   }
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		p1.attn=new int[] {6,4,7,5,5};
		p1.prod=new int[] {3,4,3,5,5};
		p1.clfb=new int[] {4,6,5,4,4};
		p1.name=new String[] {"Peter Parker"};
		p2.attn=new int[] {8,9,7,6,8};
		p2.prod=new int[] {3,4,8,6,5};
		p2.clfb=new int[] {7,7,5,8,9};
		p2.name=new String[] {"Steve Rogers"};
		p3.attn=new int[] {3,4,6,4,5};
		p3.prod=new int[] {9,9,8,7,7};
		p3.clfb=new int[] {6,7,6,5,6};
		p3.name=new String[] {"Tony Stark"};
		((float)p1.cal_sum()/p1.total)*100;
		((float)p2.cal_sum()/p2.total)*100;
		((float)p3.cal_sum()/p3.total)*100;
		System.out.println("Percentage of P1:" + p1.per);
		System.out.println("Percentage of P2:" + p2.per);
		System.out.println("Percentage of P3:" + p3.per);
		if(p1.per>=p2.per){
	        if(p1.per>=p3.per){
	            System.out.println("Employee of the week:" +p1.name);
	        }
	        else{
	            System.out.println("Employee of the week:" + p3.name);
	        }
	    }
	    else{
	        if(p2.per>=p3.per){
	            System.out.println("Employee of the week:" + p2.name);
	        }
	        else{
	           System.out.println("Employee of the week: " +p3.name);
	        }
	    }
		
	}

}
