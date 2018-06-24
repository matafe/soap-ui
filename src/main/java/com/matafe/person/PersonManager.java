package com.matafe.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Person Manager Implementation.
 * 
 * @author matafe
 */
public class PersonManager {

	/** This should represent the data in the database */
	private final Map<String, Person> persons = new HashMap<>();

	/** Singleton instance */
	private static PersonManager $instance;

	private PersonManager() {
		// adding some values for start...
		for (int i = 1; i <= 3; i++) {
			String name = "Person_" + i;
			add(new Person(name, "Address_" + i));
		}
	}

	/**
	 * Get the singleton instance of this class.
	 * 
	 * @return The instance.
	 */
	public static PersonManager getInstance() {
		if ($instance == null) {
			synchronized (PersonManager.class) {
				if ($instance == null) {
					$instance = new PersonManager();
				}
			}
		}
		return $instance;
	}

	/**
	 * Add a person.
	 * 
	 * @param person
	 *            The person to add.
	 */
	public void add(Person person) {
		person.setCreationDate(new Date());
		persons.put(person.getName(), person);
	}

	/**
	 * Find a person by name.
	 * 
	 * @param name
	 *            The person name.
	 * @return The {@link Person} found.
	 */
	public Person find(String name) {
		return persons.get(name);
	}

	/**
	 * Find all persons.
	 * 
	 * @param sortBy
	 * 
	 * @return A {@link Collection} of {@link Person} found.
	 */
	public Collection<Person> findAll(String sortBy) {
		if ("creationDate".equalsIgnoreCase(sortBy)) {
			ArrayList<Person> sortedPersons = new ArrayList<>(persons.values());
			Collections.sort(sortedPersons, new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					return o1.getCreationDate().compareTo(o2.getCreationDate());
				}
			});
			return sortedPersons;
		} else {
			return persons.values();
		}

	}

	/**
	 * Remove all persons.
	 */
	public void removeAll() {
		this.persons.clear();
	}

	/**
	 * Get the number of persons.
	 * 
	 * @return The number of persons.
	 */
	public int count() {
		return this.persons.size();
	}

	/**
	 * Remove a person.
	 * 
	 * @param name
	 *            The name of the person.
	 * 
	 * @return True if the person was removed or false otherwise
	 */
	public boolean remove(String name) {
		Person result = this.persons.remove(name);
		return result != null ? true : false;
	}
}
