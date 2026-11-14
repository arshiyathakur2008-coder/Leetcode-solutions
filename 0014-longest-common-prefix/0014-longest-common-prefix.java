class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Take the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {

            // Check whether the current string starts with prefix
            while (!strs[i].startsWith(prefix)) {

                // Remove the last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, return empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
