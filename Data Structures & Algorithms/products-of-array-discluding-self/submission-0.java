class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pl=1,pr=1;
        int al[]=new int[nums.length];
        int ar[]=new int[nums.length];
        int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
        pr=pr*nums[i];
        ar[i]=pr;

        pl=pl*nums[nums.length-i-1];
        al[nums.length-i-1]=pl;
       } 
      for(int i=0;i<ans.length;i++)
      {
        if(i>0&&i<ans.length-1)
        {
        int r=ar[i-1];
        int l=al[i+1];
        ans[i]=r*l;
        }
       else if(i==0)
        {
            ans[i]=al[i+1];
        }
        else if(i==ans.length-1)
        {
            ans[i]=ar[i-1];
        }
      }
      return ans;
    }
}