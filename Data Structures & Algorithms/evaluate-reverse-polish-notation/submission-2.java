class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                int n = Integer.parseInt(token);
                stack.push(n);
            } else {
                int two = stack.pop(); 
                int one = stack.pop(); 
                int val = 0;
                if (token.equals("+")) {
                    val = one + two;
                } else if (token.equals("-")) {
                    val = one - two;
                } else if (token.equals("*")) {
                    val = one * two;
                } else {
                    val = one / two;
                }
                stack.push(val);
            }
           
        }
        return stack.pop();























       /*  Stack<Integer> st = new Stack<>();
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
        return st.peek(); */
    } 
}
