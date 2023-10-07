package assignment;

public class NegativeNumberFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-8;//-8,-4,-2,-1,1,2,4,8
		for (int i = num; i <= Math.abs(num); ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}

}
