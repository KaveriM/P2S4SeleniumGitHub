package javaConcepts;

import transport.Car;

public class ExForCar
{
	public static void main(String args[])
	{
		Car oHuydai= new Car();
		//oHuydai.sColor = "white";
		oHuydai.moveForward();
		
		Car oHuydai_santa = new Car("Orange",4);//Encapsulation
	}
}
