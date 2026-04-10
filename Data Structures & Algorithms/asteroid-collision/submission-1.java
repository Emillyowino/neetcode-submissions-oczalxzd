class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s1 = new Stack<>();
        int x = 0;
        int y = 0;
        for (int i = 0, j = asteroids.length; i < j; i++) {
            y = asteroids[i];
            while (!s1.empty() && y < 0 && s1.peek() > 0) {
                x = s1.pop();
                if (Math.abs(x) > Math.abs(y)) {
                    s1.push(x);
                    y = 0;
                } else if (Math.abs(x) == Math.abs(y)) {
                    y = 0;
                } 
            }
            if (y != 0) {
                s1.push(y);
            }
        }
        
        Iterator<Integer> iterator = s1.iterator();
        int[] rem = new int[s1.size()];
        int k = 0;
        while (iterator.hasNext()) {
            int n = iterator.next();
            rem[k] = n;
            k++;
        }
        return rem;
    }
}