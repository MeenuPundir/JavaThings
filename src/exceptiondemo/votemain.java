package exceptiondemo;

public class votemain {

	public static void main(String[] args) {

		try {
			voting.vote();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
