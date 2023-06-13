package day03.exam;

import java.util.Scanner;

public class ifEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println((num%2 == 1) ? "odd" : "even" );
		
		sc.close();
	}

}
