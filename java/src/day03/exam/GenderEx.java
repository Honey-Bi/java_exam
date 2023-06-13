package day03.exam;

import java.util.Scanner;

public class GenderEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your Gender?");
		
		char gender = sc.next().charAt(0);
		
		if (gender == 'M'|| gender =='m') System.out.println("Man");
		else if(gender == 'W'|| gender =='W') System.out.println("Woman");
		
		System.out.println("Are you Woman? : " + (gender == 'W'|| gender =='w' ? true : false));
		
		sc.close();
	}

}
