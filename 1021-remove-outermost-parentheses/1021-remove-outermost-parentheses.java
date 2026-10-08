class Solution {
    public String removeOuterParentheses(String s) {

        char[] result = new char[s.length()];
        int index = 0;
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                if (depth > 0) {
                    result[index] = ch;
                    index++;
                }

                depth++;
            }

            else {

                depth--;

                if (depth > 0) {
                    result[index] = ch;
                    index++;
                }
            }
        }

        return new String(result, 0, index);
    }
}