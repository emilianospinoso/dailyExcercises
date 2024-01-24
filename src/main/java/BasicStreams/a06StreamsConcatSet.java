package BasicStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a06StreamsConcatSet {

    public static void main(String[] args) {
        Set<String> names1 = Stream.of("Emi", "Emi", "Carlo").collect(Collectors.toSet());
        List<String> names2 = Stream.of("Juan", "Maria", "Carlo").collect(Collectors.toList());

        //if i want to concat and dont want repeated:      //Use Collectors.toSet
        Set<String> nonRepeated = Stream.concat(names1.stream(), names2.stream()).collect(Collectors.toSet());

        nonRepeated.forEach(System.out::println);
    }


}
