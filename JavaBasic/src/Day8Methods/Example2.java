package Day8Methods;

public class Example2 {

	public static void main(String[] args) {
		addTwoNumbers(25,35);
		addTwoNumbers(10,20);
		Example2.addTwoNumbers(65,45);
		Example2.addTwoNumbers(25,95);
		Example2.addTwoNumbers(58,41);
	}
	static void addTwoNumbers(int num1,int num2) {//int num1=25,int num2=35
		int res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
	/*
	 * Adv: no need write same code again and again and you will be able to use any number for addition
	 */

}
