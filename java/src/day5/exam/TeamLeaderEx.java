package day5.exam;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch (num = num % 3) {
			case 0:
				System.out.println("leader");
				break;
			default:
				System.out.println("not leader");
		}
		
		sc.close();

	}
}
