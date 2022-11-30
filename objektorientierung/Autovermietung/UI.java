package Autovermietung;

import java.util.List;
import java.util.Scanner;

public class UI {
	private VermietungSystem vs;
	Scanner sc = new Scanner(System.in);
	
	public UI(VermietungSystem vs) {
		this.vs = vs;
		hauptmenü();
	}
	
	public void hauptmenü() {
		System.out.println("Wilkommen");
		
		mainloop:
			while(true) {
				System.out.println("Pkws anzeigen = 1");
				System.out.println("Pkw eintragen = 2");
				System.out.println("Auto fahren = 3");
				System.out.println("Beenden = 0");
				int input = Integer.parseInt(sc.nextLine()); //Scanner Schluckauf
				System.out.println();
				
				switch(input) {
				case 1: pkwsAnzeigen();break;
				case 2: pkwEintragen();break;
				case 3: pkwFahren();break;
				case 0: break mainloop;
				}
			}
		System.out.println("Beendet");
	}
	
	public void pkwFahren() {
		System.out.println("Welches Auto");
		String inputK = sc.nextLine();
		PKW[] pkws = vs.getPkws();
		boolean gefunden = false;
		
		for(int i = 0; i < pkws.length; i++) {
			if(autoIdentischMitKennzeichen(pkws[i], inputK)) {
				System.out.println("Wieviel fahren:");
				int inputKm = Integer.parseInt(sc.nextLine());
				pkws[i].fahren(inputKm);
			}
		}
		if(!gefunden) {
			System.out.println("PKW nicht vorhanden");
		}
	}
	
	public boolean autoIdentischMitKennzeichen(PKW pkw, String kennzeichen) {
		System.out.println(pkw.getKennzeichen() + " "+ kennzeichen);
		return pkw.getKennzeichen().equals(kennzeichen);
	}
	
	public void pkwsAnzeigen() {
		PKW[] pkws = vs.getPkws();
		for(int i = 0; i < pkws.length; i++) {
			System.out.println(pkws[i].toString());
		}
	}
	
	public void pkwEintragen() {
		System.out.println("Kennzeichen: ");
		String input = sc.nextLine();
		vs.pkwAnlegen(input);
	}

}
