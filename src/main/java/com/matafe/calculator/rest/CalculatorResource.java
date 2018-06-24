package com.matafe.calculator.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("calculator")
public class CalculatorResource {


	/**
	 * Sum two numbers.
	 * 
	 * @param a Number one.
	 * @param b Number two.
	 * 
	 * @return The sum of two numbers.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("sum/{number1}+{number2}")
	public Response sum(@PathParam("number1") int a, @PathParam("number2") int b) {
		int result = a + b;
		return Response.ok().entity(result).build();
	}
	
	/**
	 * Divide two numbers.
	 * 
	 * @param a Number one.
	 * @param b Number two.
	 * 
	 * @return The result of division.
	 */
	@Path("divide/{number1}+{number2}")
	public Response division(@PathParam("number1") int a, @PathParam("number2") int b) {
		double result = a / b;
		return Response.ok().entity(result).build();
	}
}
