package day8.exam;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt(), j = sc.nextInt();
		char op = sc.next().charAt(0);
		
		op(i, j, op);
		
		sc.close();
	}
	
	public static void op(int num1, int num2, char op) {
		switch (op) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '/':
			System.out.println((double)num1 / (double)num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		}
	}
}
