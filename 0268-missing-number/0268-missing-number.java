// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);

//         for(int i=0;i<n;i++)
//         {
//             if(nums[i]!= i)
//             {
//                 return i;
//             }
//         }
//         return n;
//     }
// }


class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<n;i++)
        {
            actualsum+=nums[i];
        }
        return sum-actualsum;
    }
}
