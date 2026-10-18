class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        if (s1.equals(s2)) return true;

        int[] need = new int[26];
        int[] have = new int[26];

        for (char c : s1.toCharArray()) {
            need[c-'a'] += 1;
        }

        for (int i = 0; i < s1.length(); i++) {
            have[s2.charAt(i) -'a'] += 1;
        }

        if (Arrays.equals(have, need)) return true;

        int left = 0;
        int right = s1.length() - 1;

        while (right + 1 < s2.length()) { // moving window
            right = right + 1;
            have[s2.charAt(right) -'a'] += 1;
            have[s2.charAt(left) -'a'] -= 1;
            left = left + 1;
            if (Arrays.equals(have, need)) return true;
        }
        return false;
    }
}
