package a04MaximumVowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionSWTest {

    @Test
    void maxVowels() {
        SolutionSW sw = new SolutionSW();
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        assertEquals(expected, sw.maxVowels(s, k));
    }
    @Test
    void maxVowels2() {
        SolutionSW sw = new SolutionSW();
        String s = "aeiou";
        int k = 2;
        int expected = 2;
        assertEquals(expected, sw.maxVowels(s, k));
    }

    @Test
    void maxVowels3() {
        SolutionSW sw = new SolutionSW();
        String s = "leetcode";
        int k = 3;
        int expected = 2;
        assertEquals(expected, sw.maxVowels(s, k));
    }

}