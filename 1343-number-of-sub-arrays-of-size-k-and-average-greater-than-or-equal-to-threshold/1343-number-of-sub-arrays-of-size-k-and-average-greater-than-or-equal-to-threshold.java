class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low = 0 ;
        int sum = 0;
        int avarage=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
            avarage=sum/k;
        }
        int result=avarage;
        if(result>=threshold)
            {
                count++;
            }
        for(int i=k;i<arr.length;i++)
        {
            sum=sum-arr[low]+arr[i];
            low++;
            result=sum/k;            
            if(result>=threshold)
            {
                count++;
            }
        }
        return count;
    }
}