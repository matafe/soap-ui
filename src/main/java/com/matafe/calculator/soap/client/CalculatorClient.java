package com.matafe.calculator.soap.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.matafe.calculator.soap.Calculator;
import com.matafe.soap.Publisher;

/**
 * Calculator Client. (Consumer)
 * 
 * @author matafe
 */
public class CalculatorClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL(Publisher.URI_CALC + "?wsdl");
		QName qname = new QName("http://calculator.matafe.com/", "CalculatorService");
		Service service = Service.create(url, qname);

		Calculator wsService = service.getPort(Calculator.class);

		// remote call here
		int result = wsService.sum(1, 9);
		System.out.println("Result from ws call = " + result);

	}

}
