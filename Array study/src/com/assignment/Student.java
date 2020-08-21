package com.assignment;

public class Student {				//start of main
	int id; 						//declaring non static global variable
	String name,address ;
	static int count;
	{
		Student.count++;						//to count obj
	}
	Student(int id, String name, String address){		//para cons use to initialize obj
		this.id=id;
		this.name=name;
		this.address=address;
		display();
	}
	void display(){											//display method for user
		System.out.println("student id " + this.id);
		System.out.println("student name " + this.name);
		System.out.println("student address " + this.address);
	}
	public static void main(String[] args) {				//start of main
		/*Student s1 =new Student(1,"vaibhav", "sai mauli");
		Student s2 = new Student(2, "raj", "dombiwili");
		Student s3 = new Student(3, "javed","gaon");
		Student s4 = new Student(4, "yash","thane");
		System.out.println(Student.count);
		*/
		Student[] s = new Student[4];						//creating student array obj
			s[0]=new Student(1,"vaibhav", "sai mauli");		
			s[1]=new Student(2, "raj", "dombiwili");
			s[2]=new Student(3, "javed","gaon");
			s[3]=new Student(4, "yash","thane");			
		System.out.println(Student.count);					//display no of obj in heap
	}														//end of main
}															//end of class
