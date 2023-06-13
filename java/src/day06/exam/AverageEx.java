package day06.exam;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("input 3 score : ");
		int korean = 0, english = 0, math = 0;
		
		System.out.println("input 3 score : ");
		
		korean = sc.nextInt();
		english = sc.nextInt();
		math = sc.nextInt();
		System.out.println((double)((korean + english + math) / 3));
		
		System.out.println("continue? (y/n) : ");
		
		char if_exit = sc.next().charAt(0);
		while (if_exit != 'n' && if_exit == 'y' ) {
			System.out.println("input 3 score : ");
			korean = sc.nextInt();
			english = sc.nextInt();
			math = sc.nextInt();
			System.out.println((double)((korean + english + math) / 3));
			
			
			System.out.println("continue? (y/n) : ");
			if_exit = sc.next().charAt(0);
		}
		
		System.out.println("exit");
		
		sc.close();
	}

}
