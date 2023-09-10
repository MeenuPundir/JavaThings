package constructordemo1;

public class Dogmain {

	public static void main(String[] args) {

		Dog dd = new Dog();
		dd.bark();
		dd.eat();
		dd.sleep();
		dd.run();
//		
		System.out.println("___________");
		Dog dg = new Dog("Tommy");
		dg.eat();
		dg.sleep();
		dg.bark();
		dg.run();
		
		System.out.println("_________");
		
		
	}

}
