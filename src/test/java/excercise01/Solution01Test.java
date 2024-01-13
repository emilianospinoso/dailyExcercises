package excercise01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution01Test {

    @Test
    void findMissingProducts() {
        int[] requested = {11, 2, 4, 11, 11, 2, 3};
        int[] delivered = {2, 4, 2, 11};
        List<Integer> expected= Arrays.asList(3, 11);
        Solution01 s1= new Solution01();
    }


}