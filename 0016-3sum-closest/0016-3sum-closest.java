class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int maxi = 0;
        int maxDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diff = Math.abs(sum - target);

                if (diff < maxDiff) {
                    maxDiff = diff;
                    maxi = sum;
                }

                if (sum < target) {
                    left++;
                } else  {
                    right--;
                }
            }
        }
        return maxi;
    }
}