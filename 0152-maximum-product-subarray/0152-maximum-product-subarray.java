class Solution {
    public int maxProduct(int[] nums) {

        int maxvalue = nums[0];
        int minvalue = nums[0];
        int answer = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int v1=nums[i];
            int v2=maxvalue*nums[i];
            int v3=minvalue*nums[i];

            maxvalue=Math.max(v1,Math.max(v2,v3));
            minvalue=Math.min(v1,Math.min(v2,v3));

            answer=Math.max(answer,Math.max(maxvalue,minvalue));
        }
        return answer;
    }
}