package COM.SG.TESTING.P1;

public class Forloop {

	public static void main(String[] args) {
		displayevennumbers();

		}
		public static void displayevennumbers()
		{
			int i=1;
			while(i<=20)
			{
				if(i%2==0)
				{
					System.out.println("Even numbers:"+i);	
					
				}
				i++;
				
			}
		}

	}

	


