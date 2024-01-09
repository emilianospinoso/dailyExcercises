package a02MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesSolutionTest {

    @Test
    void testSolution(){
        MoveZeroesSolution move = new MoveZeroesSolution();
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        assertArrayEquals(expected, move.moveZeroes(nums));
    }

    @Test
    void testZeroSolution(){
        MoveZeroesSolution move = new MoveZeroesSolution();
        int[] nums = {0};
        int[] expected = {0};
        assertArrayEquals(expected, move.moveZeroes(nums));
    }
}