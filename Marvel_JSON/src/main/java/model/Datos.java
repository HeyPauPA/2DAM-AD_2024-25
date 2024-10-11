package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Datos 
{
	//result
	//           clase    dato JSON
	//private List<Results> results;
	
	@SerializedName("results")
	private List<Personajes> personajes;

	public List<Personajes> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<Personajes> personajes) {
		this.personajes = personajes;
	}
	
}
