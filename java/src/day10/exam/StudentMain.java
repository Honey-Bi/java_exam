package day10.exam;

public class StudentMain {

	public static void main(String[] args) {
		Student1 std1 = new Student1(1,1,1,"test");
		Student1 std2 = new Student1(1,1,2,"test");
	}
}

class Student1 {
	static int studentCount;
	private int grade, classNum, number;
	private String name;
	
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	public Student1() {
		this(1,1,1,"");
	}
}
