package day8.exam;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		getGrade(sc.nextInt());
		sc.close();
	}
	public static void getGrade(int score) {
		if (score > 100 || score < 0) {
			System.out.println("Wrong score");
			return;
		}
		switch (score/10) {
		case 10, 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
			break;
		}
	}
}
