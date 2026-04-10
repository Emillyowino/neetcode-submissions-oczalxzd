class Solution {
    public int[] replaceElements(int[] arr) {
        int j = arr.length;
        for (int i = 0; i < j - 1; i++) {
            int max = 0;
            for (int k = i + 1; k < j; k++) {
                max = Math.max(arr[k], max);
            }
            arr[i] = max;
        }
        arr[j - 1] = -1;
        return arr;
    }
}