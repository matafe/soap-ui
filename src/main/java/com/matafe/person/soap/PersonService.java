package com.matafe.person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 * Person Service Implementation - Endpoint.
 * 
 * @author matafe
 */
@WebService
public class PersonService {

	private final Map<String, Person> persons = new HashMap<>();

	public PersonService() {
		// adding some values for start...
		for (int i = 1; i <= 3; i++) {
			String name = "Person_" + i;
			persons.put(name, new Person(name, "Address_" + i));
		}
	}

	@WebMethod
	@WebResult(name = "person")
	public Collection<Person> findPersons() {
		return persons.values();
	}

	@WebMethod
	public String savePerson(@WebParam(name = "person") @XmlElement(required = true) Person person) {
		persons.put(person.getName(), person);
		return String.format("Person '%s' added", person.getName());
	}

	@WebMethod
	public String removeAllPersons() {
		int size = persons.size();
		persons.clear();
		return String.format("All %d person removed", size);
	}

}
