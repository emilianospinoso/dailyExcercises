package a05ClosesStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloseSolutionTest {

    @Test
    void closeStrings() {
        CloseSolution cs = new CloseSolution();
        String word1 = "cabbba", word2 = "abbccc";
        assertTrue(cs.closeStrings(word1, word2));

    }
}