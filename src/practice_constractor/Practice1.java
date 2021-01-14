package practice_constractor;

public class Practice1 {

	Practice1(int a) {
		System.out.println("My first constractor");

	}

	Practice1(double b, int a) {
		System.out.println("My second constractor");

	}

	Practice1(char c, double b, int a) {
		System.out.println("My third constractor");

	}

	Practice1(char c, double b) {
		System.out.println("My fourth constractor");

	}

	Practice1(double b) {
		System.out.println("My fifth constractor");

	}

	Practice1(String d) {
		System.out.println("My sixth constractor");

	}

	public static void main(String[] args) {
		new Practice1(1);
		new Practice1(01.0, 1);
		new Practice1('M', 01.0, 1);
		new Practice1('M', 01.0);
		new Practice1(01.0);
		new Practice1("shadman");

	}

}
