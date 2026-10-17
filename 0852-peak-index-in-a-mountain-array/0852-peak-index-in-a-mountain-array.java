class Solution {
    public int peakIndexInMountainArray(int[] arr) {
     int low = 0;
     int high= arr.length-1;
     int result = 0;
     int peek=0;
     while(low<high)
     {
        peek = (low+high)/2;

        if(arr[peek] < arr[peek+1])
        {
            low= peek +1;
        }
        else
        {
            result = peek;
            high=peek;
        }
      }  

      return low; 
    }
}