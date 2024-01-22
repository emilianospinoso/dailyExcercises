package func01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase03 {
    public List<Integer> intersections(List<List<Integer>> listas) {
        List<Integer> intersections = new ArrayList<>();
        intersections = listas.get(0).stream().filter(x -> listas.get(1).contains(x)).
                collect(Collectors.toList());

        return intersections;
    }
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