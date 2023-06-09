package day8.exam;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(even(sc.nextInt()));
		sc.close();
	}
	
	public static boolean even(int num) {
		return (num%2 == 0);
	}
}
