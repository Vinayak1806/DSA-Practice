// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int low =0;
//         int high= nums.length-1;
//         int[] res = {-1, -1};

//         while(low <= high)
//         {
//             int mid = (low+high)/2;

//             if (nums[mid] == target) 
//             {
//                 res[0] = mid;
//                 res[1] = mid;

//                 int i = mid - 1;
//                 while (i >= 0 && nums[i] == target) {
//                     res[0] = i;
//                     i--;
//                 }

//                 int j = mid + 1;
//                 while (j < nums.length && nums[j] == target) {
//                     res[1] = j;
//                     j++;
//                 }
//                 return res;
//             }
//             else if(nums[mid] > target)
//             {
//                 high=mid-1;
//             }
//             else{                
//                 low = mid + 1;
//             }
//         }
//         return res;
//     }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] res = {-1, -1};

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                res[0] = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                res[1] = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }
}