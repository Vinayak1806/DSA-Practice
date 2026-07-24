class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] count = new int[10];

        for (int digit : digits) {
            count[digit]++;
        }

        int[] temp = new int[450];
        int index = 0;

        for (int number = 100; number <= 998; number += 2) {

            int a = number / 100;
            int b = (number / 10) % 10;
            int c = number % 10;

            count[a]--;
            count[b]--;
            count[c]--;

            if (count[a] >= 0 && count[b] >= 0 && count[c] >= 0) {
                temp[index++] = number;
            }

            count[a]++;
            count[b]++;
            count[c]++;
        }

        return java.util.Arrays.copyOf(temp, index);
    }
}