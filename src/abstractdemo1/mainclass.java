package abstractdemo1;

public class mainclass {

	public static void main(String[] args) {

		Car cc = new Carimpl();

		cc.breaks();
		cc.engine();
		cc.gear();
		cc.price();

		System.out.println("_________________");

		Supercar sc = new supercarimpl();
		sc.wheels();
		sc.speed();
		// sc.sound();

		System.out.println("___________________");

		sportscar sp = new supercarimpl();
		sp.sound();
		sp.staring();

		System.out.println("________________");

		supercarimpl sd = new supercarimpl();
		sd.speed();
		sd.sound();
		sd.staring();
		sd.wheels();

		System.out.println("_____________________");

		Carimpl cf = new Carimpl();
		cf.speed();
		cf.sound();
		cf.breaks();
		cf.gear();
		cf.staring();
		cf.engine();
		cf.price();

	}

}
