package excercise01;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionMondayTest {

    @Test
    void pendings() {
        int[] requested = {11, 2, 4, 11, 11, 2, 3};
        int[] delivered = {2, 4, 2, 11};
        Set<Integer> expected = Set.of(3, 11);
        SolutionMonday sm = new SolutionMonday();
        assertEquals(expected, sm.pendings(requested, delivered));
    }
}