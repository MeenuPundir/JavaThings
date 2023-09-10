package accessmodifires;

public class practise {

	//global
	public void publicmethod() {
		System.out.println("I am public method");
	}
   //package scope , outside the packahe using inheritence
	protected void protecmethod() {
		System.out.println("Protected method");
	}

	//class scope
	private void privatemethod() {
		System.out.println("Private method");
	}

	//package
	void defaultmethod() {
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		practise pp = new practise();
		pp.publicmethod();
		pp.privatemethod();
		pp.protecmethod();
		pp.defaultmethod();
	}

}
