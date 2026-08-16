class Solution {
    public int longestOnes(int[] nums, int k) {
      int required=0;
      int low=0;
      int result=0;

      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==0)
        {
            required++;
        }
        while(required>k)
        {
            if(nums[low]==0)
            {
                required--;
            }
            low++;
        }
        result = Math.max(result,i-low+1);
      } 
      return result;     
    }
}