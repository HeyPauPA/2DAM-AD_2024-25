package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Dia 
{
	//busco dentro main, weather, pop y dt_txt
	
	//main objeto por ser {}
	@SerializedName("main") //a lo q se llama main
	private Temps temps;	//lo voy a llamar de esta manera 
						    //(cambia el nombre de la etiqueta)
	
	//weather un list/array de objetos por ser []
	@SerializedName("weather")
	private List<IcoProno> icoProno;	
	
	//pop int
	private float pop;
	
	//dt_txt string
	@SerializedName("dt_txt")
	private String fecha;
}
