class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        long mid;
        int ans = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid * mid == x) 
            {
                return (int) mid;
            } 
            else if (mid * mid > x) 
            {
                right = (int) mid - 1;
            } 
            else 
            {
                ans = (int) mid;
                left = (int) mid + 1;
            }
        }

        return ans;
    }
}
