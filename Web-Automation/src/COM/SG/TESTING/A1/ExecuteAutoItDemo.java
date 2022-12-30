package COM.SG.TESTING.A1;

public class ExecuteAutoItDemo {

	public static void main(String[] args) {
		executeautoit();
	}
    
	private static void executeautoit()
	{
		try
		{
			Runtime.getRuntime().exec("C:\\ExampleAutomation\\AutoIt\\FirstScript.exe");
			
			Runtime obj=Runtime.getRuntime();
			obj.exec("C:\\\\ExampleAutomation\\\\AutoIt\\\\FirstScript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
