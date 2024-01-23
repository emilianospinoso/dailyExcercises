package excercise02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VelocityStreams3 {
    //Return intersections
    public static void main(String[] args) {
        List<Integer> intersections = new ArrayList<>();
        int[] list1 = {10, 35, 14};
        int[] list2 = {90, 35, 10, 14, 28};
        intersections=returnIntersections(list1,list2);
        intersections.forEach(System.out::println);
    }

    public static List<Integer> returnIntersections(int[] list1, int[] list2) {
        List<Integer> intersections = new ArrayList<>();
        intersections = Arrays.stream(list1).filter(x -> Arrays.stream(list2).anyMatch(y-> x==y))
                .boxed()
                .collect(Collectors.toList());

        return intersections;
    }

    /*
  We have two lists, ‘first’ and ‘second'. Write a function that returns the intersection of these lists.
That is, return a list with the elements that are in both. If there are no common elements, return an empty list.

Examples with correct outputs:

intersection([1, 2, 3], [9, 3, 4]) → [3]

intersection([10, 35, 14], [90, 35, 10, 14, 28]) → [10, 35, 14]*/
}
