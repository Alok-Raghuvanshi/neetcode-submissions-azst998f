class Solution {
    public int leastInterval(char[] tasks, int n) {
      HashMap<Character,Integer>map=new HashMap<>();
      PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
      List<Integer>l=new ArrayList<>();
      int t=0;
      for(char ch:tasks)
      map.put(ch,map.getOrDefault(ch,0)+1);
      for(Map.Entry<Character,Integer>entry:map.entrySet())
      {
        pq.add(entry.getValue());
      }   
      while(!pq.isEmpty())
      {
        if(pq.peek()-1==0)
        {
            pq.poll();
            t++;
            continue;
        }
        int freq=pq.poll();
        l.add(freq-1);
        t++;
        for(int i=1;i<=n;i++)
        {
            if(pq.isEmpty()) {
                t=t+(n-i+1);
                break;
            }
            if(pq.peek()-1==0) pq.poll();
            else
          l.add(pq.poll()-1);
          t++;
        }
        for(int g:l) pq.add(g);
        l.clear();
      }
      return t;
    }
}
