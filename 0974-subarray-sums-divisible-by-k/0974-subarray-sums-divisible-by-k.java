class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int[] freq = new int[k];

        // Remainder 0 has already appeared once
        freq[0] = 1;

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            int remainder = (prefixSum % k + k) % k;

            // If we have seen this remainder before,
            // those previous prefix sums form valid subarrays
            count += freq[remainder];

            // Store this remainder
            freq[remainder]++;
        }

        return count;
    }
}