package day6.exam;

public class ForPrime {

	public static void main(String[] args) {		
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if(i % j == 0) {			
					count++;
				}
			}
			if(count == 1) System.out.println(i);
		}
		
	}
}
