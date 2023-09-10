package abstractdemo;

public class mainclass {

	public static void main(String[] args) {
		watercoolerimpl ww = new watercoolerimpl();
		ww.capcity();
		ww.modes();
		ww.price();

		System.out.println("************");

		bikeimpl bb = new bikeimpl();
		bb.color();
		bb.breaks();
		bb.speed();

	}

}
