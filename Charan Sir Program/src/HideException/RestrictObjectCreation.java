package HideException;

public class RestrictObjectCreation {
	private static RestrictObjectCreation obj;
	public static int count=0,no=1;
	private RestrictObjectCreation() {
		count++;
	}
	public static RestrictObjectCreation getObject() {
		if(count>no) {
			throw new MoreThan1Obj("trying to create more than 1 obj...not allowed");
		} 
		obj =new RestrictObjectCreation();
		
		return obj;
	}
}
