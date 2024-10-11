package model;

import com.google.gson.annotations.SerializedName;

public class Root 
{
 //data
	@SerializedName("data")
	private Datos datos;

	
//getters y setters
	public Datos getDatos() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}
	
}
