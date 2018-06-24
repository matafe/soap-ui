package com.matafe.person.rest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.matafe.person.Person;
import com.matafe.util.Constants;

/**
 * Person Client Example.
 * 
 * @author matafe
 */
public class PersonClient {

	private Client client = ClientBuilder.newClient();

	private static final String URI_PERSON = Constants.BASE_URI + "person";

	public Person getPerson(String name) {
		return client.target(URI_PERSON).path(name).request().get(Person.class);
	}

	public List<Person> getAllPersons() {
		return client.target(URI_PERSON).request().get(new GenericType<List<Person>>() {
		});
	}

	public void addPerson(Person person) {
		this.client.target(URI_PERSON).path("add").request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(person, MediaType.APPLICATION_JSON));
	}

	public void removeAll() {
		this.client.target(URI_PERSON).path("removeAll").request().get();
	}

	public static void main(String[] args) {
		PersonClient pc = new PersonClient();

		System.out.println("=========getAllPersons=========");
		List<Person> persons = pc.getAllPersons();
		System.out.println("Persons founds:" + persons.size());
		for (Person p : persons) {
			System.out.println(p);
		}
		System.out.println("=========addPerson=========");
		pc.addPerson(new Person("John", "Dublin 13"));

		System.out.println("=========getPersonByName=========");
		Person p1 = pc.getPerson("John");
		System.out.println(p1);

		//System.out.println("=========removeAll=========");
		//pc.removeAll();
	}

}
