package BasicStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a3ConcatTwoLists {
    //Create a List<String> from a String and concat two lists.
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista1 = Arrays.asList("HOla como estas".split(" ")); //create 3 elements
        lista2 = Arrays.asList("Ca", "mi", "la");

        List<String> lista3 = Stream.concat(lista1.stream(), lista2.stream()).collect(Collectors.toList());
        lista3.forEach(System.out::println);

    }
}
