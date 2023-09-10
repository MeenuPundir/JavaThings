package exceptiondemo1;

import java.util.Scanner;

public class Vote {

	public void age() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You can vote");
		} else {

			// user defined exception
			throw new Exception("Under Age");

		}
		System.out.println("Compilation continue");

	}

}
