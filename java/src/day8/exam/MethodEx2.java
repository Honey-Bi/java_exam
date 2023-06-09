package day8.exam;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = isMul(sc.nextInt());
		
		if (num == 0) {
			System.out.println("not 2, 3, 6 mul");
		} else {
			System.out.println(num + "'s mul");
		}
	}
	
	public static int isMul(int num) {
		if(num % 6 == 0) return 6;
		else if (num % 3 == 0) return 3;
		else if (num % 2 == 0) return 2;
		return 0;
	}
}
