class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>tree=new HashMap<>(); 
       for(int num:nums)
       {
        tree.put(num,tree.getOrDefault(num,0)+1);
       }
       int a[]=new int[k];int t=0;
       List<Integer>el=new ArrayList<>();
       List<Integer>freq=new ArrayList<>();
       for(Map.Entry<Integer,Integer>entry:tree.entrySet())
       {
        el.add(entry.getKey());
        freq.add(entry.getValue());
       }
    
       for(int i=0;i<k;i++)
       {
        int max = Collections.max(freq);
        int index = freq.indexOf(max);
        a[i]=el.get(index);
       freq.set(index,-1);
       }
       return a;
    }
}