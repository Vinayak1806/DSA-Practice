class Solution {
    public boolean canJump(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++)
        {
            if(i>sum)
            {
                return false;
            }
            sum = Math.max(sum, i + nums[i]);
        }
        return true;
    }
}