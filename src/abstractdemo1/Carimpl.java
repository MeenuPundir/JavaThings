package abstractdemo1;

public class Carimpl extends Car implements Supercar, sportscar {

	@Override
	public void engine() {
		System.out.println("This car has 9000cc engine");

	}

	@Override
	public void breaks() {
		System.out.println("This car has disc breaks");

	}

	@Override
	public void gear() {
		System.out.println("This car has good gears");

	}

	@Override
	public void speed() {
		System.out.println("The speed of the car is 8000km/h");
	}

	@Override
	public void wheels() {
		System.out.println("The wheels of the car is alloys 9");

	}

	@Override
	public void sound() {
		System.out.println("The sound of the car is 9000hz");

	}

	@Override
	public void staring() {
		System.out.println("The staring of the car is very flexible");

	}

}
