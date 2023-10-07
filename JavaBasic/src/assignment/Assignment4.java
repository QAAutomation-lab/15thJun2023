package assignment;

public class Assignment4 {

	public static void main(String[] args) {
		
		int num1=5, num2=27,r,q;
		q=num2/num1;
		r=num2%num1;
		System.out.println(q);
		System.out.println(r);
		
		//swapping two number
		int num3=25,num4=50,temp;
		System.out.println("Num1: "+num3);
		System.out.println("Num2: "+num4);
//		temp=num3;
//		num3=num4;
//		num4=temp;
		
		num3=num3+num4;//75
		num4=num3-num4;//25
		num3=num3-num4;//50
		System.out.println("Num1: "+num3);
		System.out.println("Num2: "+num4);
		
		
	}
}
