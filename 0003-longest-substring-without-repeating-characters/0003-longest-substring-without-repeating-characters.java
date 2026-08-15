class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int result=0;
    HashMap<Character,Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++)
        {
            char hg= s.charAt(high);
            map.put(hg,map.getOrDefault(hg,0)+1);

            int k = high-low+1;
            while(map.get(hg)>1)
            {
                char lw= s.charAt(low);
                map.put(lw,map.get(lw)-1);
                if(map.get(lw)==0)
                {
                    map.remove(low);
                }
                low++;
                k = high-low+1;
            }
            result=Math.max(result,high-low+1);
        }
        return result;
    }
}