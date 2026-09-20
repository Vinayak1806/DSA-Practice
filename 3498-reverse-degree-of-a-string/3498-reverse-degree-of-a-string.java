class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int reversePosition = 26 - (s.charAt(i) - 'a');
            int position = i + 1;

            sum += reversePosition * position;
        }

        return sum;
    }
}