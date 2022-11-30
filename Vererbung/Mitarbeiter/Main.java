package Mitarbeiter;
/*
 * Alle Klassen erben von Oberklasse Object
 * 
 * Statischer Typ:
 * Deklarierter Typ
 * Bestimmt, welche Methoden und Felder über die Variable sichtbar sind
 * Kann nicht geändert werden
 * 
 * Dynamischer Typ:
 * Referenzierter Typ
 * Bestimmt welche Methoden letzendlich aufgerufen werden
 * Kann sich ändern
 * 
 * Deklarierte Variable befindet sich auf dem Stack
 * Insnazender Variable befinden sich auf dem Heap
 * 
 * Die Entscheidung, welche Methode benutzt wird, muss zur Laufzeit anhand des Objekttyps getroffen werden
 * ->man spricht hier von Dynamic bzw. Late Binding (bei Overriding)
 * 
 * Liskovsche Substitutionsprinzip:
 * Was mit der Superklasse geht, muss auch mit jeder Subklasse gehen
 */

public class Main {

	public static void main(String[] args) {
		
		Mitarbeiter mi = new Manager("Oleg","A"); //Objektinstanz/Objektvariable
		//statischer Typ 	dynamischer Typ
		
		Manager ma0 = new Manager("Kevin","B");
		
		//Manager ma2 = (Manager) new Mitarbeiter("Dennis");
		//Manager ma2 = new Mitarbeiter("Dennis");
		
		//Manager ma3 = mi;
		Mitarbeiter ma4 = mi;
		Mitarbeiter ma5 = ma0;
		
		System.out.println(mi.test());//Manager Methode
		//System.out.println(ma0.test());//Manager Methode
		//System.out.println(ma5.test());//Manager Methode

	}

}
