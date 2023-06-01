package day3.exam;

import java.util.Scanner;

public class LogicalEx {

	public static void main(String[] args) {
		int a = 3, b = 4, c = 4;
		
		System.out.println(a==b && ++a==b);
		
		System.out.println(a==b & ++a==b);
		
		System.out.println(c==b && c==b);
		
		System.out.println(c==b & c==b);
		
	}
}
