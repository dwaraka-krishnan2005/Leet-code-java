class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize prefix with the first string
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character at the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, there is no commonality
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
