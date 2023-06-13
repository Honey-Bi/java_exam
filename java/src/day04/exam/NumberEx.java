package day04.exam;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if (num % 2 == 0) num = num / 2;
		else num++;
		System.out.println(num);
		
		sc.close();

	}
}
