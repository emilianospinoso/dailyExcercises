package excercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VelocityStreams {

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(10, 35, 14);
        List<Integer> lista2 = List.of(90, 35, 10, 14, 28);
        // [10, 35, 14]
        System.out.println(intersections(lista1, lista2));
    }

    static List<Integer> intersections(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersections = new ArrayList<>();

        intersections = list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toList());

        return intersections;
    }

    /*
  We have two lists, ‘first’ and ‘second'. Write a function that returns the intersection of these lists.
That is, return a list with the elements that are in both. If there are no common elements, return an empty list.

Examples with correct outputs:

intersection([1, 2, 3], [9, 3, 4]) → [3]

intersection([10, 35, 14], [90, 35, 10, 14, 28]) → [10, 35, 14]

intersection([100, 25, 134, 2, 4], [4, 2]) → [4, 2]

intersection([10, 35, 14], []) → []

intersection([10, 35, 14], [1, 2, 3]) → []
 */
}
