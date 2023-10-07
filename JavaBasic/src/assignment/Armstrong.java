package assignment;

public class Armstrong {

	public static void main(String[] args) {

		int num=153,temp,rem=0;
		double sum = 0;
		temp=num;
		while(temp>0) {//153>0 | 15>0 | 1>0 |0>0 no
			rem=temp%10;//153%10=3 | 15%10=5 | 1%10=1
			sum= sum+rem*rem*rem;//0+3*3*3=27 |27+5*5*5=152 | 152+1
			temp= temp/10;//153/10=15 | 15/10=1 | 1/10=0
		}
		if(num==sum) {
			System.out.println("Given number is armstrong number");
		}else {
			System.out.println("Given number is not armstrong number");
		}	
		
		//System.out.println(test(1634));
	}
	
	static boolean test(int num) {
		System.out.println("checking number is armstrong or not: "+num);
		int temp,ct = 0,rem=0;
		double sum=0;
		temp=num;
		while(temp>0) {//1634
			temp=temp/10;//163-->16-->1--->0
			ct++;
		}
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, ct);
			temp=temp/10;
		}
		if(sum==num) {
			return true;
		}else {
			return false;
		}		
	}
	static boolean isArmStrong(int num) {
		
		int temp,rem=0;
		double sum = 0;
		temp=num;
		while(temp>0) {//123= 1 + 8+ 27=36 ; 153= 1+125+37=153
			rem=temp%10;//3--->12%10=2 -->1%10=1
			sum= sum+rem*rem*rem;//0+3^3=27--->27+2*2*2=35--> 35+1*1*1=36
			temp= temp/10;//123/10--->12--->12/10=1
		}
		if(num==sum) {
			return true;
		}else {
			return false;
		}		
	}

}
