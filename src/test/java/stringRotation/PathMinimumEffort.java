package stringRotation;

class PathMinimumEffort {
    // Método principal para encontrar el esfuerzo mínimo para viajar desde la celda superior izquierda hasta la inferior derecha
    public int minimumEffortPath(int[][] heights) {
        return backtrack(0, 0, heights, heights.length, heights[0].length, 0);
    }

    // Matriz de direcciones posibles: derecha, abajo, izquierda, arriba
    int directions[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int maxSoFar = Integer.MAX_VALUE; // Variable para rastrear el máximo esfuerzo encontrado hasta ahora

    // Método de backtracking
    int backtrack(int x, int y, int[][] heights, int row, int col, int maxDifference) {
        // Si se alcanza la celda inferior derecha
        if (x == row - 1 && y == col - 1) {
            maxSoFar = Math.min(maxSoFar, maxDifference); // Actualiza el máximo esfuerzo encontrado hasta ahora
            return maxDifference; // Retorna el esfuerzo actual
        }

        int currentHeight = heights[x][y]; // Almacena la altura actual antes de cambiarla
        heights[x][y] = 0; // Marca la celda actual como visitada (altura cero)

        int minEffort = Integer.MAX_VALUE; // Variable para almacenar el esfuerzo mínimo encontrado

        // Itera sobre las direcciones posibles
        for (int i = 0; i < 4; i++) {
            int adjacentX = x + directions[i][0];
            int adjacentY = y + directions[i][1];

            // Verifica si la celda adyacente es válida y no ha sido visitada
            if (isValidCell(adjacentX, adjacentY, row, col) && heights[adjacentX][adjacentY] != 0) {
                int currentDifference = Math.abs(heights[adjacentX][adjacentY] - currentHeight); // Calcula la diferencia de alturas actual
                int maxCurrentDifference = Math.max(maxDifference, currentDifference); // Calcula el máximo esfuerzo actual
                // Verifica si el máximo esfuerzo actual es menor al máximo encontrado hasta ahora
                if (maxCurrentDifference < maxSoFar) {
                    // Llama recursivamente a backtrack para explorar la celda adyacente
                    int result = backtrack(adjacentX, adjacentY, heights, row, col, maxCurrentDifference);
                    minEffort = Math.min(minEffort, result); // Actualiza el esfuerzo mínimo encontrado
                }
            }
        }

        heights[x][y] = currentHeight; // Restaura la altura original en la celda actual
        return minEffort; // Retorna el esfuerzo mínimo encontrado
    }

    // Método para verificar si una celda es válida
    boolean isValidCell(int x, int y, int row, int col) {
        return x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1;
    }
}
