class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int maxfreq=0;
        int maxlength=0;

        int [] frequency = new int[26];

        for(int right=0; right<s.length();right++)
        {
            frequency[s.charAt(right) - 'A']++;

            maxfreq=Math.max(maxfreq,frequency[s.charAt(right) - 'A']);

            int required= (right-left+1) - maxfreq;

            while(required>k)
            {
                frequency[s.charAt(left) - 'A']--;
                left++;
                required = (right - left + 1) - maxfreq;
            }
                maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}