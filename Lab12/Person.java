package io;

// CONTAINS SOLUTIONS -- JAR THIS

public class Person {
	private String name;
	private int age;
	private String location;

	public Person() {
		this.name = "";
		this.age = 0;
		this.location = "";
	}
	public Person(String name, int age, String location) {
		getName();
		getAge();
		getLocation();
		// Fill-in

	}

	public void setName(String name) {
		this.name = name;
		// Fill-in

	}

	public String getName() {
		return name;

	}

	public void setAge(int age) {
		this.age = age;
		// Fill-in
	
	}

	public int getAge() {
		//fix
		return age;

	}
	public void setLocation(String location) {
		this.location = location;
		// Fill-in

	}

	public String getLocation() {
		//	Fix
		return location;

	}
	
	
	// every object in java has a toString method.  The @Override line
	// is an annotation telling Java that the definition below should 
	// replace the default method.
	// Fill in the definition below such that it returns a String that
	// describes a particular Person.
	@Override
	public String toString() {
		// fix
		// return "a person";
		return getName() + " @" + getLocation() + " is"  + getAge();
	}

}
