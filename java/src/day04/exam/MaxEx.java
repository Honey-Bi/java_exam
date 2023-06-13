package day04.exam;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(), num2 = sc.nextInt();
		if(num < num2) System.out.println(num2);
		else if (num > num2) System.out.println(num);
		else System.out.println("equal");
		
		sc.close();
	}		
}
