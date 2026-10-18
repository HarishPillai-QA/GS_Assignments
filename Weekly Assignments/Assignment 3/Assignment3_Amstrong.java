package assignment;

public class Assignment3_Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int amstrong=0;
		int originalNum=num;
		for(;num>0;)
		{
			int lastDigit=num%10;
			amstrong=amstrong+lastDigit*lastDigit*lastDigit;
			num=num/10;
		}
		System.out.println(amstrong);
		if(originalNum==amstrong)
			System.out.println("it is armstong number");
		else
			System.out.println("it is not armstrong number");
			
			

	}

}
