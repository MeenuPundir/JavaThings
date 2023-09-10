package Assigment;

import accessmodifires.practise;

public class demo extends practise {

	public static void main(String[] args) {

		practise ps = new practise();
		ps.publicmethod();
		System.out.println("___________");

		demo dd = new demo();
		dd.publicmethod();
		dd.protecmethod();

	}

}
