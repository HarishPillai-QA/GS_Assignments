package assignment;

public class Assignment3_Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=101;
		int original=num;
		int count=0;
		int reverse=0;
		for(;num>0;)
		{
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
		System.out.println("Reverse:"+reverse);
		if(original==reverse)
			System.out.println("It's a Pallindrome");
		else
			System.out.println("not a pallindrome");
		System.out.println("Number of digits"+count);

	}

}
