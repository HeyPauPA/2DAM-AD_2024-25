package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Resultado 
{
	//El resultado de compone de list:
	//@SerializedName("Dia")
	private List<Dia> list;

	public Resultado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resultado(List<Dia> list) {
		super();
		this.list = list;
	}

	public List<Dia> getList() {
		return list;
	}

	public void setList(List<Dia> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Resultado [list=" + list + "]";
	}
	
}
