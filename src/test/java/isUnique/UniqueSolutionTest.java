package isUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueSolutionTest {

    @Test
    void isUnique() {
        String input = "aekjdnf";
        UniqueSolution us = new UniqueSolution();
        assertTrue(us.isUnique(input));
    }

    @Test
    void isUnique2() {
        String input2 = "aaeiuo";
        UniqueSolution us = new UniqueSolution();
        assertFalse(us.isUnique(input2));
    }

    @Test
    void isUnique3() {
        String input2 = "";
        UniqueSolution us = new UniqueSolution();
        assertTrue(us.isUnique(input2));
    }
}