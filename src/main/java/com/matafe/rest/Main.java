package com.matafe.rest;

import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.matafe.util.Constants;

/**
 * Grizzly Http Server Starter
 * 
 * @author matafe
 */
public class Main {

	/**
	 * Starts Grizzly HTTP server exposing JAX-RS resources defined in this
	 * application.
	 * 
	 * @return Grizzly HTTP server.
	 */
	public static HttpServer startServer() {
		final ResourceConfig rc = new ResourceConfig();
		rc.packages("com.matafe");
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(Constants.BASE_URI), rc);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		final HttpServer server = startServer();

		System.out.println(String.format(
				"Jersey app started with WADL available at " + "%sapplication.wadl\nHit enter to stop it...",
				Constants.BASE_URI));
		System.in.read();

		server.shutdownNow();
	}
}
