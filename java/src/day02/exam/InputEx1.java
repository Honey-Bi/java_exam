package day02.exam;

import java.util.Scanner;

public class InputEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b; char c;
		System.out.println("두 정수와 산술연산자를 입력하세요");
		a = scan.nextInt();
		c = scan.next().charAt(0);
		b = scan.nextInt();
		System.out.println(a + " " + c + " " + b);		
		scan.close();
	}
}
