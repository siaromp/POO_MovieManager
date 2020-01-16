package models;
public class GenreClass implements Genre {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public GenreClass(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
