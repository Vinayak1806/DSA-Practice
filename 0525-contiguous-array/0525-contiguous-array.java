import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int zero = 0;
        int one = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }

            int diff = zero - one;

            if (diff == 0) {
                result = Math.max(result, i + 1);
            }

            if (map.containsKey(diff)) {

                int len = i - map.get(diff);
                result = Math.max(result, len);

            } else {
                map.put(diff, i);
            }
        }

        return result;
    }
}