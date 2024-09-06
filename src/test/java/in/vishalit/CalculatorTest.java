package in.vishalit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.vishalit.beans.Calculator;

public class CalculatorTest {//this is our test class 
	
	@Test// it is represent a Junit method
	public void addTest() {
		Calculator c = new Calculator();
		int actualResult = c.add(10,20);
		assertEquals(30,actualResult);//validate the test method 
	}
	@Test
	public void mulTest() {
		Calculator c = new Calculator();
		int actualRes =c.mul(10, 50);
		assertEquals(500, actualRes);
		
	}
}
