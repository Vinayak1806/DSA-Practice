class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int low = 0 ;
        int high = 0;
        long product = 1;
        int count=0;
        if(k<=1)
        {
            return 0;
        }
        while(high<nums.length)
        {

            product = product*nums[high];            
            
            while(product>=k)
            {
                product=product/nums[low];
                low++;
            }
            count = count + (high - low + 1);
         high++;
        }
      return count;
    }
}