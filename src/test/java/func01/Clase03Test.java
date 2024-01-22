package func01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Clase03Test {

    @Test
    void intersections() {
        Clase03 c3 = new Clase03();
        List<List<Integer>> inp = new ArrayList<>();
        inp.add(Arrays.asList(1, 2, 3, 4));
        inp.add(Arrays.asList(2, 4, 5, 8));
        List<Integer> expected = Arrays.asList(2,4);
        assertEquals(expected,c3.intersections(inp));
    }

    @Test
    void intersections2() {
        Clase03 c3 = new Clase03();
        List<List<Integer>> inp = new ArrayList<>();
        inp.add(Arrays.asList(1, 2, 3, 4));
        inp.add(Arrays.asList());
        List<Integer> expected = Arrays.asList();
        assertEquals(expected,c3.intersections(inp));
    }
}

/*intersection() → [4, 2]

intersection([10, 35, 14], []) → []

 */