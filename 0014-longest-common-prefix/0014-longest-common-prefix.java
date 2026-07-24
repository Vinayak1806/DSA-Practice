class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {

            // Reduce prefix until it matches the start of current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
