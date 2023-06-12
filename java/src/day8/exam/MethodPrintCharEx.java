package day8.exam;

import java.util.Scanner;

public class MethodPrintCharEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printString(sc.next().charAt(0), sc.nextInt());
		sc.close();
	}
	public static void printString(char a, int i) {
		for (int j=0; j < i; j++) {
			System.out.print(a);
		}
		System.out.println();
	}
}
