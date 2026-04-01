class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        int count=0;
        int max=0;
      for(int num:nums)
      {
    map.add(num);
      } 
      for(int key:map)
      {     
        if(!map.contains(key-1))
        count=conseq(key,map,1);
        max=Math.max(max,count);
      }
      return max;
    }
    int conseq(int key,HashSet<Integer>map,int count)
    {
       
        if(map.contains(key+1))
        {
         return conseq(key+1,map,count+1);
        }
        else
        return count;
    }
}
