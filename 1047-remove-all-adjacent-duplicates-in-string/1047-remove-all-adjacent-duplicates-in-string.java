class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack <Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<n;i++)
        {
            char ch = s.charAt(i);

            if (!st.empty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        while(!st.empty())
        {
            res.append(st.peek());
            st.pop();
        }
        return res.reverse().toString();
        
    }
}