package javaConcepts;

public class ExForExceptions 
{ 
	public void exForThrows() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	public void exForTryCatch() 
	{
		try
		{
		Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			//e.printStackTrace();
		}
	}
}
