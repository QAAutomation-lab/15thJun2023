package assignment;

public class PyramidProgram {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {//number of line in pyramid
			for(int j=1;j<=5-i;j++) {//space manage
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {//design for pyramid
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
