package a03MaxiumAvgSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionSlidingWindowTest {

    @Test
    void findMaxAverage() {
        SolutionSlidingWindow sd = new SolutionSlidingWindow();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected=12.75000;
        assertEquals(expected,sd.findMaxAverage(nums,k));
    }
}