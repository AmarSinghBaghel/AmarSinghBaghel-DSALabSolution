package com.greatlearning.driver;

import com.greatlearning.services.*;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text = "( [ [ { } ] ] )" ;
       String text1 = "( [ [ { } ] ] ) )";
       String text2 = "(){}";
       String text3 = "( [ [ { } ]( ] ) )";
       Boolean result ; 
       
       System.out.println("---------------------------------------------------------");
       // calling function to check balanced Brackets
       result = services.balanceBrackets(text);
       System.out.println("Result for String Text " + text + " is");
       // calling function to print out based on result value for balanced Brackets
       services.printResult(result);
       
       result = services.balanceBrackets(text1);
       System.out.println("Result for String Text " + text1 + " is");
       services.printResult(result);
       
       result = services.balanceBrackets(text2);
       System.out.println("Result for String Text " + text2 + " is");
       services.printResult(result);
       
       result = services.balanceBrackets(text3);
       System.out.println("Result for String Text " + text3 + " is");
       services.printResult(result);
       
    
   
    
    
    
	 
   

}
  
   
}
