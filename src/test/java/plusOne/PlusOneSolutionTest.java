package plusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneSolutionTest {

    @Test
    void plusOne() {
        int[] digits = {1,4,3};
        int[] expected={1,4,4};
        PlusOneSolution po = new PlusOneSolution();
        assertArrayEquals(expected,po.plusOne(digits));
    }

    @Test
    void plusOne999() {
        int[] digits = {9,9,9};
        int[] expected={1,0,0,0};
        PlusOneSolution po = new PlusOneSolution();
        assertArrayEquals(expected,po.plusOne(digits));
    }
}