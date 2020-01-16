package models;


public class DirectorClass extends PersonClass implements Director {
	private long id;
	
	public DirectorClass(String name) {
		super(name);
	}
	
	public long getID() {
		return this.id;
	}
	
	public void setID(long id) {
		this.id=id;
	}
	
}
