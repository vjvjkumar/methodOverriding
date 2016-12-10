package Pack1;

public class ChildCarsMaruthiAlto extends ParentCars{
	
	public static void main(String[] args) {
		//creating the object on child class with the reference of Parent class.
		//using this if methods are different with child class then it'll call from the child.
		//using parent(obj) object we can call methods and variables from both parent and child classes.
		ParentCars parent=new ChildCarsMaruthiAlto();		
		parent.enginesize(50);
		parent.wheels();
		parent.type();
		
	}
	
	//Super we can use without creating the object we can call all the methods and variables from parent
	//Super we can call in overrider and constructor methods only, we can't call in main method.
	@Override
	public void enginesize(int size){
		System.out.println(super.a);
		super.wheels();
		System.out.println("I am coming from child class:"+size);
	}
	
	public static void type(){		
		System.out.println("this is from child static method");
	}
	

}
