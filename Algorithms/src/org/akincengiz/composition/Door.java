package org.akincengiz.composition;

public class Door {
	private String name;
	private boolean closed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	
	public Door()
	{
		this("Front-Left",true);
	}
	public Door(boolean closed)
	{
		this("Front-Left",closed);
	}
	public Door(String name)
	{
		this(name,true);
	}
	public Door(String name, boolean closed)
	{
		this.name = name;
		this.closed = closed;
		System.out.println(name + " door is created");
	}
	
	public void open(){
		System.out.println(name + " door is open.");
	}
	
	public void close(){
		System.out.println(name + " door is closed.");
	}
}
