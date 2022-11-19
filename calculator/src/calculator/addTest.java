package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class addTest {
	
	 private static final DecimalFormat df = new DecimalFormat("0.00");

	@Test
	void bothnumberpositive() {
		Calculation cal = new Calculation();
		int output_add = cal.add(2,2);
		int output_substract = cal.substract(2, 2);
		int output_multiply = cal.multiply(2,2);
		float output_divide = cal.divide(2,2);
		assertEquals(4, output_add); 
		assertEquals(0, output_substract); 
		assertEquals(4, output_multiply);
		assertEquals(1, output_divide);
		
	}
	@Test
	void onepositiveonenegative() {
		Calculation cal = new Calculation();
		int output_add = cal.add(6,-2);
		int output_substract = cal.substract(6, -2);
		int output_multiply = cal.multiply(6,-2);
		float output_divide = cal.divide(6,-2);
		assertEquals(4, output_add); 
		assertEquals(8, output_substract); 
		assertEquals(-12, output_multiply);
		assertEquals(-3, output_divide);
		
		
	}
	
	@Test
        void positivandzero() {
		Calculation cal = new Calculation();
		int output_add = cal.add(6,0);
		int output_substract = cal.substract(6, 0);
		int output_multiply = cal.multiply(6,0);
		// float output_divide = cal.divide(6,0);
		
		assertEquals(6, output_add); 
		assertEquals(6, output_substract); 
		assertEquals(0, output_multiply);
		ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
			cal.divide(6,0);
		}, "Arithmeticexception was expected");
		
		Assertions.assertEquals("Division by zero", thrown.getMessage());
		//cal.divide(6,0);
    }
	
	@Test
    void negativeandpositive() {
	Calculation cal = new Calculation();
	int output_add = cal.add(-7,3);
	int output_substract = cal.substract(-7, 3);
	int output_multiply = cal.multiply(-7,3);
	float output_divide = cal.divide(-7,3);
	
	assertEquals(-4, output_add); 
	assertEquals(-10, output_substract); 
	assertEquals(-21, output_multiply);
	
	assertEquals(-2.3 , output_divide);
}
	
	/* @Test
    void illegalarguments() {
	Calculation cal = new Calculation();
	IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
		cal.add( 2.3, 4.6);
	}, "IllegalArgumentException was expected");
	
	
	
	Assertions.assertEquals("number is not integer", thrown.getMessage());
	
}*/
}
