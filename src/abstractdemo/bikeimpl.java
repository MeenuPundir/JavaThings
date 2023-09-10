package abstractdemo;

public class bikeimpl implements bike {

	@Override
	public void speed() {
		System.out.println("300 km/h");
	}

	@Override
	public void color() {
		System.out.println("red");

	}

	@Override
	public void breaks() {
		System.out.println("disc breaks");

	}

}
