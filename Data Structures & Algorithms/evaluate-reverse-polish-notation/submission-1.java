class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int x = 0;
        int y = 0;
        for (String token : tokens) {
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") 
            && !token.equals("/")) {
                int i = Integer.parseInt(token);
                st.push(i);
            }

            if (token.equals("+")) {
                x = st.pop() + st.pop();
                st.push(x);
            } else if (token.equals("*")) {
                x = st.pop() * st.pop();
                st.push(x);
            } else if (token.equals("-")) {
                y = st.pop();
                x = st.pop() - y;
                st.push(x);
            } else if (token.equals("/")) {
                y = st.pop();
                x = st.pop() / y;
                st.push(x);
            }
        }
        return st.peek();
    } 
}
