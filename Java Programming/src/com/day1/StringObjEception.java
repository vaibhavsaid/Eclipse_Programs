package com.day1;

public class StringObjEception extends IndexOutOfBoundsException{
	String s1;
	StringObjEception(){				//default constructor should write...explanation sir will teach in future
		
	}
	StringObjEception(String s1){
		super(s1);
	}
	void mone(String s1) {
		if(s1=="book") {
			this.s1=s1;
		}
		else {
			throw new StringObjEception("invlaid book");
		}
	}
}
