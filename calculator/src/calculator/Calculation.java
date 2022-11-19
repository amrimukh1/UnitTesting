package calculator;

public class Calculation extends Exception{
	int result;
	float f1; 
	
	//Method for addition
	public int add(int num1, int num2){
	
		result = num1+num2;
		return result;
	}
	//Method for subtraction
	public int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public int multiply(int num1, int num2){
		result = num1*num2;
		return result;
	}
	//Method for division
	public float divide(int num1, int num2){
		if(num2==0)
		{
			throw new ArithmeticException("Division by zero");
		}
		else 
			
			f1  = num1/num2;
		    
		
		return f1;
	}

}
