package day8.exam;

public class MethodCallStack {

	public static void main(String[] args) {
		method1(3);
	}
	
	public static void method1 (int a) {
		System.out.println(a);
		method2(a);
	}
	public static void method2 (int a) {
		System.out.println(a-1);
		method3();
		
	}
	public static void method3 () {
		System.out.println("end");
	}

}
