package day5.exam;

import java.util.Scanner;

public class WhileEX5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int select = 0;
		
		while (select != 3) {
			System.out.println("Menu");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			
			select = sc.nextInt();
			switch (select) {
				case 1: 
					System.out.println("Program Start");
					break;
				case 2:
					System.out.println("Program Save");
					break;
				case 3: break;
				default:
					System.out.println("Choose 1, 2, 3");
			}
		}
		System.out.println("Program Exit");
		
		sc.close();
	}
}
