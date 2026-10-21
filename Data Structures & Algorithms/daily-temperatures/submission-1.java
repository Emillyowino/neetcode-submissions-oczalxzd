class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) { // finds the next warmer day
                if (temperatures[j] > temperatures[i]) {
                    count = j - i;
                    break;
                }
            }
            temperatures[i] = count;
        }
        temperatures[n - 1] = 0; // last day always 0
        return temperatures;
























        /* for (int i = 0, n = temperatures.length; i < n; i++) {
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
        return temperatures; */
    }
}
