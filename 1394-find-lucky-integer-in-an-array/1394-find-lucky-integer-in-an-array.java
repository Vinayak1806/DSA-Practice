class Solution {
    public int findLucky(int[] arr) {
       
        int result = -1;
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int high=0;high<arr.length;high++)
        {
            map.put(arr[high],map.getOrDefault(arr[high],0)+1);
        }
            for(int i =0;i<arr.length;i++)
            {
                if(arr[i]==map.get(arr[i]))
                {
                    result=Math.max(result,arr[i]);
                }
            }        
        return result;
    }
}