package transport;

public class Train 
{
	public static void main(String args[])
	{
		Car oToyota= new Car();
		oToyota.sColor = "yellow";
		
		oToyota.start();
		oToyota.moveForward();
		oToyota.moveBackward();
		oToyota.stop();
	}

}
