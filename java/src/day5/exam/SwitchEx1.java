package day5.exam;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()%2) {
			case 1:
				System.out.println("even");
				break;
			default:
				System.out.println("odd");
		}
		
		sc.close();

	}

}
