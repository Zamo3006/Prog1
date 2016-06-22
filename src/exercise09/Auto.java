package exercise09;

public class Auto {
	
	
	private String name;
	private String marke;
	private int hubraum;
	private String farbe;
	
	public Auto(String name, String marke, int hubraum, String farbe) {
		this.name = name;
		this.marke = marke;
		this.hubraum = hubraum > 0  ? hubraum : 1600;
		this.farbe = farbe;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMarke() {
		return marke;
	}
	
	public void setMarke(String marke) {
		this.marke = marke;
	}
	
	public int getHubraum() {
		return hubraum;
	}
	
	public void setHubraum(int hubraum) {
		if(hubraum > 0){
			this.hubraum = hubraum;
		}
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}
