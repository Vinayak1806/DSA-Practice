class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (!st.empty() && st.peek()[0] == ch) 
            {
                st.peek()[1]++;

                if (st.peek()[1] == k) {
                    st.pop();
                }
            } else {
                st.push(new int[]{ch, 1});
            }
        }

        StringBuilder res = new StringBuilder();

        for (int[] pair : st) {
            char ch = (char) pair[0];

            for (int j = 0; j < pair[1]; j++) {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
