package co.com.saimyr.testdatabuilder;

import co.com.saimyr.domain.Person;

// TestDataBuilder de patron DataBuilder de GoF
public class PersonTestDataBuilder {
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "SAIMYR";
		this.lastName = "Software";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		return new Person(this.name, this.lastName);
	}
}
