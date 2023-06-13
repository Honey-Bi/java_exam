package day06.exam;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.print("Select Menu: ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Start");
				break;
			case 2:
				System.out.println("Save");
				break;
			case 3:
				System.out.println("Exit");
				break;
			}
		} while (menu != 3);
		
		sc.close();

	}

}
