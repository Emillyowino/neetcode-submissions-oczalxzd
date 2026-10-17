class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int n = 0;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (map.isEmpty()) { // s over - t not over
                return false;
            } else { 
                if (map.containsKey(c)) { // character is in both
                    n = map.get(c);
                    if (n == 1) {
                        map.remove(c);
                    } else {
                        map.put(c, n - 1); 
                    }
                } else {
                    return false; // character in t, not in s
                }                      
            }
        }

        return map.isEmpty() ? true : false;
    }
}
