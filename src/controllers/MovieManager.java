package controllers;

import java.sql.Connection;

import models.*;

public interface MovieManager {
	
	void registerActor(Connection conn, Actor actor);

	void registerDirector(Connection conn, Director director);

	void registerGenre(Connection conn, Genre genre);

}
