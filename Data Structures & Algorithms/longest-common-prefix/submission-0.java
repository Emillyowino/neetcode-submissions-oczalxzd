class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        // at any point if one ends before the other, we stop!!
        // at any point indices not same, we stop!!
        // move along reducing? - perhaps string equals operator?
        String s = strs[0];
        String substr = "";
        for (int i = 1; i < strs.length; i++) {
            substr = strs[i];
            if (s.length() > substr.length()) {
                s = s.substring(0, substr.length()); // same length
            } else if (s.length() < substr.length()) {
                substr = substr.substring(0, s.length()); // same length
            }
            // same length
            while (!substr.equals(s)) { // one could be larger than the other? - SOLVED!!
                substr = substr.substring(0, substr.length() - 1);
                s = s.substring(0, s.length() - 1);
            }
        }

        return substr;
    }
}