class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
      List<List<Integer>>outer=new ArrayList<>();
      List<Integer>l=new ArrayList<>();
      sum(0,target,candidates,outer,l);
      return outer;
    }
    void sum(int i,int t,int cand[],List<List<Integer>>outer,List<Integer>l)
    {  
        if(t==0){
    outer.add(new ArrayList<>(l));
       return; 
        }
        if(i==cand.length) return;
        for(int j = i; j < cand.length; j++) {

            //  skip duplicates (MAIN FIX)
            if(j>i&&cand[j]==cand[j-1]) continue;
            if(cand[j]>t)break;
            l.add(cand[j]);
            sum(j+1,t-cand[j],cand,outer,l);
            l.remove(l.size()-1);
        }
    }
}
