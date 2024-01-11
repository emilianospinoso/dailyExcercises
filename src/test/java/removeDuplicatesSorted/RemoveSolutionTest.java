package removeDuplicatesSorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSolutionTest {

    @Test
    void removeDups() {
        int[] nums = {1,2,3,3,4,5,5,6};
        int[] expect={1,2,3,4,5,6};
        RemoveSolution rs= new RemoveSolution();
        assertArrayEquals(expect,rs.removeDups(nums));
    }
}