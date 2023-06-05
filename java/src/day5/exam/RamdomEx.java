package day5.exam;

public class RamdomEx {

	public static void main(String[] args) {
		
		int min = 1, max = 10;
		int random = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(random);
		
	}
}
