package java_hotel_project.driver;

import java.util.Scanner;

import java_hotel_project.Zomato;

public class ZomatoDriver {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("choose the option");
			System.out.println("1.login as  admin  2.log in as Customer 3.EXIT");
			try {
				int a = Integer.parseInt(sc.nextLine());
				if (a == 1) {
					Zomato.admin();
				}
				if (a == 2) {
					Zomato.customer();

				}
				if (a == 3) {
					System.err.println("Exit from the Application");
					System.exit(0);
				}
				if (a == 0)
					return;
			} catch (Exception e) {

				System.out.println("please choose the correct option");
			}

		} while (true);

	}

}
