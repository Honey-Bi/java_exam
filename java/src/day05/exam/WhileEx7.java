package day05.exam;

import java.util.Scanner;

public class WhileEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1, count = 0;
		while (++i <= num) {
			if (num % i == 0) {
				count++;
			} 
		}
		
		if(count == 1) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		
		sc.close();
	}
}
