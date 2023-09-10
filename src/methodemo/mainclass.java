package methodemo;

public class mainclass {

	public static void main(String[] args) {

		Car cc = new Car();
		cc.speed();
		cc.airbag();
		cc.breaks();

		System.out.println("________________________");

		Supercar sc = new Supercar();
		sc.headlights();
		sc.tyres();
		sc.speed();
		sc.breaks();
		sc.airbag();

	}

}
