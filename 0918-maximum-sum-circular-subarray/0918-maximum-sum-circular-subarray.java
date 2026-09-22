class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmax = nums[0];
        int maxsum = nums[0];

        int currentmin = nums[0];
        int minsum = nums[0];

        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentmax = Math.max(nums[i], currentmax + nums[i]);
            maxsum = Math.max(maxsum, currentmax);

            currentmin = Math.min(nums[i], currentmin + nums[i]);
            minsum = Math.min(minsum, currentmin);

            total += nums[i];
        }
        
        if (maxsum < 0) {
            return maxsum;
        }

        int result = Math.max(maxsum, total - minsum);

        return result;
    }
}