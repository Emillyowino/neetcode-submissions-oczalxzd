class MinStack {
    private ArrayList<Integer> nums;
    private int min;

    public MinStack() {
        this.nums = new ArrayList<>();
        this.min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        nums.add(val);
    }
    
    public void pop() {
        nums.remove(nums.size() - 1);
    }
    
    public int top() {
        return nums.get(nums.size() - 1);
    }
    
    public int getMin() {
        min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min; 

    }
}
