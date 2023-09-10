package interfacedemo;

public class phoneimp implements phone, smartphone {

	@Override
	public void ram() {
		System.out.println("ram=16");

	}

	@Override
	public void rom() {
		System.out.println("rom=32");

	}

	@Override
	public void camera() {

		System.out.println("64 mp");

	}

	@Override
	public void battrey() {
		System.out.println("4000 mah");

	}

}
