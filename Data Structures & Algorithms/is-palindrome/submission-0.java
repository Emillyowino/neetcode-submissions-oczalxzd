class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for (int i = 0, j = s.length(); i < j; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                list.add(c);
            }
        }
        for (int i = 0, j = list.size() / 2, k = j = list.size() - 1; i < j; i++, k--) {
            char c1 = list.get(i);
            char c2 = list.get(k);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
