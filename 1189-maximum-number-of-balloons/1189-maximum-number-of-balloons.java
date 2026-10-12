class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();

        String s = "balloon";
        int res = Integer.MAX_VALUE;

        for(int i=0;i<text.length();i++)
        {
            char ch =text.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            have.put(ch,have.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);

            int fneed = need.getOrDefault(ch,0);
            int fhave =have.get(ch);

            int time= fneed/fhave;

            res=Math.min(res,time);
        }
        return res;

    }
}