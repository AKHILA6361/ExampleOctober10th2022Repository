package COM.SG.TESTING.P1;

public class DisplayEvenNumbers {

	public static void main(String[] args) {
		 displayevennumbers();


	}
	public static void displayevennumbers()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers:"+i);
			}
		}
	}

}
