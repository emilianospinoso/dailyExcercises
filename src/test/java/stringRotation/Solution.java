package stringRotation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> output = new ArrayList(); // Lista para almacenar el conjunto de soluciones
    int n, k; // Variables para la longitud de la entrada y la longitud de las combinaciones

    // Método de backtracking para generar todas las combinaciones posibles
    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        // Si la combinación está completa
        if (curr.size() == k) {
            output.add(new ArrayList(curr)); // Agrega una copia de la combinación actual a la lista de soluciones
            return; // Retorna, ya que se ha alcanzado la longitud deseada
        }

        // Itera sobre los elementos restantes
        for (int i = first; i < n; ++i) {
            // Agrega el elemento i a la combinación actual
            curr.add(nums[i]);

            // Utiliza los siguientes enteros para completar la combinación
            backtrack(i + 1, curr, nums);

            // Backtrack: deshace la adición del último elemento para explorar otras combinaciones
            curr.remove(curr.size() - 1);
        }
    }

    // Método principal que genera todos los subconjuntos posibles
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length; // Obtiene la longitud de la entrada
        for (k = 0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<Integer>(), nums); // Inicia el proceso de backtracking con diferentes longitudes de combinación
        }
        return output; // Retorna el conjunto de soluciones
    }
}
