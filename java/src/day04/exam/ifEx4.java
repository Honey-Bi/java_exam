package day04.exam;

import java.util.Scanner;

public class ifEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if (num % 6 == 0) System.out.println("multiple of 6");
		else if (num % 3 == 0) System.out.println("multiple of 3");
		else if (num % 2 == 0) System.out.println("multiple of 2");
		else System.out.println("not multiple of 2, 3, 6");
		
		sc.close();
	}
}
