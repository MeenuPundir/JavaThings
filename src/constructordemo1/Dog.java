package constructordemo1;

public class Dog {

	// default 
	// non paramterized
	// paramterized
	
	
	// Constructor have same name as of the class name
	// Constructor do not have any type
	// Constructor can not be called it is initialized automatically at the time of
	// object creation

	public void run() {
		System.out.println("This dog can run");
	}

	public void bark() {
		System.out.println("This dog can bark");
	}

	public void eat() {
		System.out.println("This dog can eat");
	}

	public void sleep() {
		System.out.println("This dog can sleep");
	}
	
	public  Dog() {
		System.out.println("This is a new Dog");
	}
	
	public Dog(String name) {
		System.out.println("The name of the dog is =:"+name);
	}
	
	

}
