package assignment;

public class Assignment_SumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				sum =sum + i;
				
			}	
		}
		System.out.println("Sum of even numbers: " + sum);

	}

}
