class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        int count =0;
        StringBuilder res = new StringBuilder();
        

        for(int i=0;i<n;i++)
        {
            char ch = num.charAt(i);
            
            while(!st.empty() && ch <st.peek() && k >0)
            {
                
                st.pop();
                k--;
            }            
            st.push(ch);        
        }
            while (!st.empty() && k > 0) {
            st.pop();
            k--;
            }

            while (!st.empty()) {
            res.append(st.pop());
            }
            res.reverse();

        
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        return res.length() == 0 ? "0" : res.toString();
    }
}