class TimeMap {
         HashMap<String,List<Pair>>map=new HashMap<>();
    public TimeMap() {
   
    }
    class Pair
    {
        int timestamp;
        String val;
        Pair(int t,String v)
        {
            timestamp=t;
            val=v;
        }
    }
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key))
        {
            List<Pair>p=map.get(key);
            
            p.add(new Pair(timestamp,value));
            //map.put(key,a);  no need to put as array is reference type
        }
        else
        {
            List<Pair>p=new ArrayList<>();
            p.add(new Pair(timestamp,value));
            map.put(key,p);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
         List<Pair> list = map.get(key);
        int low = 0;
        int high = list.size() - 1;

        String result = "";
        while(low<=high)
        {
             int mid=(low+high)/2;
             if(list.get(mid).timestamp<=timestamp)
             {
                result=list.get(mid).val;
                low=mid+1;
             }
             else
             high=mid-1;
        }
        return result;
    }
}
