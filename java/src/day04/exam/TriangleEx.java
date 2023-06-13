package day04.exam;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if (a > b && a > c) {
			if (a < b + c) System.out.println(true);
			else System.out.println(false);
		} else if (b > a && b > c) {
			if (b < a + c) System.out.println(true);
			else System.out.println(false);
		} else if (c > b && c > a) {
			if (c < a + b) System.out.println(true);
			else System.out.println(false);
		} else if (a == b && b == c) {
			System.out.println(true);
		} else System.out.println(false);
		
		
		sc.close();
	}
}
