package day5.exam;

public class WhileEx4 {

	public static void main(String[] args) {
		int i = 0;
		while (++i <=10) {
			System.out.print((i%2 == 0) ? i + "\n" : "");
		}
	}

}
