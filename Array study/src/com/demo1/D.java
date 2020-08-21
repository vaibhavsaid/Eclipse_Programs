package com.demo1;

public class D {
	static int[] i = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//D d1 = new D();
		//System.out.println(d1);
		
		System.out.println(D.i);
		//System.out.println(D.i.length);
		for(int j=0;j<=9;j++)
		{
			i[j]=10 *(j+1);
			System.out.println(i[j]);
		}
	}

}
