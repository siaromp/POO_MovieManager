package models;

public abstract class PersonClass implements Person {
	private long id;
	
	private String name;
	
	public PersonClass(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return this.id;
	}
}
