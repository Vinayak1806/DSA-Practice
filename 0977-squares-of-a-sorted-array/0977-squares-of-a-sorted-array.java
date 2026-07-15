class Solution {
    
    public int[] sortedSquares(int[] nums) {

        int res[] = new int[nums.length];
        int num[] = new int[nums.length];
        
        int n = 0, m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                num[n] = nums[i] * nums[i];
                n++;
            } else {
                res[m] = nums[i] * nums[i];
                m++;
            }
        }

        int i = n - 1;
        int j = 0;
        int id = 0;

        while (i >= 0 && j < m) {

            if (num[i] <= res[j]) {
                nums[id] = num[i];
                i--;
                id++;
            } else {
                nums[id] = res[j];
                j++;
                id++;
            }
        }
        while (i >= 0) {
            nums[id] = num[i];
            i--;
            id++;
        }
        while (j < m) {
            nums[id] = res[j];
            j++;
            id++;
        }
        
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");

        }
        return nums;
    }
}