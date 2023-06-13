package day08.exam;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		lcm(sc.nextInt(), sc.nextInt());
		
		sc.close();
	}
	
	public static void lcm(int num1, int num2) {
		int max = 0, min = 0;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else if (num2 > num1) {
			max = num2;
			min = num1;
		}
		
		for (int i = min; i <= num1*num2; i += min) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				break;
			}			
		}
		
	}
}
