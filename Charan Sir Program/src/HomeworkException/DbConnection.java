package HomeworkException;

import HideException.RestrictObjectCreation;

public class DbConnection {
	public static void main(String[] args) {
		RestrictObjectCreation obj1 = RestrictObjectCreation.getObject();
		System.out.println("once obj created");
		System.out.println(obj1);
		RestrictObjectCreation obj2 = RestrictObjectCreation.getObject();
		System.out.println("2nd  obj created");
		System.out.println(obj2);
	}
}


