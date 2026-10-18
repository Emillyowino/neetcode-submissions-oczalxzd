class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        if (n == 1) return 1;

        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0, max = 0;
        char[] cArray = s.toCharArray();
     
        while (right < n) {
            char c = cArray[right]; 
            if (!seen.contains(c)) {
                seen.add(c);
                right += 1;
            } else {
                max = Math.max(right - left, max); 
                while (cArray[left] != c) {
                    seen.remove(cArray[left]);
                    left += 1;
                }
                left += 1;
                right += 1;
            }          
        }  
        return Math.max(max, seen.size());
    }
}
