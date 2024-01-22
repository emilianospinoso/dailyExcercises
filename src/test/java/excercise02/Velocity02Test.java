package excercise02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Velocity02Test {

    @Test
    void getIntersections() {
        Velocity02 v2 = new Velocity02();
        List<Integer> lista1 = List.of(10, 35, 14);
        List<Integer> lista2 = List.of(90, 35, 10, 14, 28);
        List<Integer> expected = List.of(10, 35, 14);
        List<List<Integer>> listas = List.of(lista1, lista2);
        assertEquals(expected, v2.getIntersections(listas));

    }

    @Test
    void getIntersections222() {
        Velocity02 v2 = new Velocity02();
        List<Integer> lista1 = List.of(10, 35, 14);
        List<Integer> lista2 = List.of(90, 35, 10, 14, 28);
        List<Integer> expected = List.of(10, 35, 14);
        assertEquals(expected, v2.getIntersections(lista1,lista2));
    }
    @Test
    void getIntersections2() {
        Velocity02 v2 = new Velocity02();
        List<Integer> lista1 = List.of();
        List<Integer> lista2 = List.of(90, 35, 10, 14, 28);
        List<Integer> expected = List.of();
        List<List<Integer>> listas = List.of(lista1, lista2);
        assertEquals(expected, v2.getIntersections(listas));

    }

    @Test
    void getIntersections3() {
        Velocity02 v2 = new Velocity02();
        List<Integer> lista1 = List.of(10, 35, 14);
        List<Integer> lista2 = List.of();
        List<Integer> expected = List.of();
        List<List<Integer>> listas = List.of(lista1, lista2);
        assertEquals(expected, v2.getIntersections(listas));

    }
}