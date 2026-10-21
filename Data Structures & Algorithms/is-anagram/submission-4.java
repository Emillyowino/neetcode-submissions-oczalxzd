class Solution {
    public boolean isAnagram(String s, String t) {
        // 2 keys compare?
        // convert to arrays - sort - check if equal
        // add subtract - using array of size 26
        int[] freq = new int[26];
        if (s.length() != t.length()) return false;
        int n = s.length();
        for (int i = 0; i < n; i++) { // s - adds, t subtract
            freq[s.charAt(i) - 'a'] += 1;
            freq[t.charAt(i) - 'a'] -= 1;
        }

        for (int num : freq) {
            if (num != 0) return false;
        }
        return true;






























        /* char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sorteds = new String(sArray); 
        String sortedt = new String(tArray); 

        return sorteds.equals(sortedt);

 */


















       /*  // not same length - cant be anagrams
        if (s.length() != t.length()) return false;
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
 */
















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
