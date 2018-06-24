package com.matafe.person.rest;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.matafe.person.Person;
import com.matafe.person.PersonManager;

/**
 * Person Resource Implementation.
 * 
 * @author matafe
 */
@Path("person")
public class PersonResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Collection<Person> findPersons(@QueryParam("sortBy") String sortBy) {
		return PersonManager.getInstance().findAll(sortBy);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("add")
	public Response savePerson(Person person) {
		PersonManager.getInstance().add(person);
		return Response.ok().entity(true).build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("removeAll")
	public Response removeAllPersons() {
		PersonManager personManager = PersonManager.getInstance();
		int size = personManager.count();
		personManager.removeAll();
		return Response.ok().entity(String.format("All %d person removed", size)).build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("remove/{name}")
	public Response removePerson(@PathParam("name") String name) {
		boolean result = PersonManager.getInstance().remove(name);
		return Response.ok().entity(result).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{name}")
	public Response find(@PathParam("name") String name) {
		Person person = PersonManager.getInstance().find(name);
		return Response.ok().entity(person).build();
	}

}
