class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!set.add(c)) { // not added
                count = count + 2;
                set.remove(c);
            } else { // item added
                set.add(c);
            }
        }
        if (!set.isEmpty()) { // set not empty
            count++;
            return count;
        } else {
            return count;
        }
    }
}