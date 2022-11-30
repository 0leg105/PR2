package Zoo;

//Abstrakte Klassen müssen die abstrakten Methoden ihrer Oberklasse implementieren

public class Hund extends Tier {
	
	//Konstruktor muss implementiert werden aber die getter und setter nicht
	public Hund(String name, int alter) {
		super(name, alter);
	}

	public String speak() {
		return "wuff";
	}
}
 