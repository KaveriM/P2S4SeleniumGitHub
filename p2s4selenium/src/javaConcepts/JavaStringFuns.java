package javaConcepts;

import org.junit.Test;

public class JavaStringFuns 
{
  @Test	
  public void exStringFuns()
  {
	  String str1 = "this is java class";
	  String str2 = "   thanks for your transaction.. your ref# 987893425  ";
	  String sRefNo = "1234567890";
	  String str3 = "welcome to facebook";
	  
	  str2.trim().substring(41, 49);
	  System.out.println(str2.trim().substring(41, 49));
	  
	  System.out.println(str3.replace("facebook", "google"));
	  
	  System.out.println(str2);
	  System.out.println(str2.trim());
	   
	  if(sRefNo.length()==10)  //Length
	   {
		   System.out.println("pass,expected nof char are presented in the ref no");
	   }
	   else
	   {
		   System.out.println("fail,expected nof char are not presented in the ref no"); 
	   }
	   
	   System.out.println(str1.concat(str2));    //concatenate
	   
	   
	   if(str3.contains("facebook"))   //Contains
	   {
		   System.out.println("pass, contains");   
	   }
	   else
	   {
		   System.out.println("fail, contains");
	   }
	   
	   if(str3.equals("facebook"))    //Equals
	   {
		   System.out.println("pass, contains");   
	   }
	   else
	   {
		   System.out.println("fail, contains");
	   }
	   
	   if(str3.equalsIgnoreCase("welcome to facebook"))   //equalsIgnoreCase
	   {
		   System.out.println("pass, contains");   
	   }
	   else
	   {
		   System.out.println("fail, contains");
	   }
	   
	   
	   
	   
	   
	   
	  
	 
  }
}
