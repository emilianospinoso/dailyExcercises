package excercise03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MapSolutionTest {
    @Test
    void returnNotDelivered() {
        int[] requested = {11, 2, 4, 11, 11, 2, 3};
        int[] delivered = {2, 4, 2, 11};
        Set<Integer> expected = Set.of(3, 11);
        MapSolution ms = new MapSolution();
        Set<Integer> result = ms.returnNotDelivered(requested, delivered);
        assertEquals(expected, result);
    }

    @Test
    void returnNotDelivered2() {
        int[] requested = {};
        int[] delivered = {2, 4, 2, 11};
        Set<Integer> expected = Set.of();
        MapSolution ms = new MapSolution();
        Set<Integer> result = ms.returnNotDelivered(requested, delivered);
        assertEquals(expected, result);

    }
}