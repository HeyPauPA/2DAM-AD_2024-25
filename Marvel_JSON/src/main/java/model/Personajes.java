package model;

import com.google.gson.annotations.SerializedName;

public class Personajes 
{
//	name
	@SerializedName("name")
	private String nombrePersonaje;
//  description
	@SerializedName("description")
	private String descripcionPersonaje;
	
//  thumbnail{} → extension y ruta
	@SerializedName("thumbnail")
	private URL url;

//getter y setters
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

	public String getDescripcionPersonaje() {
		return descripcionPersonaje;
	}

	public void setDescripcionPersonaje(String descripcionPersonaje) {
		this.descripcionPersonaje = descripcionPersonaje;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	} 

}
