package inheitencedemo;

public class mainclass {
	public static void main(String[] args) {

		// ctrl+a
		// ctrl+shift+f
		// ctrl+s
		Parent pp = new Parent();

		pp.eat();
		pp.sleep();

		System.out.println("_______________");

		Child cc = new Child();
		cc.eat();
		cc.sleep();
		cc.play();
		cc.drink();
		System.out.println("________________");
		Grandchild gg = new Grandchild();
		gg.play();
		gg.drink();
		gg.eat();
		gg.sleep();
		gg.cry();
		gg.height();

	}
}
