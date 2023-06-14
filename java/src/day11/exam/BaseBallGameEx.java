package day11.exam;

import java.util.Scanner;

public class BaseBallGameEx {

	public static void main(String[] args) {
		int min = 1, max = 9;
		
		int [] rand = new int[3];
		
		for (int i = 0; i < rand.length; i++) {
			int randNum = (int)(Math.random() * (max - min + 1) + min);
			rand[i] = randNum;
			for (int j = 0; j < rand.length; j++) {
				if(i == j) continue;
				while(rand[i] != randNum) {
					randNum = (int)(Math.random() * (max - min + 1) + min);
				}
				rand[i] = randNum;				
			}
			System.out.println(rand[i]);
		}	
		
		Scanner sc = new Scanner(System.in);
		sc.close();
		while (true) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			
			for (int i = 0; i < rand.length; i++) {
				continue;
			}
			return;
		}

	}
	
	public static boolean confirm(int i, int j) {
		
		return true;
	}
}
