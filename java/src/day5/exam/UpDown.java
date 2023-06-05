package day5.exam;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random() * (100 - 1 + 1) + 1);
		int i = 0;
		while (i != random) {
			i = sc.nextInt();
			
			if (i > random) {
				System.out.println("Down");
			} else if(i < random) {
				System.out.println("Up");
			}
		}
		System.out.println("Good");
		sc.close();		
	}

}
