class Solution {
    public int minSubarray(int[] nums, int p) {

        long total = 0;

        for (int num : nums) {
            total += num;
        }

        int target = (int)(total % p);

        if (target == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        long sum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = (int)(sum % p);

            int required = (rem - target + p) % p;

            if (map.containsKey(required)) {

                int length = i - map.get(required);

                minLength = Math.min(minLength, length);
            }

            // Keep the latest index
            map.put(rem, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}