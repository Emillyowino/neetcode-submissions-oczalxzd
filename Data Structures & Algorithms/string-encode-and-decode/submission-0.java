class Solution {

    public String encode(List<String> strs) {
        // i distinguish one from another using the length followed by the # delimeter
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            int n = str.length();
            sb.append(n).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        while (str.length() != 0) {           
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (str.charAt(i) != '#') { // getting string length
                sb.append(str.charAt(i));
                i += 1;
            }  
            str = str.substring(i + 1); // removes length and delimeter
            int n = Integer.parseInt(sb.toString());
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < n; j++) {
                word.append(str.charAt(j));
            }
            decoded.add(word.toString());
            str = str.substring(n); // leaves me at the next wrd length ?
        }
        return decoded;
    }
}
