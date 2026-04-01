class KthLargest {
PriorityQueue<Integer>pq=new PriorityQueue<>();
int k;int nums[]=new int[1000];
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
        for(int n:nums)
        {
             pq.add(n);
            if(pq.size()>k)
            pq.poll();
       
        }
    }
    
    public int add(int val) {   
            pq.add(val);
          if(pq.size() > k)
              pq.poll();
        return pq.peek();
    }
}
