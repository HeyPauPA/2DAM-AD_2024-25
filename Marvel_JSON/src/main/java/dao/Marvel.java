package dao;
import java.io.IOException;
	import java.net.URI;
	import java.net.URISyntaxException;
	import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.IOUtils;
	import com.google.gson.Gson;

import model.Personajes;
import model.Root;

	
public class Marvel 
{

		public static List<Personajes> main(String[] args) 
		{
			List<Personajes> listapersonajes = null; //creamos un array donde guardemos los personajes
			
			String urtTXT = "https://gateway.marvel.com/v1/public/characters?limit=100&offset=1&apikey=e894ad1f6af082d2b6b7a63ff20f35e0&hash=6faa0674ad5f8d6d7563ae9d0ad65dc9&ts=9\n";
			try {
				// traer JSON de internet en formato String
				URI uri = new URI(urtTXT);
				String jsonTxt = IOUtils.toString(uri.toURL(), Charset.forName("UTF-8"));
				
				// Result es la clase que representa este JSON Object
				Root root = new Gson().fromJson(jsonTxt, Root.class);
				
				listapersonajes = root.getDatos().getPersonajes(); //hacemos q el array sean los datos buscados
			} 
			catch (URISyntaxException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			return listapersonajes; //devolvemos los datos
		}


}
