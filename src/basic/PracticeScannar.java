package basic;

import java.util.Scanner;

public class PracticeScannar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in is used for using console

		System.out.println("What is yourname?");
		String name = scan.next();

		System.out.println("What is your name?");
		int age = scan.nextInt();

		System.out.println("What do you pan to do today?");
		String dayPlan = scan.next();

		System.out.println("Hi there my name is :" + name + " I'm " + age + "years old");
		System.out.println("and my plan is today to go :" + dayPlan);

		scan.close();

	}

}
