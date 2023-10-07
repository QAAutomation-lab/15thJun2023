package day11Operators;

public class Operators {

	public static void main(String[] args) {
		int num1=57,num2=5,res;
		res=num1+num2;
		System.out.println("After Addition result is: "+res);
		res=num1-num2;
		System.out.println("After Substraction result is: "+res);
		res=num1*num2;
		System.out.println("After multipication result is: "+res);
		res=num1/num2;
		System.out.println("After division result is: "+res);
		res=num1%num2;
		System.out.println("After mod result is: "+res);
		
		System.out.println("********************************************");
		int n1=101,n2=101;
		boolean result=(n1==n2);
		System.out.println("Result :"+result);
		System.out.println((n1==n2));//t
		System.out.println((n1!=n2));//f
		System.out.println((n1>n2));//f
		System.out.println((n1<n2));//f
		System.out.println((n1>=n2));//t
		System.out.println((n1<=n2));//t
		
	}

}
