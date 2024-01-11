package searchInsertPosition;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
       /*   SORTED.
       1-Brute Force: Iterate over the array.    0(N)     o1
       2-
       //BEGIN WITH TWO POINTERS, left and right*/
        int left = 0;
        int right = nums.length - 1;

        //iterate while left<=right
        while (left <= right) {
            int midPoint = left + (right - left) / 2;
            if (target == nums[midPoint]) {
                return midPoint;
            } else if (target > nums[midPoint]) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;
            }
        }
        return left;
    }
}
