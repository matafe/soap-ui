package com.matafe.ping.soap;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Ping Service Implementation - Endpoint.
 * 
 * @author matafe
 */
@WebService
public class PingService {

	@WebMethod
	@WebResult
	public String ping() {
		return "Soap Working!!!";
	}

}
