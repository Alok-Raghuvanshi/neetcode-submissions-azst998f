class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      Deque<Integer>dq=new ArrayDeque<>();
      int index=0;
      int a[]=new int[nums.length+1-k];
      for(int i=0;i<nums.length;i++)
      {
        while(!dq.isEmpty()&&dq.peekFirst()<=i-k)//checking if first element is out of window..?
        dq.pollFirst();
        while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])//finding first k decreasing element ..
        dq.pollLast();
        
        dq.addLast(i);
        if(i>=k-1)
        a[index++]=nums[dq.peekFirst()];
      }
      return a;
    }
}
