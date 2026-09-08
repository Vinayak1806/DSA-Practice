// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (map.containsKey(nums[i])) {
//                 return nums[i];
//             }
//             map.put(nums[i], 1);
//         }

//         return -1;
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast =0;

        while(true)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];

            if(slow==fast)
            {
                break;
            }
        }    
          slow=0;

            while(slow!=fast)
            {
                slow=nums[slow];
                fast=nums[fast];
            }
        
        return slow;
 
  }  
}          