package models;

public class ActorClass implements Actor {
	private long id;
	
	private String name;
	
	public ActorClass(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return this.id;
	}
}
