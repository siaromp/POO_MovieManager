package models;

import java.util.List;

public interface Movie {

	String getTitle();

	void setTitle(String title);

	String getSinopse();

	void setSinopse(String sinopse);

	Genre getGenre();

	void setGenre(Genre genre);

	Director getDirector();

	void setDirector(Director director);

	List<Actor> getActors();

}