package transport;

public class Car 
{
	
String sColor;
int iNoDoors;
float lenght;
boolean isAutoTransmission;


    /*default constructor*/
       public Car()
         {
    	   
         }
    
    
    /*Parameterized constructor*/
        public Car(String  sCarColor,int iDoors)
        {
        	sColor = sCarColor;
        	iNoDoors = iDoors;
        }
       
    
    
    void start()
      {
	    System.out.println("Logic Realated to start");
      }

    void stop()
      {
	    System.out.println("Logic Realated to stop");
      }

    public void moveForward()
      {
	    System.out.println("Logic Realated to moveforwar");
      }
  
    void moveBackward()
      {
	     System.out.println("Logic Realated to moveBackward");
      }

    
 public static void main(String args[])
{
	Car oBMW= new Car();
	oBMW.sColor = "Blue";
	
	Car oBMWX1 = new Car("Red",1);
	
	oBMW.start();
	oBMW.moveForward();
	oBMW.moveBackward();
	oBMW.stop();
	
	Car oAcura;
	oAcura = new Car();
	oAcura.moveBackward();
	
	
  }

}
