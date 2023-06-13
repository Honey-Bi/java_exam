package day04.exam;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean = sc.nextInt(), english = sc.nextInt(), math = sc.nextInt();
		
		System.out.println((double)((korean + english + math) / 3));	
		
		sc.close();
	}

}
