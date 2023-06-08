package day7.exam;

public class PrintAlphabetEx {
	
	public static void main(String[] args) {
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		for(char i = 'a'; i <= 'z'; i++) {
			for(char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
