package stringRotation;

import java.util.ArrayList;
import java.util.List;

class Combinations {
    private int n; // Variable de instancia para almacenar el valor superior del rango
    private int k; // Variable de instancia para almacenar la longitud de las combinaciones

    // Método principal que inicia el backtracking
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        List<List<Integer>> ans = new ArrayList<>(); // Lista para almacenar las combinaciones resultantes
        backtrack(new ArrayList<>(), 1, ans); // Inicia el backtracking con una lista vacía, el primer número y la lista de respuestas
        return ans; // Devuelve todas las combinaciones posibles
    }

    // Método recursivo de backtracking para generar combinaciones
    public void backtrack(List<Integer> curr, int firstNum, List<List<Integer>> ans) {
        // Verifica si la longitud de la combinación actual es igual a k
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr)); // Si es así, agrega una copia de la combinación actual a la lista de respuestas
            return; // Retorna, ya que se ha alcanzado la longitud deseada
        }

        // Itera sobre los números desde firstNum hasta n
        for (int num = firstNum; num <= n; num++) {
            curr.add(num); // Agrega el número actual a la combinación
            backtrack(curr, num + 1, ans); // Llamada recursiva con la combinación actual y el siguiente número como firstNum
            curr.remove(curr.size() - 1); // Deshace la adición del número actual para explorar otras combinaciones
        }

        return; // Retorna al llamante después de explorar todas las combinaciones posibles
    }
}

