package assignment;

public class Factore {

	public static void main(String[] args) {

		int num = 15;
		printFactors(num);
		printFactors(17);
	}

	static void printFactors(int num) {
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.println("Given number factore is: " + i);
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); i++) {
				if (i != 0) {
					if (num % i == 0) {
						System.out.println("Given number factore is: " + i);
					}
				}
			}
		}
	}
}
