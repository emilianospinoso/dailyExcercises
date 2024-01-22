package func01;

import java.util.List;
import java.util.stream.Collectors;

public class Clase02 {
    public static void main(String[] args) {
        List<Integer> array1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> array2 = List.of(3, 5, 7, 9);

        List<Integer> intersections = array1.stream().filter(array2::contains)
                .collect(Collectors.toList());
        intersections.forEach(System.out::println);
    }

}
