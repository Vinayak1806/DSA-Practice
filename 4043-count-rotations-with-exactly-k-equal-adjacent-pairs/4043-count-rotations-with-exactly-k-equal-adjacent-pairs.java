class Solution {

    public int countRotations(String s, int k) {

        int n = s.length();
        int ans = 0;

        for (int start = 0; start < n; start++) {

            int score = 0;

            for (int i = 0; i < n - 1; i++) {

                char a = s.charAt((start + i) % n);
                char b = s.charAt((start + i + 1) % n);

                if (a == b) {
                    score++;
                }
            }

            if (score == k) {
                ans++;
            }
        }

        return ans;
    }
}