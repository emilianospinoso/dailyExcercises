package searchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertTest {

    @Test
    void searchInsert() {
    int[] nums = {1,3,5,6};
    int target= 5;
    int expect=2;
    SearchInsert si = new SearchInsert();
    assertEquals(expect,si.searchInsert(nums,target));
    }
}