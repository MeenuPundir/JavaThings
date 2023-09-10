package arraydemo;



public class demo1 {

	public static void main(String[] args) {

		String name[] = { "Adul", "Naveen", "Shivam", "Saurav", "Arvind" };

		for (String str : name) {
			System.out.println(str);
		}
		System.out.println("____________________");

		boolean values[] = { true, false, true, true, false, false, true };
		for (boolean cond : values) {
			System.out.println(cond);
		}

	}

}
