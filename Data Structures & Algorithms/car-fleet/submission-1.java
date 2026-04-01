class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    TreeMap<Integer,Integer>map=new TreeMap<>(Collections.reverseOrder());
    Stack<Double>st=new Stack<>();
    for(int i=0;i<speed.length;i++)
    {
        map.put(position[i],speed[i]);
    } 
    for(Integer pos:map.keySet())
    {
         st.push((double)(target-pos)/(map.get(pos)));
         if(st.size()>=2)
         {
            double t1=st.pop();//(car behind)
           double t2=st.pop();//(car ahead)
            // st.push(t1);st.push(t2);
            if(t1<=t2)
               st.push(t2);
               else
               {
                st.push(t2);st.push(t1);
               }
         }
    }
    return st.size();
    }
}
