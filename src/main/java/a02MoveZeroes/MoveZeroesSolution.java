package a02MoveZeroes;

public class MoveZeroesSolution {


    public int[] moveZeroes(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]==0&&nums[right]!=0){
                nums[left]=nums[right];
                nums[right]=0;
                left++;
                right++;
            } else if (nums[left]==0&&nums[right]==0) {
                right++;
            }
        }
        for (int num:nums){
            System.out.println(num);
        }

        return nums;
    }
}
