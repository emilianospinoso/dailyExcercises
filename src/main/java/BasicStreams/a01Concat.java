package BasicStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a01Concat {
    public static void main(String[] args) {//Concat 2 listas

        Stream<Integer> list1 = Stream.of(1, 2, 3);
        Stream<Integer> list2 = Stream.of(3, 4, 5);
        Stream<Integer> list1and2 = Stream.concat(list2, list1);
        list1and2.forEach(System.out::println);

        List<Integer> lista1 = Stream.of(1, 2, 3).collect(Collectors.toList());
        List<Integer> lista2 = Arrays.asList(3, 4, 5);

        List<Integer> listaConcatenada = Stream.concat(lista1.stream(), lista2.stream()).collect(Collectors.toList());


    }
}
