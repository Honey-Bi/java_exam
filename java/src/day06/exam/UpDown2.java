package day06.exam;

import java.util.Scanner;

public class UpDown2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;

		do {
			int random = (int)(Math.random() * (100 - 1 + 1) + 1);
			while (i != random) {
				i = sc.nextInt();
				
				if (i > random) {
					System.out.println("Down");
				} else if(i < random) {
					System.out.println("Up");
				}
			} 
			System.out.println("Good");
			
		} while (sc.next().charAt(0) == 'y') ;
		
		
		sc.close();		
	}
}
