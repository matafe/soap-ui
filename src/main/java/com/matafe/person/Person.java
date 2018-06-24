package com.matafe.person;

import java.util.Date;

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
@XmlRootElement(name = "person")
public class Person {

	@XmlElement(name = "name", required = true)
	private String name;

	private String address;

	private Date creationDate;

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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
