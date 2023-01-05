package org.akincengiz.bookshelf;

public class Reader {
	String name;
	int age;
	char sex;
	Book reading;
	
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
	
	void read(Book book)
	{
		book.currentPage += 50;
	}
	
	void getReader()
	{
		System.out.print("\nOkurun adi       : " + this.name);
		System.out.print("\nOkurun yasi      : " + this.age);
		System.out.print("\nOkurun cinsiyeti : " + (this.sex == 'e' ? "Erkek" : "Kadin"));
		System.out.print("\nOkunan kitap     : " + this.reading.title);
		System.out.print("\nOkunan sayfa     : " + this.reading.currentPage);
		System.out.print("\n********************************************************\n");
	}
}
