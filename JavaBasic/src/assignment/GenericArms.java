package assignment;

public class GenericArms {

	public static void main(String[] args) {
		int num=1560,temp,ct = 0,rem=0;
		double sum=0;
		temp=num;
		while(temp>0) {//1634 | 163 | 16 | 1 | 0
			temp=temp/10;//163-->16-->1--->0
			ct++;//1 |2 |3 | 4 
		}
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, ct);
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println("Given number is armstrong number");
		}else {
			System.out.println("Given number is not armstrong number");
		}

	}

}
