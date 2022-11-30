/*
    Lambda Methoden
    - Funktionieren nur im Zusammenhang eines FunktionInterface
    - Das FunctionalInterface beinhaltet nur eine Methode wodurch das Lambda, weiß welche Methode benutzt wird
    - Sind kürzer als Anonyme Klassen

    Aufbau Bsp.:
    Mit Block:              (int a, int b) -> { int s = a + b; return s;}
    Ohne Typen:             (a, b) -> a + b; //return kann weggelassen werden
    Mit Typen:              (int a, int b) -> a + b;
    Ganz ohne Klammern:     a -> a * a; //Wenn nur ein Parameter übergeben wird
    Mit Klammern:           (a) -> a * a;
    Ohne Argumente:         () -> { System.out.println("Hallo");} //Wenn Methode keine Parameter erfordert

    "Funktionale Programmierung(Lambdas) beschreibt was passieren soll und nicht wie es passieren soll."

    Functional Interfaces
    BinaryOperator<T>:
    - Nimmt zwei Parameter vom Typ T und gibt ein Ergebnis vom Typ T zurück
    Consumer<T>:
    - Nimmt einen Parameter vom Typ T und gibt kein Ergebnis zurück
    Function<T,R>:
    - Nimmt einen Parameter vom Typ T und gibt ein Ergebnis von Typ R zurück
    Predicate<T>:
    - Nimmt einen Parameter von Typ T und gibt einen Wahrheitswert zurück
    Supplier<T>:
    - Nimmt keinen Parameter und gib ein Ergebnis vom Typ T zurück

    Closures
    - Werte aus Lambdas sind verfügbar, aber nach Erzeugung nicht veränderbar
    - this bezieht sich nicht auf das anonyme Objekt des Lambdas, sondern auf das umgebende Objekt

 */

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaMain {

    public static void main(String[] args){
     int c = 0; //Ist final, weil er von der Lambda Funktion benutzt wird(Closure)

        //Standard Lambda Beispiel
        Lambda f = (a, b) -> { //Oder mit Parametertyp Lambda f = (int a, int b) -> {
            return a + b + c; //Implementierung der Interface-Methode
        };

        //Anonyme Klasse
        Lambda g = new Lambda(){
            public int xyz(int a, int b){
                return a+b;
            }
        };

        //c = 2; //Kann nicht verändert werden, nach Lambda ausführung
        System.out.println(f.xyz(1,2));

        //List Beispiel
        // Consumer Interface
        List<Integer> li = Arrays.asList(0, 1, 2, 3, 4);
        li.forEach((Integer a) -> {
            System.out.println(a);
        });
        //oder
        li.forEach(System.out::println);
        //BinaryOperator Interface
        System.out.println(li.stream().reduce(0, (i, j) -> i + j));

        //Function Beispiel
        DoubleFunction<Long> abschneiden = (d) -> { return (long)d; };
        System.out.println(abschneiden.apply(3.131592));

        //Predicate
        IntPredicate erlaubnis = (alter) -> { return alter > 18; }; //Benötigt Import
        System.out.println(erlaubnis.test(1)); //test() führt Lambda Funktion aus

        //Supplier
        IntSupplier wuerfel = () -> { return (int)(Math.random() * 6 + 1); }; //Benötigt Import
        System.out.println(wuerfel.getAsInt());
    }

    //Darf nur eine Methode beinhalten
    @FunctionalInterface
    interface Lambda{
        public int xyz(int a, int b);
    }
}
