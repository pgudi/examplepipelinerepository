package com.sgtesting.tests.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sgtesting.tests.calculator.CalculatorApp;

public class CalculatorTest {
	
	CalculatorApp calculator=new CalculatorApp();
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void testAddTwoPositiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=70;
			actual=calculator.addition(30,40);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void testAddTwoNegativeNumbers()
	{
		int expected,actual;
		try
		{
			expected=-17;
			actual=calculator.addition(-13,-4);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void testMultiplyTwoPositiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=70;
			actual=calculator.multiplication(10,7);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void testMultiplyTwoNegativeNumbers()
	{
		int expected,actual;
		try
		{
			expected=52;
			actual=calculator.multiplication(-13,-4);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
