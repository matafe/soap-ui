package com.matafe;

import javax.xml.ws.Endpoint;

import com.matafe.calculator.CalculatorImpl;
import com.matafe.person.PersonService;

/**
 * Endpoint Publisher - Standalone Application.
 * 
 * @author matafe
 */
public class Publisher {

	public static final String URI_CALC = "http://localhost:8080/soap-ui/Calculator";
	public static final String URI_PERSON = "http://localhost:8080/soap-ui/PersonService";

	public static void main(String[] args) {
		// Create instance of services implementations
		CalculatorImpl calcImpl = new CalculatorImpl();
		PersonService personImpl = new PersonService();

		// Make available
		Endpoint calcEndpoint = Endpoint.publish(URI_CALC, calcImpl);
		Endpoint personEndpoint = Endpoint.publish(URI_PERSON, personImpl);

		// Test that it is available
		System.out.println("Calculator Web service published = " + calcEndpoint.isPublished());
		System.out.println("Person Service Web service published = " + personEndpoint.isPublished());
	}

}
