package day11.exam;

public class ArrayEx1 {

	public static void main(String[] args) {
		int min = 1, max = 9;
		
		int [] rand = new int[3];
		
		for (int i = 0; i < rand.length; i++) {
			int randNum = (int)(Math.random() * (max - min + 1) + min);
			rand[i] = randNum;
			for (int j = 0; j < rand.length; j++) {
				if(i == j) continue;
				while(rand[i] != randNum) {
					randNum = (int)(Math.random() * (max - min + 1) + min);
				}
				rand[i] = randNum;				
			}
			System.out.println(rand[i]);
		}			
		
	}
}
