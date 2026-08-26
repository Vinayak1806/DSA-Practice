class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int low = 0;
        int count = 0;
        int result = s.length();
        int start = 0;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                count++;
            }
            while (count == k) {
                flag = true;
                int len = i - low + 1;

                if (result > len) 
                {
                    start = low;
                    result = len;
                } 
                else if (result == len) 
                {
                    String current = s.substring(low, i + 1);
                    String previous = s.substring(start, start + result);

                    if (current.compareTo(previous) < 0) {
                        start = low;
                    }
                }

                if (s.charAt(low) == '1') {
                    count--;
                }

                low++;
            }
        }

        if (flag) {
            return s.substring(start, start + result);
        }

        return "";
    }
}