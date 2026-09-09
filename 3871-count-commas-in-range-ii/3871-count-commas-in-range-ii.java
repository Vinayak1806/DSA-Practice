class Solution {
    public Long countCommas(Long n) {
        long count = 0;

        for (long power = 1000; power <= n; power *= 1000) {
            count += n - power + 1;
        }

        return count;
    }
}