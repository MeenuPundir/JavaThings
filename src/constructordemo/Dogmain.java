package constructordemo;

public class Dogmain {
	public static void main(String[] args) {
		Dog dd = new Dog();
		dd.bark();
		dd.eat();
		dd.sleep();
		System.out.println("______________");
		Dog dg = new Dog("pit bull");
		dg.bark();
		dg.eat();
		dg.sleep();

	}

}
