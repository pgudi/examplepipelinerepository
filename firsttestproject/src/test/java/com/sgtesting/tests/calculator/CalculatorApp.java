package com.sgtesting.tests.calculator;

public class CalculatorApp {
	
	/**
	 * Addition functionality
	 */
	public int addition(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1+number2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Multiplication Functionality
	 */
	public int multiplication(int number1,int number2)
	{
		int result=1;
		try
		{
			result=(number1 * number2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

}
