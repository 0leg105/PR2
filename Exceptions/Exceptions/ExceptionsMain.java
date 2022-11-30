package Exceptions;
/*
 * Unchecked:
 * - Errors und RuntimeExceptions sind unchecked
 * - Errors können gecachet werden, Programmablauf kann aber nicht geändert werden
 * - Errors können zu Datenverlust und Programmabsturz führen
 * - RuntimeExceptions deuten auf fehlerhaften Code (for-Schleife, durch 0 teilen...)
 * 
 * Checked:
 * - IoException sind checked Exceptions
 * - z.B. Dateizugriff
 * - können durch Try/Catch korrigiert werden
 * 
 * Throwable ist die Oberklasse von Exceptions und Errors
 * - Methode: getMessage()-> Fehlermeldung abfragen
 * 
 * Stack-Trace:
 * - Bei Fehlermeldung von oben nach unten durcharbeiten, um zu sehen woher der Fehler kommt
 * 
 * Handle-or-Declare-Prinzip:
 * - Leere Catch Blöcke vermeiden
 * ->Checked Exception muss behandelt oder weitergegeben werden
 * 
 * Folgende Konstruktionen sollen vermieden werden:
 * - Unnötig lange try-Blöcke -> nur Code umfasseden, der den Fehler erzeugen kann
 * - Catchen von Exception oder Throwable -> vermeiden, da man sinst die Subklasse RuntimeException fangen kann
 * - Leere Catch-Blöcke -> behandeln nicht ignorieren
 */


public class ExceptionsMain {

}
