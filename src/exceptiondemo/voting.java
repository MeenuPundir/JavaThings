package exceptiondemo;

import java.util.Scanner;

public class voting {

	public static void vote() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your pin");

		int pin = sc.nextInt();
		
		System.out.println("Username");
		String username=sc.next();

		if (pin == 18 && username.equals("")) {
			System.out.println("You are welcome");
		} else {
			throw new Exception("Incorrect username or password");
		}

	}

}
