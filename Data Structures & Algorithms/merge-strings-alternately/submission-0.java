class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        String ans = "";
        String a1 = "";
        String a2 = "";
        // find the shortest word - to avoid out of bounds
        if (length1 < length2) { //word1 short
            a2 = word2.substring(length1, length2);
        } else if (length2 < length1) {
            a1 = word1.substring(length2, length1);
        }
        for (; index < Math.min(length1, length2); index++) {
            ans = ans + word1.charAt(index) + word2.charAt(index); 
        }
        return ans + a1 + a2;
    }
}