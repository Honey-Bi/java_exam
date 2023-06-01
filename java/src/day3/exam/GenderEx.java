package day3.exam;

import java.util.Scanner;

public class GenderEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your Gender?");
		
		String gender = sc.next();
		
		if (gender.equals("M")||gender.equals("m")) System.out.println("Man");
		else if(gender.equals("W")||gender.equals("w")) System.out.println("Woman");
		
		System.out.println("Are you Woman? : " + (gender.equals("W")||gender.equals("w") ? true : false));
		
		sc.close();
	}

}
