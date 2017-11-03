package javaConcepts;

import transport.Car;

public class CalculatorWithInputParam

{
int c;

void addition(int a,int b)
{
	c = a+b;
	System.out.println(c);
}

void substraction(int a,int b)
{
	c = a-b;
	System.out.println(c);
}

public void multiplication(int a,int b)
{
	c = a*b;
	System.out.println(c);
}
public void division(int a,int b)
{
	c = a/b;
	System.out.println(c);
}

void getCarModel(String sBrand,int  rating)
{
	
}

void getCarInfo(Car oxyz)
{
	oxyz.moveForward();
}


public static void main(String args[])
{
	CalculatorWithInputParam  oCal;
	oCal = new CalculatorWithInputParam();
	
	
	oCal.addition(144,252);
	oCal.substraction(6337,2521);
	oCal.multiplication(526,63);
	oCal.division(63773,23);
	
	//Car oBMW ;
    //oBMW = null;

	Car oBMW = new Car();
	
	oCal.getCarInfo(oBMW);
	
 }

}
