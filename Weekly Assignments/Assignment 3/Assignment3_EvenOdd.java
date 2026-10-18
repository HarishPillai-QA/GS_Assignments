package assignment;

public class Assignment3_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Even Numbers: ");
		for(int i=1;i<=20;i++)
		{
			int value=i%2;
			if(value==0)
				System.out.print(i + " ");
		}
		System.out.print("\n Odd numbers :");
		for(int i=1;i<=20;i++)
		{
			int value=i%2;
			if(value!=0)
				System.out.print(i +" ");
				
		}
	}

}
