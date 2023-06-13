package day05.exam;

import java.util.Scanner;

public class WhileEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1;
		while (i++ <= num) {
			if(num % i == 0) {
				System.out.print(i + ", ");
			}
		}
		
		sc.close();
	}
}
