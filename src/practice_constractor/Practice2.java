package practice_constractor;

public class Practice2 {
	Practice2() {

	}

	Practice2(int a) {
		System.out.println("My first constractor");

	}

	Practice2(double b, int a) {
		System.out.println("My second constractor");

	}

	Practice2(char c, double b, int a) {
		System.out.println("My third constractor");

	}

	Practice2(char c, double b) {
		System.out.println("My fourth constractor");

	}

	Practice2(double b) {
		System.out.println("My fifth constractor");

	}

	Practice2(String d) {
		System.out.println("My sixth constractor");

	}

	public static void main(String[] args) {
		new Practice2(1);
		new Practice2(01.0, 1);
		new Practice2('M', 01.0, 1);
		new Practice2('M', 01.0);
		new Practice2(01.0);
		new Practice2("shadman");

	}

}
