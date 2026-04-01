class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        
        List<List<Integer>>outer=new ArrayList<>();
        int i=0;int j=1;int k=n-1;
     while(i<n-2)
     {
        if(i>0&&nums[i]==nums[i-1])
        {
            i++;
        continue;
        }
        j=i+1;
         k=n-1;
         
        while(j<k)
        {
        int sum=(-nums[i]);
        if(nums[j]+nums[k]==sum&&j!=k)
        {
            
        List<Integer>inner=new ArrayList<>();
        inner.add(nums[i]);
        inner.add(nums[j]);
        inner.add(nums[k]);
        outer.add(inner);
        //skipping dulicates by looking back
        
         j++;
         k--;

       while(j<k && nums[j]==nums[j-1]) j++;
       while(j<k && nums[k]==nums[k+1]) k--;
        }
        else if((nums[j]+nums[k])<sum)
        j++;
        else
        k--;
        }
        i++;   
     }  
     return outer; 
    }
}
