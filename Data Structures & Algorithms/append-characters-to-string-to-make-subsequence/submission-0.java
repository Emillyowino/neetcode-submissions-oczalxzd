class Solution {
    public int appendCharacters(String s, String t) {
        // SOLVING USIG 2 POINTERS 
        int lengths = s.length();
        int lengtht = t.length();
        // pointer in string t
        int intt = 0;

        for (int ints = 0; ints < lengths; ints++) {
            if (intt == lengtht) break;
            char chars = s.charAt(ints);
            char chart = t.charAt(intt);
            if (chars == chart) {
                intt++;
            }
        }
        return lengtht - intt;
    }
}