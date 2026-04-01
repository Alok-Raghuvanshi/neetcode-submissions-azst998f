class Solution {
     class Pair {
        int i;
        int d;
        Pair(int i,int d) {
            this.i=i;
            this.d=d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a,b) ->Integer.compare(b.d,a.d)
);
        int r=points.length;
        for(int i=0;i<r;i++)
        {
          int x = points[i][0];
           int y = points[i][1];
          int d = x*x + y*y;
          pq.add(new Pair(i,d));
          if(pq.size()>k)
          pq.poll();
        }
       int ans[][]=new int[k][2];
       for(int i=0;i<k;i++)
       {
        Pair p = pq.poll();
        ans[i][0] = points[p.i][0];
        ans[i][1] = points[p.i][1];
       }
       return ans;
    }
}
