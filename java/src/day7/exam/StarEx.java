package day7.exam;

import java.util.Iterator;

public class StarEx {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

//		*****
//		*****
//		*****
//		*****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j <= i + i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		
		for (int i = 0; i < 7; i++) {
			if (i <= 7/2) {
				for (int j = 1; j <= 3-i; j++) {
					System.out.print(' ');
				}
				for(int j = 0; j <= i+i; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = i; j > 7-i; j--) {
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
		
//	        *
//	       ***
//	      *****
//	     *******
//	      *****
//		   ***
//          * 
		
		
		 
		
	}
}
