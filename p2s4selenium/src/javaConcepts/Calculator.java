package javaConcepts;

public class Calculator

{
	int a,b,c;

	void addition()
	{
		c = a+b;
		System.out.println("Addition: " + c);
	}

	void substraction()
	{
		c = a-b;
		System.out.println("substraction: " +c);
	}

	public void multiplication()
	{
		c = a*b;
		System.out.println("multiplication: " + c);
	}
	public void division()
	{
		c = a/b;
		System.out.println("divisoin: " + c);
	}
	public static void main(String args[])
	{
		Calculator obj;
		obj= new Calculator();
		
		obj.a = 50;
		obj.b = 10;
		
		obj.addition();
		obj.substraction();
		obj.multiplication();
		obj.division();
		
		
	 }

	}
