package demoJava;

public class Calculator {
	String regex="[\\w&&[^a-zA-Z_]]+";
		
	 int add(String op1, String op2) throws Exception{
		 if(!(op1.matches(regex))) {
			 throw new Exception("Please enter a number1 in add");
		 }
		 else {
			 if(!(op2.matches(regex))) {
				 throw new Exception("Please enter a number2 in add");
			 }
			 else {
				 Integer i1 = Integer.parseInt(op1);
			        Integer i2 = Integer.parseInt(op2);
			        return i1+i2;
			 }
		 }
	    }
	 
	    int subtract(String op1, String op2) throws Exception {
	    	if(!(op1.matches(regex))) {
				 throw new Exception("Please enter a number1 in subtract");
			 }
			 else {
				 if(!(op2.matches(regex))) {
					 throw new Exception("Please enter a number2 in subtract");
				 }
				 else {
					  Integer i1 = Integer.parseInt(op1);
				        Integer i2 = Integer.parseInt(op2);
				        return i1-i2;
				 }
			 }
	    }
	 
	    int multiply(String op1, String op2) throws Exception{
	    	if(!(op1.matches(regex))) {
				 throw new Exception("Please enter a number1 in multiply");
			 }
			 else {
				 if(!(op2.matches(regex))) {
					 throw new Exception("Please enter a number2 in multiply");
				 }
				 else {
					 Integer i1 = Integer.parseInt(op1);
				        Integer i2 = Integer.parseInt(op2);
				        return i1*i2;
				 }
			 }
	    }
	 
	    int divide(String op1, String op2) throws Exception {
	    	if(!(op1.matches(regex))) {
				 throw new Exception("Please enter a number1 in divide");
			 }
			 else {
				 if(!(op2.matches(regex))) {
					 throw new Exception("Please enter a number2 in divide");
				 }
				 else {
					 if(op2.equals("0")) {
						 throw new Exception("Dividend cannot be Zero");
					 }
					 else {
						 Integer i1 = Integer.parseInt(op1);
					        Integer i2 = Integer.parseInt(op2);
					        return i1/i2;
					 }
					 
				 }
			 }
	        
	    }
}