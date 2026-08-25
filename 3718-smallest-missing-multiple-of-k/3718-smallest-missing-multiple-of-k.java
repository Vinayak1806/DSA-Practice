class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> map = new HashSet<>();
        for(int num: nums )
        {
            map.add(num);
        }
        int result = k;

        while (map.contains(result)) {
            result += k;
        }       
        return result;
    }
}