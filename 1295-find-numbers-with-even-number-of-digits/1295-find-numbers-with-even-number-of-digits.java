class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            int count = 0;

            while (num != 0) {
                num = num / 10;
                count++;
            }

            if (count % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}