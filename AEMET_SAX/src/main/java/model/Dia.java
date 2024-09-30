package model;

public class Dia {
	private String to;
	private String from;
	private String icono;
	private String preci;
	private String prono;
	private String max;
	private String min;
	public Dia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dia(String to, String from, String icono, String preci, String prono, String max, String min) {
		super();
		this.to = to;
		this.from = from;
		this.icono = icono;
		this.preci = preci;
		this.prono = prono;
		this.max = max;
		this.min = min;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getPreci() {
		return preci;
	}
	public void setPreci(String preci) {
		this.preci = preci;
	}
	public String getProno() {
		return prono;
	}
	public void setProno(String prono) {
		this.prono = prono;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "Dia [to=" + to + ", from=" + from + ", icono=" + icono + ", preci=" + preci + ", prono=" + prono
				+ ", max=" + max + ", min=" + min + "]";
	}
	
	
}

