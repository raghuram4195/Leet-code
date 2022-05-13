class MyHashMap {
    int[] arr ;
    public MyHashMap() {
       arr = new int[1000001]; 
    }
    
    public void put(int key, int value) {
        if(value==0)
            value=-1;
        arr[key] = value;
    }
    
    public int get(int key) {
        if(arr[key]==0)
            return -1;
        else if (arr[key]==-1)
            return 0;
        else
            return arr[key];
    }
    
    public void remove(int key) {
        arr[key]=0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */