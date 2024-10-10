package parser;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import model.Dia;

public class OpenWeather {
	
	private ArrayList<Dia> dias;
	
	public OpenWeather() 
	{
		DOMParserWeb domParser = new DOMParserWeb("https://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&mode=xml&APPID=601c9db344b44f9774ef76a4c07979b1&amp;lang=sp&units=metric");
		Document doc = domParser.getDocumento();
		Dia dia;

		//--BUSQUEDA DE LOS TAG TIME Q ES DONDE ESTAN TODOS LOS DATOS
		NodeList nodosTimes = doc.getElementsByTagName("time");
		
		//array de objetos dia
		
		dias = new ArrayList<Dia>(); //Todos los datos estan dentro de la variable dia (sus atributos)
		
		//BUSQUEDA DE DATOS DENTRO DE "TIME"
		for (int i=0; i < nodosTimes.getLength(); i++) 
		{
			dia = new Dia(); 	//objeto dia
			//----- TAG TIME ------
			Element nodotime = (Element)nodosTimes.item(i); //Dentro del elemento time (solo 1 no todos como antes)
															//dentro de todos los time el elemento i (osea el primero)
				//ATRIBUTOS → Obtenemos los atributos dentro de to/from
			dia.setTo(nodotime.getAttribute("to"));			
			dia.setFrom(nodotime.getAttribute("from"));

			//----- TAG PRECIPITACION ------
			Element elepreci = (Element)nodotime.getElementsByTagName("precicipitacion").item(0); //buscas dentro de una etiqueta
				//ATRIBUTO PROBABILIDAD
			dia.setPreci(elepreci.getAttribute("probability"));									//un atributo (lo añades a la vex a dia)
			
			//----- TAG TEMPERATURA ------			
			Element eletem = (Element) nodotime.getElementsByTagName("temperature").item(0);
				//ATRIBUTO MAX/MIN
			dia.setMax(eletem.getAttribute("max"));
			dia.setMin(eletem.getAttribute("min"));
			
			//----- TAG SIMBOLO ------	
			Element elesymbol = (Element) nodotime.getElementsByTagName("symbol").item(0);	
				//ATRIBUTO MAX/MIN
			dia.setIcono(elesymbol.getAttribute("var"));
			
			//----- TAG NUBES -----
			Element eleclouds = (Element) nodotime.getElementsByTagName("clouds").item(0);
				//ATRIBUTO VALOR
			dia.setProno(eleclouds.getAttribute("value"));
			
			//AÑADIMOS EL DIA CON TODOS SUS ATRIBUTOS
			dias.add(dia);
		}
		
	}

	public ArrayList<Dia> getDias() {
		return dias;
	}
	

}
