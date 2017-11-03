package javaConcepts;

import org.junit.Test;

public class Javaloops

{
	
	   public void exForIfLoop()

	{
       int custmorAge = 75;
       String  custmorGender ="Male";
       String  custmorState = "NY";

	    if(custmorAge>70 && custmorGender=="Female")
	    {
          System.out.println("extra 0.5% interest rate");
        }
	    
	    
	    if(custmorAge>70 || custmorGender=="Female")
	    {
          System.out.println("extra 0.5% interest rate");
        }
	    
	    
	    if(custmorState !="CA")
	    {
          System.out.println("extra 0.5% interest rate");
        }  
	}  

		public void exForIfElseLoop()

		{

		int custmorAge = 75;

		if(custmorAge>70)

		{

		  System.out.println("extra 0.5% interest rate");

		}


		else

		{

		System.out.println("reduce 0.5% interest rate");

		}

		}


		public void exForNestedIfElseLoop()

		{

		int custmorAge = 75;

		if(custmorAge>=80)

		{

		  System.out.println("extra 1.5% interest rate");

		}


		else if(custmorAge>70)

		{

		System.out.println("extra 0.5% interest rate");

		}

		else

		{

		System.out.println("reduce 0.5% interest rate");

		}

		}


		public void exForNestedIfElseLoop2()

		{

		int custmorAge = 75;

		String custmorGender = "Male";

		if(custmorAge>=80)

		{

		if(custmorGender=="Famle")

		{

		      System.out.println("extra 1.5% interest rate");

		    }


		    else

		    {

		  System.out.println("extra 1% interest rate");

		    }

		}

		else if(custmorAge>70)

		{

		System.out.println("extra 0.5% interest rate");

		}

		else

		{

		System.out.println("reduce 0.5% interest rate");

		}

		}



		public void exForSwitchcase()

		{

		  String option = "Car Rental";

		      switch (option)

		       {

		      

		  case  "Flights":

		  System.out.println("Logic  to Flights ");

		  break;

		   

		  case  "Hotels":

		  System.out.println("Logic  to Hotels");

		  break;

		   

		  case  "Package":

		  System.out.println("Logic Realated to Package");

		  break;

		   

		  case  "Car rentals" :

		  System.out.println("Logic Realated to rentals");

		  break;

		   

		  case  "Cruises":

		  System.out.println("Logic Realated to Cruises");

		  break;

		   

		  default:

		  System.out.println("pass appropri option");

		  break;

		}


		}


            @Test
		 public void exForForLoop()

		    {

		    for(int i =1;i<=10;i++)

		    {

		      System.out.println(i);

		    }

		    }
 
         @Test
         public void exForWhile()
         {
        	 int i =1;
        	 //int i =11;
        	 while(i<=10)
        	 {
        		 System.out.println(i);
        		 i++;
        	 }	 
         }
         @Test
         public void exForDoWhile()
         {
        	 int i =11;
        	 do
        	 {
        		 System.out.println(i);
        		 i++;
        	 }
        	 while(i<=10);
         } 

}






    

	
