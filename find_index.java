class find_index {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        // If needle is longer than haystack, it can't be a part of it
        if (nLen > hLen) {
            return -1;
        }

        // Only loop up to (hLen - nLen) to avoid unnecessary checks
        for (int i = 0; i <= hLen - nLen; i++) {
            // Check if the substring starting at i matches needle
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
