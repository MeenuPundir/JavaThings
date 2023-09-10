package constructordemo;

public class Dog {

	//no need to write void here because constructor do not return value it is constructor's property.
	//thats why no need to mention it.
	public Dog() {
		System.out.println("I am a indian dog");
	}

	public Dog(String breed) {
		System.out.println("I am a dog of bredd=:" + breed);
	}

	public void bark() {
		System.out.println("Dog is going to bark");
	}

	public void eat() {
		System.out.println("Dog is going to eat");
	}

	public void sleep() {
		System.out.println("Dog is going to sleep");
	}

}
