package org.akincengiz.bookshelf;

public class Reader {
	private String name;
	private int age;
	private char sex;
	private Book reading;
	
	public Book getReading() {
		return reading;
	}
	public void setReading(Book reading) {
		this.reading = reading;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Reader()
	{
		this("",0,'k',null);
	}
	public Reader(String name, int age)
	{
		this(name, age, 'k', null);
	}
	public Reader(String name, char sex)
	{
		this(name, 0, sex, null);
	}
	public Reader(String name, int age, char sex)
	{
		this(name,age,sex,null);
	}
	public Reader(String name, int age, char sex, Book reading)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.reading = reading;
	}
	
	void read(Book book)
	{
		int read = book.getCurrentPage()+50;
		book.setCurrentPage(read);
	}
	
	void getReader()
	{
		System.out.print("\nOkurun adi       : " + this.name);
		System.out.print("\nOkurun yasi      : " + this.age);
		System.out.print("\nOkurun cinsiyeti : " + (this.sex == 'e' ? "Erkek" : "Kadin"));
		System.out.print("\nOkunan kitap     : " + this.reading.getTitle());
		System.out.print("\nOkunan sayfa     : " + this.reading.getCurrentPage());
		System.out.print("\nKitabın yazari   : " + this.reading.getAuthor().getFirstName() + " " + this.reading.getAuthor().getLastName());
		System.out.print("\n********************************************************\n");
	}
}
