package javaConcepts;

import transport.Car;
import transport.Train;

public class CalculatorWithReturnValue

{
int c;

       /*method overloding */
       int addition(int a,int b)
       {
    	    c = a+b;
    	    //System.out.println(c);
    	    return c;
       }
       
       int addition(int a,int b,int d)
       {
    	    c = a+b+d;
    	    //System.out.println(c);
    	    return c;
       }
       
       int addition(String a,String  b)
       {
    	    //c = a+b;
    	    //System.out.println(c);
    	    return 1;
       }
       
       int substraction(int a,int b)
         {
	        c = a-b;
	        //System.out.println(c);
	        return c;
	      }

      
       int multiplication(int a,int b)
        {
	       c = a*b;
	       //System.out.println(c);
	       return c;
	    }
     
     
       int  division(int a,int b)
       {
	        c = a/b;
	       // System.out.println(c);
	         return c;
        }

   
     String getCarModel(String sBrand,int  rating)
     {
    	 return "Honda";
 	 }
      boolean timeUp()
      {
    	  return true;
      }
     

     String getCarInfo(Car oxyz)
     {
	        oxyz.moveForward();
	        return "";
     }
      Train bestTransportService()
      {
    	 Train oBullet = new Train();
    	  return oBullet;
      }


public static void main(String args[])
{
	CalculatorWithReturnValue  oCal;
	oCal = new CalculatorWithReturnValue();
	
	
	int iAdd =  (oCal.addition(144,252));
	System.out.println(iAdd);
			
	System.out.println((oCal.substraction(6337,2521)));
	System.out.println((oCal.multiplication(526,63)));
	System.out.println((oCal.division(63773,23)));
	
	//System.out.println((oCal.bestTransportService()));
	Train oA =oCal.bestTransportService();
	System.out.println((oA));

	
	
	
	//Car oBMW ;
    //oBMW = null;

	Car oBMW = new Car();
	
	oCal.getCarInfo(oBMW);
	
 }

}
