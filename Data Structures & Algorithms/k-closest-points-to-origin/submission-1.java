class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] array = new int[k][2];
        int n = points.length;
        TreeMap<Double, Queue<int[]>> map = new TreeMap();
        for (int i = 0; i < n; i++) {
            int[] point = points[i];
            double distance = Math.pow(point[0], 2) + Math.pow(point[1], 2); // not 
            // a must to get root
            if (!map.containsKey(distance)) {
                Queue<int[]> queue = new LinkedList<>();
                queue.add(point);
                map.put(distance, queue);
            } else {
                map.get(distance).add(point);
            }
            // want to keep track of k distances - dustance st(TreeMap) and points(queue) then range search
        }

        // range searching the map
        // loop thru keys and store the values in an arrayList
        Queue<int[]> innerqueue = new LinkedList<>();
        for (Queue queue: map.values()) {
            while (!queue.isEmpty()) {
                innerqueue.add((int[]) queue.remove());
            }
        }

        for (int i = 0; i < k; i++) {
            array[i] = innerqueue.remove();
        }

        return array;
    }
}
