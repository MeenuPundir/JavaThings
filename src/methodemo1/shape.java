package methodemo1;

import java.util.Scanner;

public class shape {

	public static void rectangle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Length=:");
		int length = sc.nextInt();

		System.out.println("Breadth=:");
		int breadth = sc.nextInt();

		int area = length * breadth;
		System.out.println("The area of the rectangle is=:" + area);

	}

	public static void sqaure() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Side=:");
		int side = sc.nextInt();

		int area = side * side;
		System.out.println("The area of the sqaure is=:" + area);
	}

	public static void circle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius=:");
		float r = sc.nextFloat();
		double area = 3.14 * r * r;
		System.out.println("The area of the circle =:" + area);

	}

	public static void main(String[] args) {

		shape.circle();
		System.out.println("_________________");
		shape.rectangle();
		System.out.println("_________________");
		shape.sqaure();
	}

}
