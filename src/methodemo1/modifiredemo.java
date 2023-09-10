package methodemo1;

public class modifiredemo {

	// access modifires

	// GLobal
	public static void publicm() {
		System.out.println("Public method");
	}

	// class
	private static void privatem() {
		System.out.println("Private method");
	}

	// package scope , outside the package through inheritence
	protected static void protec() {
		System.out.println("Protected method");
	}

	// package scope
	static void defualtm() {
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		modifiredemo.publicm();
		modifiredemo.privatem();
		modifiredemo.protec();
		modifiredemo.defualtm();
	}

}
