class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int cmax = nums[0];
        int maxSum = nums[0];

        int cmin = nums[0];
        int minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            total += nums[i];

            if (i > 0) {
                cmax = Math.max(nums[i], cmax + nums[i]);
                maxSum = Math.max(maxSum, cmax);

                cmin = Math.min(nums[i], cmin + nums[i]);
                minSum = Math.min(minSum, cmin);
            }
        }

       
        if (maxSum < 0) {
            return maxSum;
        }

      
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}