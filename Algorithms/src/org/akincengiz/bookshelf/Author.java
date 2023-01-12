package org.akincengiz.bookshelf;

public class Author {
	private String firstName;
	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Author()
	{
		this(null,null);
	}
	public Author(String lastName)
	{
		this(null,lastName);
	}
	public Author(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
