package Pack1;
/***
 * Rules
 * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method cannot be more 	restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the 	class
 */
public class ParentCars {
	public int a=12;
	public static void type(){
		System.out.println("this method is static from parent");
	}
	public void enginesize(int size){
		
		System.out.println("I am coming from parent: 10cc");
	}
	
	public void wheels(){
		System.out.println("I am coming from parent : 4 wheels");
	}
	
	

}
