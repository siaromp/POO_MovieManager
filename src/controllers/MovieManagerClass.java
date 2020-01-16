package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.*;


public class MovieManagerClass implements MovieManager {
	
	public void registerActor(Connection conn, Actor actor) {
		long id = 0;
		try {
			String sql = "INSERT INTO actors(name) VALUES(?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, actor.getName());
			stm.executeUpdate();
			sql = "SELECT id FROM actors WHERE name=?";
			stm = conn.prepareStatement(sql);
			stm.setString(1, actor.getName());
			ResultSet resultSet = stm.executeQuery();
			id = resultSet.getInt("id");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		actor.setID(id);
	}

	@Override
	public void registerDirector(Connection conn, Director director) {
		long id = 0;
		try {
			String sql = "INSERT INTO actors(name) VALUES(?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, director.getName());
			stm.executeUpdate();
			sql = "SELECT id FROM actors WHERE name=?";
			stm = conn.prepareStatement(sql);
			stm.setString(1, director.getName());
			ResultSet resultSet = stm.executeQuery();
			id = resultSet.getInt("id");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		director.setID(id);
	}

	@Override
	public void registerGenre(Connection conn, Genre genre) {
		long id = 0;
		try {
			String sql = "INSERT INTO actors(name) VALUES(?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, genre.getName());
			stm.executeUpdate();
			sql = "SELECT id FROM actors WHERE name=?";
			stm = conn.prepareStatement(sql);
			stm.setString(1, genre.getName());
			ResultSet resultSet = stm.executeQuery();
			id = resultSet.getInt("id");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		genre.setID(id);
		
	}
}