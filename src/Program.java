import models.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controllers.*;

public class Program {
	public static Connection connect() {
		Connection connection = null;
		try {
			String url = "jdbc:sqlite:movie_manager.sqlite";
			connection = DriverManager.getConnection(url);
			} catch(SQLException sqle) {
				sqle.printStackTrace();
			}
		return connection;
	}
	
	public static void main (String[] args) {
		
		Actor actor1 = new ActorClass("Jodie Foster");
		Actor actor2 = new ActorClass("Robert De Niro");
		Director director = new DirectorClass("Martin Scorsese");
		Genre genre = new GenreClass("Drama");
		
		Connection conn = connect();
		
		MovieManager movie = new MovieManagerClass();
		
		movie.registerActor(conn, actor2);
		movie.registerDirector(conn, director);
		movie.registerGenre(conn, genre);
		
	}
}