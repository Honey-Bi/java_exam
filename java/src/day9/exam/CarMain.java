package day9.exam;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car("new abante", "hyundai", 2023);
		c.printInfo();
		
		c.speedChange(true);
		System.out.println();
		c.printInfo();
	}

}

class Car {
	private String name;
	private String company;
	private int year;
	private int speed;
	private char gear;
	private boolean power;
	
	public Car(String name, String company, int year) {
		this.name = name;
		this.company = company;
		this.year = year;
		gear = 'P';
	}
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("company: " + company);
		System.out.println("year: " + year);
		System.out.println("speed: " + speed);
		System.out.println("gear: " + gear);
		System.out.println("power: " + power);
	}
	
	public void speedChange(boolean positive) {
		if (!this.power || this.gear == 'N' || this.gear == 'P') return;
		if (positive) this.speed++;			
		else if (this.speed > 0) this.speed--;
	}
	
	public void powerChange() {
		if(!this.power) this.power = true;
		else if (this.gear == 'P') this.power = false;
	}

	public void setGear(char gear) {
		switch (gear) {
		case 'P', 'N', 'B':
			this.gear = gear;
			break;
		default:
			System.out.println("입력가능한 기어가 아닙니다.");
			break;
		}
	}
	
}