
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
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DatenstroemeMain {

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5};
        IntStream.of(array).forEach(System.out::println);

        Stream<String> stream = Stream.of("Oleg", "Shueam", "Dennis");
        stream.forEach(System.out::println);

        //Filter
        List<String> namen = Arrays.asList("Oleg", "Shueam", "Dennis", "Daniel");
        namen.stream().filter(name-> name.startsWith("D")).forEach(System.out::println); // Stream.of(namen) geht nicht
    }
}
