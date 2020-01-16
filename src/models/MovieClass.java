package models;

import java.util.ArrayList;
import java.util.List;

public class MovieClass implements Movie {
	private String title;
	private String sinopse;
	private Genre genre;
	private Director director;
	private List<Actor> actors;
	
	public MovieClass(String title, Genre genre, Director director) {
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.actors = new ArrayList<Actor>();		
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getSinopse() {
		return sinopse;
	}

	@Override
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	@Override
	public Genre getGenre() {
		return genre;
	}

	@Override
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public Director getDirector() {
		return director;
	}

	@Override
	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public List<Actor> getActors() {
		return actors;
	}
	
}
