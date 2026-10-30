class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       HashMap<Integer,Integer> map = new HashMap<>();

       int res[] = new int[k];
       
       for(int i = 0;i<nums.length;i++)
       {
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
        
       ArrayList<Integer> list = new ArrayList<>(map.keySet());

       Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

       for(int i = 0; i < k; i++)
       {
           res[i] = list.get(i);
       }

       return res;

    }
}