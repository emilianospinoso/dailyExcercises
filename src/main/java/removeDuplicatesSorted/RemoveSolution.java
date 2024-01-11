package removeDuplicatesSorted;

public class RemoveSolution {

    public int[] removeDups(int[] nums) {
        System.out.println("aaa");
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            //iterate and look if i == i+1
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = nums[i];
            System.out.println(result[i]);
        }

        return result;
    }
}
