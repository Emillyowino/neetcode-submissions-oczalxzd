class Solution {
    public boolean isAnagram(String s, String t) {
        int slength = s.length();
        int tlength = t.length();
        if (slength != tlength) {
            return false;
        }

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < slength; i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < tlength; i++) {
            if (list.contains(t.charAt(i))) {
                list.remove((Object) t.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
