class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0, j = s.length; i < j; i++) {
            stack.push(s[i]);
        }

        int j = 0;
        while(!stack.empty()) {
            s[j] = stack.pop();
            j++;
        }
    }
}