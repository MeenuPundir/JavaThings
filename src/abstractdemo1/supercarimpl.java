package abstractdemo1;

public class supercarimpl implements Supercar, sportscar {

	@Override
	public void speed() {
		System.out.println("The speed of the super car is 500km/h");

	}

	@Override
	public void wheels() {
		System.out.println("The wheels of the super car is alloy");

	}

	@Override
	public void sound() {
		System.out.println("The sound of the sports car is 80 hz");
	}

	@Override
	public void staring() {
		System.out.println("The starung of the sports car is flexible");

	}

}
