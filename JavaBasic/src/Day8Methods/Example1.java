package Day8Methods;

public class Example1 {

	public static void main(String[] args) {
		addTwoNumbers();
		addTwoNumbers();
		addTwoNumbers();
		addTwoNumbers();
		addTwoNumbers();
	}
	static void addTwoNumbers() {
		int num1=25,num2=35;
		int res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
	/*
	 * Adv: no need write same code again and again
	 * DisAdv: you won;t be able to change the value of variables
	 */

}
