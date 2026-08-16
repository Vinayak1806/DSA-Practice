class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left =0;
        int maxfreq=0;
        int maxlength=0;
        int required=0;

        int [] frequency = new int[26];

        for(int right=0; right<answerKey.length();right++)
        {
            frequency[answerKey.charAt(right) - 'A']++;

            maxfreq=Math.max(maxfreq,frequency[answerKey.charAt(right) - 'A']);

            required= (right-left+1) - maxfreq;

            while(required>k)
            {
                frequency[answerKey.charAt(left) - 'A']--;
                left++;
                required = (right - left + 1) - maxfreq;
            }
                maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}