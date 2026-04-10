class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> nums = new ArrayList<>();
        // Stack<Integer> ops = new Stack<>();

        for (int i = 0, j = operations.length; i < j; i++) {
            String s = operations[i];
            char c1 = s.charAt(0);
            int x = 0;
            if (c1 != 'C' && c1 != 'D' && c1 != '+') {
                int c = Integer.parseInt(s);
                nums.add(c);
            } 

            // int x = 0;

            /* if ( c != '+' && c != 'C' && c != 'D') {
                // x = c;
                nums.add(c);
                // ops.push(x);

            } else */
            
            if (c1 == '+') {
                x = nums.get(nums.size() - 1) + nums.get(nums.size() - 2);
                // x = ops.pop() + ops.pop();
                nums.add(x);
                // ops.push(x);
            } else if (c1 == 'C') {
                // nums.remove(ops.pop());
                nums.remove(nums.size() - 1);
            } else if (c1 == 'D') {
                // x = 2 * ops.pop();
                x = 2 * nums.get((nums.size() - 1));
                // ops.push(x);
                nums.add(x);
            }
        }

        int sum = 0;
        for (int i = 0, j = nums.size(); i < j; i++) {
            sum += nums.get(i);
        }

        return sum;
    }
}