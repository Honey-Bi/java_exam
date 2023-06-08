package day7.exam;

public class ArithmeticMethodEx {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sub(1,2));
		System.out.println(mul(2,3));
		System.out.println(div(3,2));
		System.out.println(mod(4,2));
		
	}
	
	public static int sum(int i, int j) {
		return i + j;
	}
	
	public static int sub(int i, int j) {
		return i - j;
	}
	public static int mul(int i, int j) {
		return i * j;
	}
	public static double div(int i, int j) {
		return (double)i / (double)j;
	}
	public static int mod(int i, int j) {
		return i % j;
	}

}
