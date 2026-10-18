class Solution {
    public boolean isAnagram(String s, String t) {
        // not same length - cant be anagrams
        if (s.length() != t.length()) return false;
        /* // add subtract ? prob: check if all values inside map r 0 at the end
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = sArray[i];
            char tc = tArray[i];
            map.put(sc, map.getOrDefault(sc, 0) + 1); // s adds
            map.put(tc, map.getOrDefault(tc, 0) - 1); // t subtracts
        }
        //check if all the map stuff r 0 else not. */

        // or put both stuff in map compare if both maps r equal;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = sArray[i];
            char tc = tArray[i];
            map1.put(sc, map1.getOrDefault(sc, 0) + 1); // s adds
            map2.put(tc, map2.getOrDefault(tc, 0) + 1); // t adds
        }
        return map1.equals(map2);

















       /*  Map<Character, Integer> map = new HashMap<>();
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

        return map.isEmpty() ? true : false; */
    }
}
