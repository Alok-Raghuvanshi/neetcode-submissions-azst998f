class TimeMap {
         HashMap<String,String []>map=new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key))
        {
            String a[]=map.get(key);
            a[timestamp]=value;
            //map.put(key,a);  no need to put as array is reference type
        }
        else
        {
            String ts[]=new String[10000000];
            ts[timestamp]=value;
            map.put(key,ts);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        return "";
        String a[]=map.get(key);
        if(a[timestamp]!=null)
        return a[timestamp];
        else
        {
            while(timestamp>=0)
            {
              if(a[timestamp]!=null)
              return a[timestamp];
              else
              timestamp--;  
            }
            return "";
        }
    }
}
