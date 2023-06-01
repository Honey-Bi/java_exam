package day3.exam;

public class EqualsEx {

	public static void main(String[] args) {
		String s1 = "apple";
        String s2 = new String("apple");
		
        System.out.println("==: " + (s1 == s2)); 
        System.out.println("equals: " + s1.equals(s2));
	}

}
