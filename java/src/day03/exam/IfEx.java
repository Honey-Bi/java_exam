package day03.exam;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String answer = "";
		if (num > 0 ) answer = "양수";
		else if (num == 0) answer = "0";
		else answer = "음수";
		System.out.println(answer);
		sc.close();
	}

}
