package a03MaxiumAvgSubarray;

public class SolutionSlidingWindow {

    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int left = 0;
        int right = k;
        double sum = 0;
        //first iteration
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avg = sum / k;
        System.out.println("The avg for the first k is " + avg);

        double auxSum = sum;
        while (right <= nums.length-1) {
            auxSum+=nums[right];
            auxSum-=nums[left];
            right++;
            left++;
            sum=Double.max(auxSum,sum);
        }
        avg = sum / k;
        System.out.println("The avg for the final is " + avg);

        return avg;
    }
}
