class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>sets=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        if(nums.length==0) return sets;
        subset(0,l,sets,nums);
        return sets;
    }
    void subset(int index,List<Integer>l,List<List<Integer>>sets,int nums[])
    {
      if(index==nums.length)
      sets.add(new ArrayList<>(l));
      else
      {    
        subset(index+1,l,sets,nums);//index helps to leave previous eelemnt and pick up new one
        l.add(nums[index]);
        subset(index+1,l,sets,nums); 
        l.remove(l.size()-1);//backtracking
      }   
    }
}
