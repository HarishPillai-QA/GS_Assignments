package assignment;

public class Assignment3_Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=54321;
		int originalNum=num;
		int reverse=0;
		for(;num>0;)
		{
			int remainder=num%10;
			reverse=reverse*10 + remainder;
			num=num/10;
			
		}
		System.out.println("Original Number:" +originalNum);
		System.out.println("Reverse Number:" +reverse);

	}

}