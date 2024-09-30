package manejador;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import model.Dia;

public class ManejadorWeb extends DefaultHandler {

	private XMLReader xr;
	private String lastContent;
	private InputSource is;
	private ArrayList<Dia> dias;
	

	public ManejadorWeb(String strUrl) 
	{
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        parserFactory.setNamespaceAware(true);
        SAXParser parser;
		try 
		{
			parser = parserFactory.newSAXParser();
	        xr = parser.getXMLReader();
	        this.is=new InputSource(new URL(strUrl).openStream());
		} 
		catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		xr.setContentHandler(this);
		xr.setErrorHandler(this);
	}

	public ArrayList<Dia> parsear() 
	{
		// En este caso como el xml esta en Internet debemos crear el stream y
		// con este el source
		try 
		{
			// La llamada a este metodo es el que desencadena todo el proceso
			xr.parse(this.is);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
		return dias;
	}

	//----- TODO ESTO SE PUEDE AUTOGENERAR -----
	//INICIO DEL DOCUMENTO
	@Override
	public void startDocument() throws SAXException 
	{
		super.startDocument();
	}
	
	//FINAL DEL DOCUMENTO
	@Override
	public void endDocument() throws SAXException 
	{
		super.endDocument();
	}

	//-ETIQUETA: INICIO → aqui guardamos los datos de los atributos dentro de la etiqueta
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
	{
		super.startElement(uri, localName, qName, attributes);
	}

	//-ETIQUETA: FIN → aqui guardamos los datos del contenido de la etiqueta (entre el inicio y fin)
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException 
	{
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException 
	{
		super.characters(ch, start, length);
	}


	//-------------------------------------------
}
