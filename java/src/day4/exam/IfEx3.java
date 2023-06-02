package day4.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		System.out.println("두 정수와 산술연산자를 입력하세요.");
		System.out.println("예시 (1 + 2)");
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		char operator = ' ';
		try {
			a = scan.nextInt();
			operator = scan.next().charAt(0);
			b = scan.nextInt();	
		} catch (InputMismatchException e) {
			System.out.println("입력된 값이 정수가 아닙니다.");
		}
		
		switch (operator) {		
			case '+' -> System.out.println(a + b);
			case '-' -> System.out.println(a - b);
			case '*' -> System.out.println(a * b);
			case '/' -> System.out.println(a / (double)b);
			case '%' -> System.out.println(a % b);
			default -> System.out.println("정의되지않은 산술 연산자 입니다...");
		}
		
		scan.close();
	}
}
