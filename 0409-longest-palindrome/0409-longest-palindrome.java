class Solution {
    public int longestPalindrome(String s) {
        int maxlen=0;
        int sum =0;

        HashMap<Character,Integer> map =new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : map.keySet())
        {
            if(map.get(ch) % 2 == 0)
            {
                sum += map.get(ch);
            }
            else{
                sum += map.get(ch)-1;
                maxlen = 1;
            }
        }
        return sum + maxlen;
    }
}