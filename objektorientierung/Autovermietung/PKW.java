package Autovermietung;

public class PKW {

	private String kennzeichen;
	private double kilometerstand;

	public PKW(String kennzeichen) {
		this.kilometerstand = 0;
		this.kennzeichen = kennzeichen;
	}
	
	public void fahren(double kilometerstand) {
		this.kilometerstand += kilometerstand;
	}
	
	public double getKilometerstand() {
		return kilometerstand;
	}
	
	public String getKennzeichen() {
		return kennzeichen;
	}
	
	public String toString() {
		return "Kennzeichen: "+ kennzeichen+ " Kilometerstand: "+ kilometerstand;
	}
}
