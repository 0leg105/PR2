package Mitarbeiter;

public class Manager extends Mitarbeiter{
	
	public String abteilung;
	
	public Manager(String name, String abteilung) {
		super(name);
		this.abteilung = abteilung;
	}
	
	public String toString() {
		return super.toString()+ " Abeteilung: " + this.abteilung;
	}
	
	public String test() {
		return "Manager Methode";
	}
}
