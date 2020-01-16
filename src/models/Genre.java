package models;

import java.io.Serializable;

public interface Genre extends Serializable {

	String getName();

	void setID(long id);
	
	long getID();

}