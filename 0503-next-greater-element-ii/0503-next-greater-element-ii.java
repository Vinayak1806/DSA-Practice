// Non- Circular version // 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            st.push(nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if (st.empty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            st.push(nums[i]);
        }
        return result;
    }
}


// Circular version // 

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         Stack<Integer> st = new Stack<>();
        
//         for (int i = 2 * n - 1; i >= 0; i--) {
//             int index = i % n;

//             while (!st.empty() && st.peek() <= nums[index]) {
//                 st.pop();
//             }

//             if (i < n) {
//                 if (st.empty()) {
//                     result[index] = -1;
//                 } else {
//                     result[index] = st.peek();
//                 }
//             }

//             st.push(nums[index]);
//         }

//         return result;
//     }
// }
