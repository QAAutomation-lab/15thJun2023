package Day8Methods;

public class Example7 {

	public static void main(String[] args) {
		
		Example7 e1=new Example7();
		//way1: you won;t be able to get its return value
		//e1.getInterest(150000, 5, 6.5f);
		
		//way2: you won;t be able to use its return value
		//System.out.println(e1.getInterest(150000, 5, 6.5f));
		
		//way3: you will be able to get its return value and that can be used in future
		double interestAmount=e1.getInterest(150000, 5, 6.5f);
		double finalAmount=150000+interestAmount;
		System.out.println("Final Amount is: "+finalAmount);	
		
		e1.displayDetails();
		
		//System.out.println(e1.displayDetails());//error at compile time
	}	
	double getInterest(int amount,int noy,float roi) {
		//res=(p*r*t)/100
		System.out.println("Priciple amount is: "+amount);
		System.out.println("Number of years is: "+noy);
		System.out.println("ROI is: "+roi);
		double res=(amount*noy*roi)/100;
		return res;
	}	
	void displayDetails() {
		System.out.println("I am shailesh");
		System.out.println("Staying in pune");
		System.out.println("Native is UP");
	}
}
