class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int freq[] = new int[26];
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            freq[curr - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char mid = 'a';
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            for (int j = 0; j < freq[i] / 2; j++) {
                sb.append(c);
            }
            if (freq[i] % 2 == 1) {
                mid = c;
            }
        }
        
        String second = new StringBuilder(sb).reverse().toString();

        if (n % 2 == 1)
            sb.append(mid);

        sb.append(second);
        return sb.toString();
    }
}