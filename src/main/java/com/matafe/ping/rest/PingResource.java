package com.matafe.ping.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Ping Resource Implementation..
 * 
 * @author matafe
 */
@Path("ping")
public class PingResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "Rest Working!!!";
	}

}
