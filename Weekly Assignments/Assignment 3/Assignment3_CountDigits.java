package assignment;

public class Assignment3_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987654;
		int count=0;
		if(num==0)
		{
			count=1;
		}
		else
		{
			if(num<0)
			{
				num=-num;
			}
			while(num>0)
			{
				num=num/10;
				count++;
			}
		}
		System.out.println("Number of digits:" + count);

	}

}
