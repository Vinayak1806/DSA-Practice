class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int low = 0;
       long sum=0;
       long result=0;

       for(int i=0;i<k;i++)
       {
        sum=sum+nums[i];
       }
       result=sum;
       for(int i=k; i<nums.length;i++)
       {
        result=Math.max(result,sum);
        sum=sum-nums[i-k]+nums[i];
        
       }
       result=Math.max(result,sum);
       return (double)result/k;
    }
}