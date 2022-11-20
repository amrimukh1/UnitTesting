package calculator;

public class Calculation extends Exception{
	int result;
	double f1, new_num1, new_num2; 
	
	
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
	public double divide(int num1, int num2){
		if(num2==0)
		{
			throw new ArithmeticException("Division by zero");
		}
		else 
			new_num1 = num1;
		    new_num2 = num2;
			f1  = new_num1/new_num2;
		    
		
		return f1;
	}

}
