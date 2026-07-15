class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m + n];

        int i = 0;
        int j = 0;
        int id =0;

        while( i<m && j<n )
        {
            
            if(nums1[i] <= nums2[j])
            {
                res[id] = nums1[i];
                i++;
                id++;
            }
            else{
                res[id] = nums2[j];
                j++;
                id++;
            }
        }
        while(i<m){
                res[id] = nums1[i];
                i++;
                id++;
        }
        while(j<n){
                res[id] = nums2[j];
                j++;
                id++;
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = res[k];
        }
    }
}