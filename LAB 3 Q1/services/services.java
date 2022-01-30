package com.greatlearning.services;
import java.util.*;

public class services {

	public static Boolean balanceBrackets(String text) {
		
		Stack<Character> stack = new Stack<Character>();
		
		// Traversing the Expression 
		for (int i = 0; i < text.length(); i++)
        {
            char x = text.charAt(i);
            // condition to check for push not done 
            //after any balance bracket sequence is completed. 
            //Example (){} This is Not balance Brackets
            if (i!= 0 && stack.isEmpty())
            	return false ;
            
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }       
	
		// If current character is not opening bracket, then it must be closing. So stack
        // cannot be empty at this point.
          if (stack.isEmpty()) 
       	   return false ;
          char test;
          switch(x) {
          
          case '}' :
        	  
        	  test = stack.pop();
        	  if(test == '(' || test == '[')
        		  return false;
        	  break;
        	  
           case ')' :
        	  
        	  test = stack.pop();
        	  if(test == '{' || test == '[')
        		  return false;
        	  break;
           
           case ']' :
         	  
         	  test = stack.pop();
         	  if(test == '(' || test == '{')
         		  return false;
         	  break;  
          }
  }	
		return (stack.isEmpty());
		
	}
	
	public static void printResult (Boolean result) {
		
		//String output = new String();
		if (result == true) {
			System.out.println("The entered String has Balanced Brackets"); 
		    System.out.println("---------------------------------------------------------");
		}
		    else {
	    	System.out.println("The entered Strings do not contain Balanced Brackets");
		    System.out.println("---------------------------------------------------------");
		    }
		    
	}
}
