package stringRotation;

public class MinimumPath {
    // Matriz de direcciones posibles: derecha, abajo, izquierda, arriba
    int directions[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int minSumSoFar = Integer.MAX_VALUE; // Variable para rastrear la menor suma encontrada hasta ahora

    // Método principal para encontrar el camino con la menor suma de valores
    public int minimumSumPath(int[][] heights) {
        return backtrack(0, 0, heights, heights.length, heights[0].length, 0);
    }

    // Método de backtracking
    int backtrack(int x, int y, int[][] heights, int row, int col, int currentSum) {
        // Si se alcanza la celda inferior derecha
        if (x == row - 1 && y == col - 1) {
            minSumSoFar = Math.min(minSumSoFar, currentSum); // Actualiza la menor suma encontrada hasta ahora
            return currentSum; // Retorna la suma actual
        }

        int currentValue = heights[x][y]; // Almacena el valor actual antes de cambiarlo
        heights[x][y] = 0; // Marca la celda actual como visitada (valor cero)

        int minPathSum = Integer.MAX_VALUE; // Variable para almacenar la menor suma de valores encontrada

        // Itera sobre las direcciones posibles
        for (int i = 0; i < 4; i++) {
            int adjacentX = x + directions[i][0];
            int adjacentY = y + directions[i][1];

            // Verifica si la celda adyacente es válida y no ha sido visitada
            if (isValidCell(adjacentX, adjacentY, row, col) && heights[adjacentX][adjacentY] != 0) {
                int currentAdjacentValue = heights[adjacentX][adjacentY];
                int currentSumWithAdjacent = currentSum + currentAdjacentValue;

                // Verifica si la suma actual con la celda adyacente es menor a la menor suma encontrada hasta ahora
                if (currentSumWithAdjacent < minSumSoFar) {
                    // Llama recursivamente a backtrack para explorar la celda adyacente
                    int result = backtrack(adjacentX, adjacentY, heights, row, col, currentSumWithAdjacent);
                    minPathSum = Math.min(minPathSum, result); // Actualiza la menor suma de valores encontrada
                }
            }
        }

        heights[x][y] = currentValue; // Restaura el valor original en la celda actual
        return minPathSum; // Retorna la menor suma de valores encontrada
    }

    // Método para verificar si una celda es válida
    boolean isValidCell(int x, int y, int row, int col) {
        return x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1;
    }


}
