class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      Arrays.sort(nums);
        List<List<Integer>>outer=new ArrayList<>();
      List<Integer>l=new ArrayList<>();
      subsets(0,nums,outer,l);
      return outer;
    }
   void subsets(int i,int nums[],List<List<Integer>>outer,List<Integer>l)
    {
      outer.add(new ArrayList<>(l));
      
      for(int j=i;j<nums.length;j++)
      {
        if(j>i&&nums[j]==nums[j-1])
        continue;
        l.add(nums[j]);
        subsets(j+1,nums,outer,l);
        l.remove(l.size()-1);
      }
    }
}
