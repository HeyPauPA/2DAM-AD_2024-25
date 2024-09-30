package view;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;
import model.Dia;
import model.Resultado;


public class Prueba {

	public static void main(String[] args) 
	{
		//Linea de conexion (dado por el profesor)


		String urtTXT = "http://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&units=metric&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp";
		try 
		{
			// traer JSON de internet a través de la URL en formato String
			URI uri = new URI(urtTXT);
			String jsonTxt = IOUtils.toString(uri.toURL(), Charset.forName("UTF-8"));
			// serializar
//			Resultado result = new Gson().fromJson(jsonTxt, Resultado.class);
			
//			for (Dia dia:result.getList()) 
//			{
//				System.out.println(dia);
//			}	
		} 
		catch (URISyntaxException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}


