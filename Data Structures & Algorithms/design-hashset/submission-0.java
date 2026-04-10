class MyHashSet {
    private ArrayList<Integer> list;

    public MyHashSet() {
        this.list = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }
    
    public void remove(int key) {
        while (list.contains(key)) {   
            list.remove((Object) key);
        }
        
    }
    
    public boolean contains(int key) {
        for (int i : list) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */