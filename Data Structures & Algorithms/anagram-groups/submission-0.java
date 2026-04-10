class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
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
        return list;
    }
}
