package arraylistdemo;

import java.util.ArrayList;

public class dmeo {

	public static void main(String[] args) {

		
		ArrayList<Integer> list= new ArrayList<>();
		list.add(3);
		list.add(15);
		list.add(66);
		list.add(18);
		list.add(17);
		list.add(95);
		list.remove(5);
		
	//	ArrayList<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(9);
		list.add(7);
		list.add(2);
		
		System.out.println("size of array list is :" +list.size());
		list.remove(1);
		System.out.println("Size of array list is :" +list.size());
		
	/*	

		// data type
		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(6);
		list.add(9);
		list.add(10);
		list.add(3);
		System.out.println(list);

		System.out.println("The size of the list is=:" + list.size());
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(10);
		list.add(3);
		System.out.println("____________________________");

		System.out.println("The size of the list is=:" + list.size());

		System.out.println(list);
		list.remove(9); //it will remove element of index 9

		list.remove(3); //it will remove element of index 3
		System.out.println("____________________________");

		System.out.println(list);
		System.out.println("____________________________");

		System.out.println("The size of the list is=:" + list.size());
		*/

		for (Integer vl : list) {
			System.out.println(vl);
		}

	}

}
