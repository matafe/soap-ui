package com.matafe.person.soap;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.matafe.person.Person;
import com.matafe.person.PersonManager;

/**
 * Person Service Implementation - Endpoint.
 * 
 * @author matafe
 */
@WebService
public class PersonService {

	@WebMethod
	@WebResult(name = "person")
	public Collection<Person> findPersons() {
		return PersonManager.getInstance().findAll(null);
	}

	@WebMethod
	public String savePerson(@WebParam(name = "person") @XmlElement(required = true) Person person) {
		PersonManager.getInstance().add(person);
		return String.format("Person '%s' added", person.getName());
	}

	@WebMethod
	public String removeAllPersons() {
		PersonManager personManager = PersonManager.getInstance();
		int size = personManager.count();
		personManager.removeAll();
		return String.format("All %d person removed", size);
	}

}
