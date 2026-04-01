class LRUCache {
         int nodes=0;
         HashMap<Integer,Integer>map=new HashMap<>();
         LinkedList<Integer>ll=new LinkedList<>();
         int capacity;
    public LRUCache(int capacity) {
      this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            ll.remove(Integer.valueOf(key));
            ll.add(key);
        return map.get(key);
        }
        else
        return -1;
    }
    
    public void put(int key, int value) {
         if(capacity == 0) return;
        if(map.containsKey(key))
        {    
          ll.remove(Integer.valueOf(key));
        }
        else if(map.size()==capacity)
        {
            map.remove(ll.getFirst());
          ll.removeFirst();
        }
        
          map.put(key,value);
          ll.add(key);
          
    }
}
