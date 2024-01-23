package BasicStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class a05StreamsConcatArrays {
    public static void main(String[] args) {
        String[] names = {"juan", "maria", "SOmingo"};
        String[] names2 = {"richard", "Jose", "lopes"};

        String[] namesConcat = Stream.concat(
                Stream.of(names), Stream.of(names2)
        ).toArray(x -> new String[x]);

        Arrays.asList(namesConcat).forEach(System.out::println);
    }
}
