package com.matafe.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Person POJO.
 * 
 * @author matafe
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Person")
public class Person {

	@XmlElement(name = "name", required = true)
	private String name;

	private String address;

	public Person() {
		super();
	}

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
