class Solution {
    public int thirdMax(int[] nums) {

        HashSet<Integer> map = new HashSet<>();

        for (int num : nums) {
            map.add(num);
        }

        Integer[] arr = map.toArray(new Integer[0]);

        Arrays.sort(arr, Collections.reverseOrder());

        if (map.size() < 3) {
            return arr[0];
        }

        return arr[2];
    }
}