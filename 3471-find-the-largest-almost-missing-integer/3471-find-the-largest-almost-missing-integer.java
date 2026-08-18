class Solution {
    public int largestInteger(int[] nums, int k) {
        int res=-1;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==1)
        {
            for(int i=0;i<nums.length;i++)
            {
             if(map.get(nums[i])==1)
             {
                res=Math.max(res,nums[i]);
             }
            }
        }
        else if(k==nums.length)
        {
            for(int i=0;i<nums.length;i++)
            {
                res=Math.max(res,nums[i]);
             }
        }

        else 
        {
                if(map.get(nums[0])==1)
                {
                    res=Math.max(res,nums[0]);
                }
                 if(map.get(nums[nums.length-1])==1)
                {
                    res=Math.max(res,nums[nums.length-1]);
                }

        }
    return res;
    
}
}