package day06.exam;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int even_sum = 0, i = 0, num = sc.nextInt();
		
		while (++i <= num) {
			even_sum += ++i;
			System.out.println(i);
		}
		System.out.println(even_sum);
		
		
		sc.close();
	}
}
