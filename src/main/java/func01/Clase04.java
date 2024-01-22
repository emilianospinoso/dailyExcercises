package func01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Clase04 {

    public static void main(String[] args) {
        //LIst.of no permite modificacione.
        List<Integer> results = new ArrayList<>();
        List<Integer> lista1 = List.of(1, 4, 7, 5, 9, 8);
        List<Integer> lista2 = Arrays.asList(1, 5, 8);
        List<Integer> lista3 = Arrays.asList(5, 6);
        List<List<Integer>> listados = new ArrayList<>(List.of(lista1, lista2, lista3));
        results = intersections(listados);
        results.forEach(System.out::println);

    }

    static List<Integer> intersections(List<List<Integer>> listas) {
        // Check if the input list is empty
        if (listas.isEmpty()) {
            return new ArrayList<>(); // Return an empty list if there are no input lists
        }
        // Initialize result with the first list
        List<Integer> result = listas.get(0);

        // Iterate over the input lists starting from the second list
        for (int i = 1; i < listas.size(); i++) {
            // Filter common elements between the current list and the result
            result = result.stream().filter(listas.get(i)::contains).collect(Collectors.toList());
        }

        // Return the final result
        return result;
    }
}
