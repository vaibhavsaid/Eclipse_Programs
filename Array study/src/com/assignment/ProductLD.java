package com.assignment;

public class ProductLD {									//starting of class
	String id,name;float price;								//declaring nonstatic global varaible
	ProductLD(String id, String name, float price){			//parameterize cons
		this.id=id;											//intilize variables in obj
		this.name=name;
		this.price=price;
	}
	static void swap(ProductLD laptop,ProductLD desktop) {		//swap method implementation
		float temp;												//temp variable
		temp=laptop.price;
		desktop.price=temp;
		desktop.price=desktop.price;
	}
	
	public static void main(String[] args) {						//starting of main
		ProductLD laptop = new ProductLD("1","sony",8500);			//creating obj and passing valies using cont
		ProductLD desktop= new ProductLD("2","sony",35000);
		swap(laptop,desktop);										//calling swap methof
	}																//end of main
}																	//end of class
