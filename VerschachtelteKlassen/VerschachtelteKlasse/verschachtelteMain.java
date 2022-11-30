package VerschachtelteKlasse;

/* Sinn:
 * -> Codeblock übergabe an eine Methode
 * 
 * Nichtstatische Elementklasse/Nonstatic Member Class:
 * - Deklarierte Klasse innerhalb einer Klasse
 * - Außerhalb einer Methode deklariert
 * - Hat Zugriff auf alle Attribute und Methoden der äußeren Klasse
 * - Sichtbarkeit spielt keine relevanz
 * - Exisitiert nur im Kontext der äußeren Klasse
 * - Will man auf die Instanzen der äußeren Klasse benutzt man A.this
 * 
 * Lokale Klassen/local class
 * - Innerhalb einer Methode deklariert und nur dort benutzbar
 * - Äußere Klasse kann nicht auf die innere Klasse zugreifen
 * - Innere Klasse kann auf Attribute der äußeren Klasse zugreifen
 * - Können durch Methoden weitergegeben werden, z.B. durch: public static Object methode()...
 *  
 *  Anonyme Klassen
 *  - Hat keinen Namen -> man kann keine Instanzen der Klasse bilden
 *  - Wird innerhalb einer Methode deklariert
 *  - Wird benötigt wenn meine eine bestimmte Methode einer Klasse möchte, ohne sie zu instanziieren
 *  - Kann Methoden einer Klasse ersetzen
 *  - Angewandt für Action Listener, sortieren von Objekten(sort()) Folie 25, 
 */


public class verschachtelteMain {
	
	public void main(String args[]) {
		new A().new B();
		A a = new A();
		//B b = a.new B(); //Geht nicht
	}

}
