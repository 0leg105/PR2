package Autovermietung;

import java.util.Collection;

public class VermietungSystem {

	private Vermietung vermietung;

	public VermietungSystem(String vermietungname) {
		this.vermietung = new Vermietung(vermietungname);
	}

	public void pkwAnlegen(String kennzeichen) {
		PKW pkw = new PKW(kennzeichen);
		vermietung.addPKW(pkw);
	}

	public PKW[] getPkws() {
		Collection<PKW> pkws = vermietung.getPKWs();
		PKW[] liste = new PKW[pkws.size()];

		int i = 0;
		for (PKW p : pkws) {
			liste[i++] = p; 
		}
		return liste;
	}

	public String getVermietungname() {
		return vermietung.getName();
	}
}
