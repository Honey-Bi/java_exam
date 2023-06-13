package day03.exam;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input score : ");
		int score = sc.nextInt();
		System.out.println((score >= 60) ? "pass" : "fail");
		sc.close();
	}

}
