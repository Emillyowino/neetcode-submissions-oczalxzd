class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0, j = s.length() - 1, k = 1; i < j; i++, k++) {
            int c1 = s.charAt(i);
            int c2 = s.charAt(k);
            sum += Math.abs(c1 - c2);
        }
        return sum;
    }
}