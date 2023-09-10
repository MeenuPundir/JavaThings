package interfacedemo1;

public class acimpl implements windowac ,splitac{

	@Override
	public void load() {
		System.out.println("The load of the ac is 2 ton");

	}

	@Override
	public void capacity() {
		System.out.println("Full room");

	}

	@Override
	public void color() {
		System.out.println("White");

	}

	@Override
	public void price() {
		System.out.println("The price of the ac is 700000");
		
	}

	@Override
	public void indoor() {
		System.out.println("The ac is going to be inside");
		
	}

	@Override
	public void space() {
		System.out.println("This ac is going to occupy few space");
		
	}

}
