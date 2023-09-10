package loopdemo;

public class demo3 {

	public static void main(String[] args) {

		int fact = 1;

		int num = 5;
		// i=1 ., 5
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			// fact=1*1=1
			// fact=1*2=2
			// fact=2*3=6
			// fact=6*4=24
			// fact =24*5=120
		}
		System.out.println("The factorail of the nuber is=:" + fact);

	}

}
