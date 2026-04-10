class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        for (int i = 0, n = temperatures.length; i < n; i++) {
            int count = 0;
            boolean b = false;
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] <= temperatures[i]) {
                    count++;
                } else {
                    count++;
                    temperatures[i] = count;
                    b = true;
                    break;
                }
            }
            if (!b) {
                temperatures[i] = 0;
            }
        }
        return temperatures;
    }
}
