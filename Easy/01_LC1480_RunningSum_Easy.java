// LeetCode 1480 - Running Sum of 1D Array
class LC1480_RunningSum_Easy {
    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
