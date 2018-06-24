package com.matafe.calculator.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import com.matafe.util.Constants;

/**
 * Calculator Client Example.
 * 
 * @author matafe
 */
//TODO
public class CalculatorClient {

	Client client = ClientBuilder.newClient();

	private static final String URI_CALC = Constants.BASE_URI + "calculator";

	public static void main(String[] args) {
		CalculatorClient calculator = new CalculatorClient();

		int a = 13;
		int b = 7;
//		/Integer result = calculator.client.target(URI_CALC).resolveTemplate(name, value).path("sum").request().get(Integer.class);
		//System.out.println(String.format("Result of %d + %d = %d", a, b, result));

	}

}
