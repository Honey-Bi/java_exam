package day5.exam;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
			case 3, 4, 5:
				System.out.println("Spring");
				break;
			case 6, 7, 8:
				System.out.println("Summer");
				break;
			case 9, 10, 11:
				System.out.println("Autum");
				break;
			case 12, 1, 2:
				System.out.println("Winter");
				break;
			default:
				System.out.println("Not a Month");
		}
		
		sc.close();

	}
}
