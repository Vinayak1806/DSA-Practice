class Solution {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        int small=Integer.MAX_VALUE;
        int smallest=Integer.MAX_VALUE;

        for (int i = 0; i<nums.length ;i++)
        {
            if (nums[i] >= largest) 
            {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
            } 
            else if (nums[i] >= secondLargest) 
            {
                thirdLargest = secondLargest;
                secondLargest = nums[i];
            } 
            else if (nums[i] > thirdLargest) 
            {
                thirdLargest = nums[i];
            }  

            if(nums[i]<=smallest)
            {
                small=smallest;
                smallest=nums[i];
            }        
            else if(nums[i]<small)
            {
                small=nums[i];
            }
        }     
        int Masi = Math.max(largest * thirdLargest * secondLargest, largest* small* smallest)  ;
        return Masi;
    }
}
