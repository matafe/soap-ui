package com.matafe.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Calculator Interface - Endpoint.
 * 
 * @author matafe
 */
@WebService
public interface Calculator {

	/**
	 * Sum two numbers.
	 * 
	 * @param a Number one.
	 * @param b Number two.
	 * 
	 * @return The sum of two numbers.
	 */
	@WebMethod
	int sum(int a, int b);
	
	/**
	 * Divide two numbers.
	 * 
	 * @param a Number one.
	 * @param b Number two.
	 * 
	 * @return The result of division.
	 */
	@WebMethod(operationName = "divide")/*operationName -> change the wsdl operation */
	double division(@WebParam(name = "num1") /*name change the wsdl param name */ int a, @WebParam(name = "num2") int b);

}
