package BasicStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a02RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> uniques = new ArrayList<>();


        Stream<Integer> arrStr= Stream.of(1,2,3,4,2);
        List<Integer> listint = Arrays.asList(1,2,3,4,2);
        List<Integer> listStreamArra = Stream.of(1,2,3,4,5,2).collect(Collectors.toList());

        uniques= listint.stream()  .distinct().collect(Collectors.toList());

        uniques.forEach(System.out::println);

    }

}
