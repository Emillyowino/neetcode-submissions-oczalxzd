class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                n = n / 10;
                sum += Math.pow(digit, 2);
            }
            if (sum == 1) return true;
            n = sum;
        }
        return false;
    }
}
