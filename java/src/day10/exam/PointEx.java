package day10.exam;

public class PointEx {

	public static void main(String[] args) {	
		
	}

}

class point {
	int x, y;

	public void setWhere(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void getWhere(int x, int y) {
		this.setWhere(x, y);
	}

	public void getWhere() {
		System.out.println(x);
		System.out.println(y);
	}
}
