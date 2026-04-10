class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) {
            return true; // base case
        }

        // if equal lengths OR s > t but not same then it's not
        if (s.length() == t.length() || s.length() > t.length()) {
            return false;
        }

        // check first occurrence of first character in the stuff and continue
        // next iteration shld begin in the next index - index > the previous
        int i = 0;
        int index = 0;
        boolean b = false;
        // PROBLEM: We havent considered maybe 1st letter doesnt but other does
        for (char cs : s.toCharArray()) {
            b = false;
            for (int j = index; j < t.length(); j++) {
                char c = t.charAt(j);
                if (c == cs) {
                    i++;
                    index = j + 1;
                    b = true;
                    break;
                }
            }
            if (!b) return false;
        }
        return true;
    }
}