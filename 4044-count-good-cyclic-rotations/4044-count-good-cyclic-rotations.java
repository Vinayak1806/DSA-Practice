class Solution {

    public int countGoodRotations(int[] nums) {

        int n = nums.length;
        int half = n / 2;

        long total = 0;

        for (int num : nums) {
            total += num;
        }
        long firstSum = 0;

        for (int i = 0; i < half; i++) {
            firstSum += nums[i];
        }

        int ans = 0;

        for (int start = 0; start < n; start++) {

            
            if (firstSum > total - firstSum) {
                ans++;
            }

          
            int remove = nums[start];
            int add = nums[(start + half) % n];

            firstSum = firstSum - remove + add;
        }

        return ans;
    }
}