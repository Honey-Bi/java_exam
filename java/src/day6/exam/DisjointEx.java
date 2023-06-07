package day6.exam;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int max = 0, min = 0;
		
		
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else if (num2 > num1) {
			max = num2;
			min = num1;
		}

		
		int i = 0, num = 1;
		while(++i <= min) {
			if(min % i == 0 && max % i == 0) {
				 num = i;
			}
		}
		
		if (num == 1) {
			System.out.println("disjoint");			
		} else {
			System.out.println("not disjoint");
		}
		
		sc.close();
		
		sc.close();
	}
}
