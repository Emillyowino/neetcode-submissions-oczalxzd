class StockSpanner {
    List<Integer> stockSpanner;
    public StockSpanner() {
        this.stockSpanner = new ArrayList<>();
    }
    
    public int next(int price) {
        stockSpanner.add(price);
        int count = 0;
        if (stockSpanner.size() == 0) {
            return count;
        } 
        for (int i = stockSpanner.size() - 1; i >= 0; i--) {
            int n = stockSpanner.get(i);
            if (n <= price) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */