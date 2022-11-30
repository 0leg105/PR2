package Interface;

/*
 * SINGLETON PATTERN AUF DER 11.VORLESUNG NOCHMAL ANSCHAUEN IMPLEMENTIEREN
 * 
 * Interface:
 * - Alle Methoden sind abstrakt (Schlüsselwort abstract wird nicht gebraucht)
 * - Kein Konstruktor
 * - Können keine variablen Attribute definieren, nur Konstanten(public,static)
 * - Können default Methoden haben
 *	
 * -> Defniert Standart für Klassen
 * 
 * Callbacks("Rückrufe")
 * - vermeiden Polling
 * - Polling: Wert ständig durch Schleife abfragen
 * - Wert informiert uns, wenn er sich ändert
 * - Action Listener Interface mit actionPerformed()
 * 
 */


public class InterfaceMain {

	public static void main(String[] args) { 		
		//Flieger flieger = new Flieger(); //Interfaces kann man nicht definieren
		
		Flieger ente = new Ente();
		((Ente) ente).eierlegen();
	}
}