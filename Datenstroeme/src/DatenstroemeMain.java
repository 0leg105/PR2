
/*
    Collection-Hierarchie
    - Gehört zum Iterable Interface (alles was iterierbar ist)
    - Hat Subklassen: Queue, List, Set

    Collection:
    - Erlauben Sammlungen gleichartiger Objekte
    - unübersichtlich
    - redundant durch "Boilerplate-Code"
    - schwer parallelisierbar

    stream()/Stream.of(...)
    - Stream einer Collection erhalten
    - Iterieren durch Collection
    - Filtern Einträge
    - Fügen Collections zusammen
    - Spalten Collections auf
    - Wandeln Collections um

    collect()
    - Sammelt Elemente aus Stream und packt sie in eine neue Datenstruktur

    aggregieren
    - Daten von Streams in einen einzigen Wert aggregieren

    reduce()
    - Daten von Streams können in einen Wert zusammengefasst werden
    - Terminal Operation
    - Braucht zwei Parameter
        - T identity: Startwert
        - BinaryOperator<T>: Funnktion wie die Reduktion erfolgen soll

 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class DatenstroemeMain {

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5};
        IntStream.of(array).forEach(System.out::println);

        Stream<String> stream = Stream.of("Oleg", "Shueam", "Dennis");
        stream.forEach(System.out::println);

        //Filter
        List<String> namen = Arrays.asList("Oleg", "Shueam", "Dennis", "Daniel");
        namen.stream().filter(name-> name.startsWith("D")).forEach(System.out::println); // Stream.of(namen) geht nicht

        //Objekt Shcuaspieler Beispiel Stream
        Stream<Schauspieler> streamSchauspieler = Stream.of(
                new Schauspieler("John Travolta", "Pulpfiction"),
                new Schauspieler("Brad Pitt", "Fight Club"));
        streamSchauspieler
                .map(Schauspieler::getName).forEach(System.out::println);

        //collect()
        Stream<String> namenStream = Stream.of("Kevin", "Dennis", "Phillip", "Moritz", "Oleg", "Daniel");
        List<String> namenListe = namenStream.collect(toCollection(LinkedList::new)); //Collectors.toList());
        namenListe.forEach(System.out::println);

        //filter()
        Stream<String> namenStream2 = Stream.of("Kevin", "Dennis", "Phillip", "Moritz", "Oleg", "Daniel");
        namenStream2.filter(name -> name.startsWith("D")).forEach(System.out::println); //Filtert Namen mit D

        //aggregieren
        Stream<Double> doubleStream = Stream.of(3.0, 2.0, 1.0, 0.0);
        double average = doubleStream.collect(averagingDouble(e -> e));
        System.out.println(average);

        Stream<String> stringStream = Stream.of("1", "5", "6");
        int summe = stringStream.collect(summingInt(zahl -> Integer.parseInt(zahl)));
        System.out.println(summe);

        //reduce()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int summe2 = integerStream.reduce(0, (sum, value) -> sum + value);
        System.out.println(summe2);
    }
}