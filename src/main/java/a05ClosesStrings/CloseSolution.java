package a05ClosesStrings;

import java.util.*;

public class CloseSolution {


    public boolean closeStrings(String word1, String word2) {
        // Verifica si las longitudes de las cadenas son diferentes
        if (word1.length() != word2.length()) {
            return false;
        }

        // Crea mapas para contar las ocurrencias de caracteres en ambas cadenas
        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();

        // Llena el mapa de la primera palabra
        for (char c : word1.toCharArray()) {
            word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        }

        // Llena el mapa de la segunda palabra
        for (char c : word2.toCharArray()) {
            word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        }

        // Verifica si los conjuntos de caracteres son iguales
        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        // Crea listas con las frecuencias de los caracteres en ambas cadenas
        List<Integer> word1FrequencyList = new ArrayList<>(word1Map.values());
        List<Integer> word2FrequencyList = new ArrayList<>(word2Map.values());

        // Ordena las listas de frecuencias
        Collections.sort(word1FrequencyList);
        Collections.sort(word2FrequencyList);

        // Verifica si las listas de frecuencias ordenadas son iguales
        return word1FrequencyList.equals(word2FrequencyList);
    }
}
