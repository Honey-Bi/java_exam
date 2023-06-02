package day4.exam;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		if (sc.nextInt() >= 20) System.out.println("adult");
		else System.out.println("minor");
		
		
		sc.close();
	}

}
