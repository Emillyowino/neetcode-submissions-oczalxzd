class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       for (char c : s.toCharArray()) { // place opening brackets in stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else { // closing brackets
                // check is the stack is empty - no opening brackets for the closing
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char comp = stack.peek(); // the opening bracket!!
                    if (comp == '(' && c == ')') {
                        stack.pop();
                    } else if (comp == '[' && c == ']') {
                        stack.pop();
                    } else if (comp == '{' && c == '}') {
                        stack.pop();
                    } else { // don't match
                        return false;
                    }
                
                }

            }
       }
       if (!stack.isEmpty()) return false; // more opening brackets than closing
       return true;
    }
}
