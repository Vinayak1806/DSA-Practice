class Solution {
    public int largestAltitude(int[] gain) {

    int[] prefix = new int[gain.length];
    int result=0;

    prefix[0] = gain[0];
    
    result=Math.max(result,prefix[0]);


    for (int i = 1; i < gain.length; i++) {
        prefix[i] = prefix[i - 1] + gain[i];

        result=Math.max(result,prefix[i]);
    }
    return result;
       
    }
}