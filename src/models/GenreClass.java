package models;
public class GenreClass implements Genre {
	private static final long serialVersionUID = 1L;
	long id;
	private String name;
	
	public GenreClass(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setID(long id) {
		this.id=id;
	}
	public long getID() {
		return this.id;
	}
}
