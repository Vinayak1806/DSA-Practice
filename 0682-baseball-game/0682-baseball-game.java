class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st = new Stack<>();       
        int sum =0;
       for(int i=0; i<operations.length;i++)
       {
            String ch = operations[i];
            if(!st.empty() && ch.equals("C"))
            {
                st.pop();
            }

            else if(!st.empty() && ch.equals("D"))
            {
                int add = st.peek()*2;
                st.push(add);
            }
            else if(!st.empty() && ch.equals("+"))
            {
                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a + b);
            }
            else{
                 st.push(Integer.parseInt(ch));
            }
       }

       while(!st.empty())
       {
            sum+=st.pop(); 
       }

       return sum;
    }
}