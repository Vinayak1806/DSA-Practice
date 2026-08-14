class Solution {
    public int maximumLengthSubstring(String s) {
        int low =0;
        int maxi=0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int high =0;high<s.length();high++)
        {
            char ch = s.charAt(high);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>2)
            {
                char lower = s.charAt(low);
                map.put(lower,map.get(lower)-1);
                if(map.get(lower)==0)
                {
                    map.remove(lower);
                }
                low++;                
            }
            maxi=Math.max(maxi,high-low+1);
        }
        return maxi;
    }
}