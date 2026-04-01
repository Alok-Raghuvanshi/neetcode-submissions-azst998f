class Solution {
    int sum=0;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>>sets=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        if(nums.length==0) return sets;
        subset(sum,0,l,sets,nums,target);
        return sets; 
    }
    void subset(int sum,int index,List<Integer>l,List<List<Integer>>sets,int nums[],int t)
    {
        if(sum > t) return;
      if(sum==t){
      sets.add(new ArrayList<>(l));
      return;
      }
      if(index == nums.length) return;
      else
      {    
        subset(sum,index+1,l,sets,nums,t);//index helps to leave previous eelemnt and pick up new one
        sum+=nums[index];
        l.add(nums[index]);
        subset(sum,index,l,sets,nums,t);
        sum-=l.get(l.size()-1); 
        l.remove(l.size()-1);//backtracking
        
      }   
    }
}
