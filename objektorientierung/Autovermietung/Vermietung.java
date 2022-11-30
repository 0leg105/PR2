package Autovermietung;

import java.util.Collection;
import java.util.HashMap;

public class Vermietung {

	private String name;
	private HashMap<String, PKW> pkws = new HashMap<>();

	public Vermietung(String name) {
		this.name = name;
	}

	public void addPKW(PKW pkw) {
		pkws.put(pkw.getKennzeichen(), pkw);
	}

	public String getName() {
		return this.name;
	}

	public Collection<PKW> getPKWs(){
		return pkws.values();
	}
}
