package com.array;

public class Non_Primitive_Object_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandPa[] GPA = new GrandPa[11];
		for(int i=0;i<GPA.length;i++)
		{
			if(i%2==0)
				GPA[i]= new GrandPa();
			else if(i%3==0)
				GPA[i]= new Papa();
			else
				GPA[i]= new You();
		}
	/*	for(int i=0;i<GPA.length;i++)
		{
			if(GPA[i] instanceof GrandPa) {
				System.out.println(GPA[i].k);
			}
			else if(GPA[i] instanceof Papa) {
				Papa p = (Papa)GPA[i];
				System.out.println(p.k);
				System.out.println(p.j);
			}	
			else {
				You u1 = (You)GPA[i];
					System.out.println(u1.i);
					System.out.println(u1.j);
					System.out.println(u1.k);
			}
			*/
			
			for(int i=0;i<GPA.length;i++)
			{
				if(GPA[i] instanceof You) {
					You u1 = (You)GPA[i];
					System.out.println(u1.i);
					System.out.println(u1.j);
					System.out.println(u1.k);
				}
					
				
				else if(GPA[i] instanceof Papa) {
					Papa p = (Papa)GPA[i];
					System.out.println(p.k);
					System.out.println(p.j);
				}	
				else {
					System.out.println(GPA[i].k);
					
				}
			}
		}
				
	}


