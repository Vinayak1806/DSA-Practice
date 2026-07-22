class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int [] result = new int[nums.length];
        int k=0;

        while(k < nums.length)
        {
        int count=0;

          for (int i =0 ;i<nums.length;i++)
          {
              if (nums[k]>nums[i])
              {
                  count++;
              }
            }
            result [k] = count;
            k++;
        }

        return result;
    }
}