class Solution {
    // helper function to check if 2 strings are anagrams ? 
    // it'd have to check if anagrams and for that to check from all our anagrams that we have, maybe it receives a list and the word, it loops through and sees if it is an anagram of any if yes, return the one it is anagram with
    // how do i know ooh add to this list or that? 
    // maybe it receives a list within a list checks just an item in the list, returns the innerlist added?
    /* private Boolean anagram(String comp, String str) {
        if (comp.length() != str.length()) return false;
        if (comp.equals(str)) return true;

        Map<Character, Integer> mapc = new HashMap<>();
        Map<Character, Integer> maps = new HashMap<>();
        for (char c : comp.toCharArray()) {
            mapc.put(c, mapc.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }

        return mapc.equals(maps);

    } */
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String temp = new String(array);
            if (map.containsKey(temp)) {
                map.get(temp).add(str);
            } else {
                List<String> inner = new ArrayList<>();
                inner.add(str);
                map.put(temp, inner);
            }
        }

        List<List<String>> list = new ArrayList<>();
        int size = map.size();
        for (String s : map.keySet()) { // iterating over the keys of map to get value
            list.add(map.get(s));
        }
        return list;
        














        


        /* List<List<String>> list = new ArrayList<>();
        Boolean b = false;
        
        for (String str : strs) {
            if (!list.isEmpty()) {
                int size = list.size();
                b = false;
                for (int i = 0; i < size; i++) {
                    String comp = list.get(i).get(0);
                    if (anagram(comp, str)) {
                        list.get(i).add(str);
                        b = true; // check other items in the list - how do i know we've checked the other items and not successful?
                    }
                }
                if (!b) {
                    List<String> innerlist = new ArrayList<>(); 
                    innerlist.add(str);
                    list.add(innerlist);
                }

            } else {
                List<String> innerlist = new ArrayList<>();
                innerlist.add(str);
                list.add(innerlist);
            }
        }
        return list;

 */




























        
/*         List<List<String>> list = new ArrayList<>();
        List<HashMap<Character, Integer>> listmap = new ArrayList<>();
        if (strs.length == 0) {
            return list;
        }
        if (strs.length == 1) {
            List<String> list1 = new ArrayList<>();
            list1.add(strs[0]);
            list.add(list1);
            return list;
        }

        for (String str : strs) {
            List<String> list1 = new ArrayList<>();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0, j = str.length(); i < j; i++) {
                char c = str.charAt(i);
                map.put(c, map.getOrDefault((Object) c, 0) + 1);
            }
            if (listmap.contains(map)) {
                int index = listmap.indexOf(map);
                list.get(index).add(str);
            } else {
                list1.add(str);
                list.add(list1);

                listmap.add(map);
            }
        }
        return list; */
    }
}
