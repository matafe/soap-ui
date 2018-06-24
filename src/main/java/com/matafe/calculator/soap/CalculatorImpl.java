package com.matafe.calculator.soap;

import javax.jws.WebService;

/**
 * Calculator Implementation.
 * 
 * @author matafe
 */
// endpointInterface -> delegate @WebService for the Interface
@WebService(endpointInterface = "com.matafe.calculator.soap.Calculator", serviceName = "CalculatorService", portName = "CalculatorPort")
public class CalculatorImpl implements Calculator {

	@Override
	public int sum(int a, int b) {
		int r = a + b;
		System.out.println(a + " + " + b + " = " + r);
		return r;
	}

	@Override
	public double division(int a, int b) {
		double result = a / b;
		return result;
	}

}
