package exercicios.src.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<Object> println = System.out::println;

        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
        langs.forEach(println);

        String[] maisLangs = { "Python", "Lisp", "Perl", "Go\n"};
        Stream.of(maisLangs).forEach(println);
        Arrays.stream(maisLangs).forEach(println);

        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(println);
        outrasLangs.parallelStream().forEach(println);

        //Stream.generate(() -> "a").forEach(println);
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
