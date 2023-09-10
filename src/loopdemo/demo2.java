package loopdemo;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");
		int num = sc.nextInt();// num=12

		int sum = 0;

		// i=1 i<=12
		for (int i = 1; i <= num; i++) {

			sum = sum + i;
			// sum=0+1=1
			// sum=1+2=3
			// sum=3+3=6
			// sum=6+4=10

		}

		System.out.println("The sum of the num are=:" + sum);
	}

}
