package com.matafe.soap;

import javax.xml.ws.Endpoint;

import com.matafe.calculator.soap.CalculatorImpl;
import com.matafe.person.soap.PersonService;
import com.matafe.ping.soap.PingService;

/**
 * Endpoint Publisher - Standalone Application.
 * 
 * @author matafe
 */
public class Publisher {

	public static final String URI_PING = "http://localhost:8080/soap-ui/PingService";
	public static final String URI_CALC = "http://localhost:8080/soap-ui/Calculator";
	public static final String URI_PERSON = "http://localhost:8080/soap-ui/PersonService";

	public static void main(String[] args) {
		// Create instance of services implementations
		PingService pingImpl = new PingService();
		CalculatorImpl calcImpl = new CalculatorImpl();
		PersonService personImpl = new PersonService();

		// Make available
		Endpoint pingEndpoint = Endpoint.publish(URI_PING, pingImpl);
		Endpoint calcEndpoint = Endpoint.publish(URI_CALC, calcImpl);
		Endpoint personEndpoint = Endpoint.publish(URI_PERSON, personImpl);

		// Test that it is available
		System.out.println("Ping Service Web service published = " + pingEndpoint.isPublished());
		System.out.println("Calculator Web service published = " + calcEndpoint.isPublished());
		System.out.println("Person Service Web service published = " + personEndpoint.isPublished());
	}

}
