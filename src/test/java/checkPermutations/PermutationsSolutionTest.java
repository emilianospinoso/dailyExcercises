package checkPermutations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsSolutionTest {

    @Test
    void isPermutation() {
        String s1 = "AGUSTINA";
        String s2 = "ANGUSTIA";
        PermutationsSolution ps = new PermutationsSolution();
        assertTrue(ps.isPermutation(s1, s2));
    }
}